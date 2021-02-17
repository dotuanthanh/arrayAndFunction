import java.util.Scanner;

public class gopMang {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int size=scanner.nextInt();
        int[] arr1= new int[size];
        int[] arr2= new int[size];
        int[] arr3= new int[size];
        //input arr1 && arr2
        for(int  i =0 ;i<size-1;i++){
            System.out.println("nhap arr1["+i+"]");
            arr1[i]=scanner.nextInt();
        }  for(int  i =0 ;i<size-1;i++){
            System.out.println("nhap arr2["+i+"]");
            arr2[i]=scanner.nextInt();
        }
        for(int j=0;j<size;j++){
            arr3[j]=arr1[j]+arr2[j];
        }
        
    }
}
