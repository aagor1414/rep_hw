package lesson_1_HW;

import java.util.Scanner;

public class Main {

    private static Scanner scanner = new Scanner(System.in);


    public static void main(String[] args) {
        testVars();
        calcMath();
        testSum();
        defNumber();
        testNegativeNumber();
        printNameString();
        defineYear();
    }

    // Задание 2. Определяем переменные и выводим их в консоли.
    private static void testVars() {
        System.out.println("Задание 2. Определение переменных");
        byte varByte = 3;
        short varShort = 5;
        int varInt = 8;
        long varLong = 32;
        float varFloat = 254;
        double varDouble = 1024;
        char varChar = 'Z';
        boolean varBoolean = true;
        String varString = "Проверка переменной типа String";

        System.out.println(varByte);
        System.out.println(varShort);
        System.out.println(varInt);
        System.out.println(varLong);
        System.out.println(varFloat);
        System.out.println(varDouble);
        System.out.println(varChar);
        System.out.println(varBoolean);
        System.out.println(varString);
    }


    // Задание 3. Выполняем мат. вычисления с проверкой деления на 0
    private static float calcMath() {
        System.out.println("Задание 3. Вычисление арифметическог овыражения");
        Scanner scanner = new Scanner(System.in);
        float result = 0;
        System.out.println("Введите значение переменной a");
        float a = scanner.nextInt();
        System.out.println("Введите значение переменной b");
        float b = scanner.nextInt();
        System.out.println("Введите значение переменной c");
        float c = scanner.nextInt();
        System.out.println("Введите значение переменной d");
        float d = scanner.nextInt();
        if (d != 0) {
            result = (a * (b + (c / d)));
            System.out.println("Результат = " + result);
        } else {
            System.out.println("Деление на 0");
        }
        return result;
    }

    // Задание 4. Выполняем проверку попадания суммы двух чисел в диапазон от 10 до 20
    private static boolean testSum() {
        System.out.println("Задание 4. Выполняем проверку попадания суммы двух чисел в диапазон от 10 до 20");
        boolean mark;
        Scanner scanner = new Scanner(System.in);
        int summa;
        System.out.println("Введите значение переменной a");
        int a = scanner.nextInt();
        System.out.println("Введите значение переменной b");
        int b = scanner.nextInt();
        summa = a + b;
        if (summa >= 10 && summa <= 20) {
            mark = true;
        } else {
            mark = false;
        }
        System.out.println(mark);
        return mark;
    }
    // Задание 5. Выполняем проверку положительного или отрицательного числа
    private static void defNumber() {
        System.out.println("Задание 5. Выполняем проверку положительного или отрицательного числа");
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите число");
        int number = scanner.nextInt();
        if (number >= 0) {
            System.out.println(" Вы ввели положительное число");
        } else {
            System.out.println(" Вы ввели отрицательное число");
        }
    }

    // Задание 6. Выполняем проверку, отрицательное число или нет
    private static boolean testNegativeNumber() {
        System.out.println("Задание 6. Выполняем проверку, отрицательное число или нет");
        boolean mark = true;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите число для проверки");
        int number = scanner.nextInt();
        if (number < 0) {
            mark = true;
            System.out.println(" Вы ввели отрицательное число. Результат  " + mark);
        } else {
            System.out.println(" Вы ввели положительное число");
        }
        return mark;
    }


    // Задание 7. Получаем с клавиатуры имя и выводим в консоли приветствие
    private static void printNameString(){
        System.out.println("Задание 7. Получаем с клавиатуры имя и выводим в консоли приветствие");
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите Ваше имя");
        String name = scanner.nextLine();
        System.out.println("Привет, " + name + "!");
    }


    // Задание 8. Проверяем високосный год или нет.
    private static void defineYear() {
        System.out.println("Задание 8. Выполняем проверку, високосный год или нет");
        Scanner in =  new  Scanner(System.in);
        System.out.println("Введите год:");
        int year =in.nextInt();
        if(year%4 == 0 && year%100 != 0 || year%400 == 0){
            System.out.println("Это високосный год");
        } else {System.out.println("Это не високосный год");
        }

    }
}








