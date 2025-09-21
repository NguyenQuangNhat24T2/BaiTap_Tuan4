package BaiTap_Tuan4;
import java.util.Scanner;
public class Bai7_BichTien {
    public static void main(String[] args) {
        Scanner sc = new Scanner( System.in);
        System.out.print("Nhap so phan tu cua mang: ");
        int n = sc.nextInt();
        int[] arr = new int[n];
        int tong = 0;
        System.out.println("Nhap cac phan tu: ");
        for(int i=0;i<n;i++) {
            System.out.print("arr[" + i + "] = ");
            arr[i] = sc.nextInt();
            tong += arr[i];  
        }
        System.out.println("Tong cac phan tu trong mang = " + tong);
        sc.close();


    }
}
