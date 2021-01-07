package lesson_1;

import java.util.Random;

public class Main {

    public static void main(String[] args) {
	// write your code here

                Random rand = new Random();
                Actions[] actions = new Actions[3];

                int distance = rand.nextInt(10);
                int heigth = rand.nextInt(10);
                actions[0] = new Human("Boris", distance, heigth);

                distance = rand.nextInt(10);
                heigth = rand.nextInt(10);
                actions[1] = new Robot("R2D2", distance, heigth);

                distance = rand.nextInt(10);
                heigth = rand.nextInt(10);
                actions[2] = new Cat("Barsik", distance, heigth);

                Barrier[] barriers = new Barrier[6];

                boolean isRoad;
                for (int i = 0; i < barriers.length; i++) {
                    distance = rand.nextInt(10);
                    isRoad = rand.nextBoolean();
                    if (isRoad) {
                        barriers[i] = new Road("Дорожка " + i, distance);
                    } else {
                        barriers[i] = new Wall("Стена " + i, distance);
                    }
                }

                for (int i = 0; i < actions.length; i++) {
                    boolean result = true;
                    for (int j = 0; j < barriers.length; j++) {

                        result = barriers[j].moving(actions[i]);

                        if (!result) {
                            break;
                        }
                    }

                    if (result) {
                        System.out.println("Успешно!");
                    } else {
                        System.out.println("Неудача!");
                    }
                }
            }
    }

