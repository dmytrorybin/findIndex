package ua.epam;

import java.util.Arrays;

public class Main {

    public static void main(String[] args) {
        int[] arr = {4,5,7,3,5,8,5,6,5};

        int value = 5;
        Method m = new Method();
        int[] res = m.finder(arr, value);

        System.out.println(Arrays.toString(res));
    }
}
