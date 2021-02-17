package lesson34_3;

class Printer implements Runnable {
    private char toPrint;

    Printer(char toPrint) {
        this.toPrint = toPrint;
    }

    @Override
    public void run() {
        for (int i = 0; i < 5; i++) {
            synchronized (Main.lock) {
                try {
                    final MyChar myChar = Main.myChar;
                    while (myChar.getCurrentChar() != toPrint) {
                        Main.lock.wait();
                    }
                    System.out.print(toPrint);
                    myChar.increment();
                    Main.lock.notifyAll();
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        }
    }
}