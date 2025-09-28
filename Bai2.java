import java.util.Scanner;
//Bài 2: Viêt chương trình tìm số nhỏ nhất trong 3 số a, b, c nhập từ bàn phím
/*Trần Thị Thu Hiền */
public class Bai2_ThuHien
{
    public static void main(String[] args) throws Exception
    {
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhap so a: ");
        int a =sc.nextInt();
        System.out.print("Nhap so b: ");
        int b =sc.nextInt();
        System.out.print("Nhap so c: ");
        int c =sc.nextInt();

        int min = a;
        if(b < min)
            min = b;
        if(c < min)
            min = c;
    System.out.println("Số nhỏ nhất trong 3 số là ", +min);
    sc.close();
    }

}
