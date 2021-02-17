package lesson34_3;

public class Main {
    static final Object lock = new Object();
    final static MyChar myChar = new MyChar();
    public static void main(String[] args) {
        new Thread(new Printer('A')).start();
        new Thread(new Printer('B')).start();
        new Thread(new Printer('C')).start();
    }
}
