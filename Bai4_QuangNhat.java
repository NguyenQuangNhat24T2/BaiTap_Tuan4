import java.util.Scanner;
public class Bai4_QuangNhat 
{
    public static void main(String[] args) 
    {
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhap n: ");
        int n = sc.nextInt();
        int tong1 = 0;
        for (int i = 1; i <= n; i++) 
            tong1 += i;
        System.out.println("Tong = " + tong1);
        sc.close();
    }
}
