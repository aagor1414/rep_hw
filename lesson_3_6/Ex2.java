package lesson36_2;

import java.util.Arrays;

public class Ex2 {

    public static void main(String[] args) {
        int[] arr = {4,4,4,4,4,4,4,1,4,4,4,4,4};

        System.out.println(Arrays.toString(arr));
        System.out.println(checkArray(arr));
    }

    public static boolean checkArray(int[] mas) {
        boolean one = false;
        boolean four = false;

        for (int i = 0; i < mas.length; i++) {
            if (one & four) break;
            if (mas[i] == 1) one = true;
            if (mas[i] == 4) four = true;
        }

        return (one && four)?(true):(false);
    }
}
