package lesson34_3;

public class MyChar {
    private volatile char currentChar = 'A';
    private int counter;

    char getCurrentChar() {
        return currentChar;
    }

    synchronized void increment(){
        counter++;
        if (counter % 3 == 0)
            currentChar = 'A';
        else currentChar++;
    }
}
