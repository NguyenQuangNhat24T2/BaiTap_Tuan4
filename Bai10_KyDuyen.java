import java.util.ArrayList;
import java.util.Scanner;

public class Bai10_KyDuyen {
    
}
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList<Integer> list = new ArrayList<>();

        // Khoi tao danh sach ban dau
        list.add(10);
        list.add(20);
        list.add(30);
        list.add(40);

        System.out.println("Danh sach ban dau: " + list);

        // Them phan tu
        System.out.print("Nhap gia tri can them: ");
        int value = sc.nextInt();
        System.out.print("Nhap vi tri muon them (0 -> " + list.size() + "): ");
        int indexAdd = sc.nextInt();
        if (indexAdd >= 0 && indexAdd <= list.size()) {
            list.add(indexAdd, value);
        } else {
            System.out.println("Vi tri them khong hop le!");
        }
        System.out.println("Danh sach sau khi them: " + list);

        // Xoa phan tu
        System.out.print("Nhap vi tri muon xoa (0 -> " + (list.size() - 1) + "): ");
        int indexRemove = sc.nextInt();
        if (indexRemove >= 0 && indexRemove < list.size()) {
            list.remove(indexRemove);
        } else {
            System.out.println("Vi tri xoa khong hop le!");
        }
        System.out.println("Danh sach sau khi xoa: " + list);

        sc.close(); 
    }
}