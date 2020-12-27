package lesson_1;

public class Wall extends Barrier {

    private int heigth;

    public Wall(String name, int heigth) {
        super(name);

        this.heigth = heigth;
    }

    public int getHeigth() {
        return heigth;
    }

    @Override
    protected boolean moving(Actions actions) {
        System.out.println("The wall " + super.getName() + " heigth: " + this.heigth);

        actions.jump();

        if (getHeigth() <= actions.getJumpHeight()) {
            System.out.println("Прыжок отличный!");

            return true;
        } else {
            System.out.println("Прыжок слабый");

            return false;
        }
    }
}
