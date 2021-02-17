
import java.util.Scanner;

public class x {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int[] arr = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        System.out.println("nhap  vi tri x muon xoa ");
        int x = input.nextInt();
        for (int i = x; i < arr.length; i++) {
            arr[i] = arr[i+1];
        }
        for (int j = 0; j < arr.length-1; j++) {
            System.out.print(arr[j] + " ");
        }


    }}

