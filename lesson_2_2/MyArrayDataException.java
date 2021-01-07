package lesson_2;

public class MyArrayDataException extends NumberFormatException {
    public MyArrayDataException(int i, int j){
        super("Элемент массива (" + i + "," + j + ") не является числом");
    }
}
