import java.util.Scanner;

public class baiTap1 {
    public static void main(String[] args) {
        int[] arr = {4, 12, 7, 8, 0, 6, 9};
        int index = minValue(arr);
        System.out.println(" GTNN: " + arr[index]);
    }

    public static int minValue(int[] arr) {
        int min = arr[0];
        int index=0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] < min) {
                min = arr[i];
                index = i;
            }
        }
        return index;
    }
}
