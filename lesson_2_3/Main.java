package lesson_3;

import java.util.TreeMap;

public class Main {
        public static void main(String[] args) {

            String[] world = new String[10];
            world[0] = "Apple";
            world[1] = "Banana";
            world[2] = "Samsung";
            world[3] = "LG";
            world[4] = "LG";
            world[5] = "Car";
            world[6] = "Banana";
            world[7] = "Samsung";
            world[8] = "Apple";
            world[9] = "Sony";

            task1(world);

            task2();
        }

        public static void task1(String[] world){
        /*
        1	Создать массив с набором слов (10-20 слов, должны встречаться повторяющиеся).
        Найти и вывести список уникальных слов, из которых состоит массив (дубликаты не считаем).
        Посчитать, сколько раз встречается каждое слово
         */

            TreeMap<String, Integer> treeMap = new TreeMap<>();

            for (int i = 0; i< world.length; i++){
                if (treeMap.containsKey(world[i])){
                    treeMap.put(world[i], treeMap.get(world[i])+1);
                }else{
                    treeMap.put(world[i], 1);
                }
            }

            System.out.println(treeMap);
        }

        public static void task2(){
        /*
        2	Написать простой класс Телефонный Справочник, который хранит в себе список фамилий и телефонных номеров.
        В этот телефонный справочник с помощью метода add() можно добавлять записи, а с помощью метода get() искать номер телефона по фамилии.
        Следует учесть, что под одной фамилией может быть несколько телефонов (в случае однофамильцев),
        тогда при запросе такой фамилии должны выводиться все телефоны
         */

            PhoneList phoneList = new PhoneList();

            phoneList.add("Иванов", "79117658101");
            phoneList.add("Иванов", "79117658102");
            phoneList.add("Иванов", "79117658103");
            phoneList.add("Кузнецов", "79117658133");
            phoneList.add("Соколов", "79117658189");
            phoneList.add("Кузнецов", "79117658177");
            phoneList.add("Ильина", "79117658888");

            System.out.println("Иванов, телефонный номер(номера): " + (phoneList.get("Иванов")));
            System.out.println("Петров, телефонный номер(номера): " + (phoneList.get("Петров")));
            System.out.println("Кузнецов, телефонный номер(номера): " + (phoneList.get("Кузнецов")));
            System.out.println("Соколов, телефонный номер(номера): " + (phoneList.get("Соколов")));
            System.out.println("Ильина, телефонный номер(номера): " + (phoneList.get("Ильина")));
        }
 }

