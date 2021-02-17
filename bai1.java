import java.util.Scanner;

public class bai1 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Nhap size");
        int size = input.nextInt();
        int[] arrays = new int[size];
        for (int i = 0; i < arrays.length; i++) {
            System.out.println("nhap " + "arrays" + "[" + i + "]");
            arrays[i] = input.nextInt();
        }
        //Dao  cac  phan tu trong mang
        int j=  arrays.length-1;
        int temp;
        for(int  i=0; i<(arrays.length /2);i++){
            temp=arrays[i];
            arrays[i]=arrays[j];
            arrays[j]=temp;
            j--;
        }
        for(int i=0;i<arrays.length;i++){
            System.out.println(arrays[i]+" ");
        }
    }
}
