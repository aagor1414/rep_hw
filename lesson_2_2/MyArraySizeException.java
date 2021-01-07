package lesson_2;

public class MyArraySizeException extends IndexOutOfBoundsException {
    public MyArraySizeException(){
        super("Формат массива не соответствует размеру 4х4");
    }
}