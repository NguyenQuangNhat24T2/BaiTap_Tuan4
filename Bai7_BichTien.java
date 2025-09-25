package BaiTap_Tuan4;

import java.util.Scanner;

public class Bai7_BichTien {
   public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Nhap so phan tu cua mang: ");
        int n = sc.nextInt();

        int[] arr = new int[n];
        int sum = 0;

        for (int i = 0; i < n; i++) {
            System.out.print("Nhap phan tu thu " + (i + 1) + ": ");
            arr[i] = sc.nextInt();
            sum += arr[i];
        }

        System.out.println("Tong cac phan tu trong mang = " + sum);
        sc.close();
    }
     
}
