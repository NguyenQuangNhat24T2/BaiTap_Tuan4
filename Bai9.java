package BaiTap_Tuan4;
import java.util.Scanner;
public class Bai9 
{
    public static void main(String[] args) 
    {
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhap so phan tu cua mang: ");
        int n = sc.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) 
        {
            System.out.print("Nhap phan tu thu " + (i + 1) + ": ");
            arr[i] = sc.nextInt();
        }
        System.out.println("Danh sach cac so nguyen da nhap:");
        for (int i = 0; i < n; i++) 
            System.out.print(arr[i] + " ");
        System.out.println();
        sc.close();
    }    
}