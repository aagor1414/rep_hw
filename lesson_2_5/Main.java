package lesson_5_1;

import java.util.Arrays;

public class Main {
    private static final int size = 10000000;
    private static final int half_size = size / 2;

    public static void main(String [] args) {
        Main mainClass = new Main();
        mainClass.methodOne();
        mainClass.methodTwo();
    }
    private void methodOne() {
        System.out.println("Старт метода № 1");
        float[] arr = new float[size];
        Arrays.fill(arr, 1.0f);
        long start = System.currentTimeMillis();
        for (int i = 0; i < arr.length; i++) {
            arr[i] = (float) (arr[i] * Math.sin(0.2f + i / 5) * Math.cos(0.2f + i / 5) * Math.cos(0.4f + i / 2));
        }
        long end = System.currentTimeMillis();
        System.out.println(String.format("Завершение метода № 1. Время выполнения %s",String.valueOf(end - start)));
    }

    private void  methodTwo() {
        System.out.println("Старт метода № 2");
        float[] arr = new float[size];
        float[] arr1 = new float[half_size];
        float[] arr2 = new float[half_size];
        Arrays.fill(arr, 1.0f);
        long start = System.currentTimeMillis();
        System.arraycopy(arr,0,arr1,0, half_size);
        System.arraycopy(arr2,0,arr,half_size, half_size);
        long split = System.currentTimeMillis();
        System.out.println(String.format("Время разделения массива %s",String.valueOf(split - start)));

        Thread thread_1 = new Thread(() -> this.methodTwoInternal(arr1, 1));
        Thread thread_2 = new Thread(() -> this.methodTwoInternal(arr2, 2));

        thread_1.start();
        thread_2.start();

        try {
            thread_1.join();
            thread_2.join();
        } catch (InterruptedException e) {
            System.out.println(String.format("Исключение в потоках %s", e.getMessage()));
        }

        long connect = System.currentTimeMillis();
        System.arraycopy(arr,0,arr1,0, half_size);
        System.arraycopy(arr2,0,arr,half_size, half_size);
        long end = System.currentTimeMillis();
        System.out.println(String.format("Время выполнения склейки массива %s",String.valueOf(end - connect)));
        System.out.println(String.format("Завершение выполнения метода № 2. Время выполнения %s",String.valueOf(end - start)));
    }

    private void methodTwoInternal (float[] arr, int number) {
        long start = System.currentTimeMillis();
        for(int i = 0; i < arr.length; i++) {
            arr[i] = (float) (arr[i] * Math.sin(0.2f + i / 5) * Math.cos(0.2f + i / 5) * Math.cos(0.4f + i / 2));
        }
        long end = System.currentTimeMillis();
        System.out.println(String.format("Время выполнния потока %d равно %s", number, String.valueOf(end - start)));

    }
}
