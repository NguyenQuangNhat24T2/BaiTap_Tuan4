package BaiTap_Tuan4;

import java.util.Scanner;

public class Bai3_BichTien {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Nhap so thu nhat: ");
        int a = sc.nextInt();
        System.out.print("Nhap so thu hai: ");
        int b = sc.nextInt();

        System.out.print("Nhap phep tinh (+, -, *, /): ");
        char op = sc.next().charAt(0);

        switch (op) {
            case '+':
                System.out.println("Ket qua = " + (a + b));
                break;
            case '-':
                System.out.println("Ket qua = " + (a - b));
                break;
            case '*':
                System.out.println("Ket qua = " + (a * b));
                break;
            case '/':
                if (b != 0)
                    System.out.println("Ket qua = " + ((double) a / b));
                else
                    System.out.println("Khong the chia cho 0");
                break;
            default:
                System.out.println("Phep tinh khong hop le!");
        }
        sc.close();
    }
    
}
