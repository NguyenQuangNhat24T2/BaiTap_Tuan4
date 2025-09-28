package BaiTap_Tuan4;
import java.util.Scanner;

public class Bai1
{
    
    public static String kiemTraSo(double so) 
    {
        if (so > 0) {
            return "duong";
        } else if (so < 0) {
            return "am";
        } else {
            return "bang 0";
        }
    }
    
    public static double nhapSo() 
    {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Nhap mot so: ");
        double so = scanner.nextDouble();
        return so;
    }
    
    public static void main(String[] args) 
    {
        double so = nhapSo();
        String ketQua = kiemTraSo(so);
        System.out.println("So " +  so  + " la so " + ketQua);
    }
}