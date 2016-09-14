package ua.epam;

/**
 * Created by Dmytro_Rybin on 9/14/2016.
 */
public class Method {
    private int count = 0;

    private int isPresent(int[] arr, int value) {
        for (int i = 0; i < arr.length; i++) {
            if (value == arr[i]) {
                count++;
            }
        }
        return count;
    }

    public int[] finder(int[] arr, int value) {
        isPresent(arr, value);
        int j = 0;
        int [] res = new int[count];
        for (int i = 0; i < arr.length; i++) {
            if (value == arr[i]) {
                res[j++] = i;
            }
        }
        return res;
    }
}
