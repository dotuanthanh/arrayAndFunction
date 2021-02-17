import java.util.Scanner;

public class themPhanTuVaoMang {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Nhap phan tu x va chi  so k muon them  vao");
        int x = input.nextInt();
        int k = input.nextInt();
        int[] arr= {1,2,3,4,5,6,7,8,9,10};
        if(k>0 && k<arr.length){
        arr[k]=x;}
        for(int i =0;i<arr.length;i++){
            System.out.print(arr[i]+" ");
        }
    }
}
