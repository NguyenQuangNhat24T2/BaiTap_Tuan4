package BaiTap_Tuan4;
import java.util.Scanner;
public class Bai3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        double a, b, kq;
        int choice;

        do {
            System.out.println("===== MENU =====");
            System.out.println("1. Cong");
            System.out.println("2. Tru");
            System.out.println("3. Nhan");
            System.out.println("4. Chia");
            System.out.println("0. Thoat");
            System.out.print("Moi ban chon phep tinh: ");
            choice = sc.nextInt();
            if (choice == 0) {
                System.out.println("Ket thuc chuong trinh.");
                break;
            }
            System.out.print("Nhap so thu nhat: ");
            a = sc.nextDouble();
            System.out.print("Nhap so thu hai: ");
            b = sc.nextDouble();
            switch (choice) {
                case 1:
                    kq = a + b;
                    System.out.println("Ket qua: " + a + " + " + b + " = " + kq);
                    break;
                case 2:
                    kq = a - b;
                    System.out.println("Ket qua: " + a + " - " + b + " = " + kq);
                    break;
                case 3:
                    kq = a * b;
                    System.out.println("Ket qua: " + a + " * " + b + " = " + kq);
                    break;
                case 4:
                    if (b != 0) {
                        kq = a / b;
                        System.out.println("Ket qua: " + a + " / " + b + " = " + kq);
                    } else {
                        System.out.println("Loi: Khong the chia cho 0!");
                    }
                    break;
                default:
                    System.out.println("Lua chon khong hop le, vui long thu lai!");
            }
            System.out.println(); 
        } while (true);
        sc.close();
    }
}

