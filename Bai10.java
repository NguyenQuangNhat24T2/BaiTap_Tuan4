import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Bai10 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        try {
            System.out.print("Nhap so luong phan tu ban dau: ");
            int n = sc.nextInt();
            List<Integer> arr = new ArrayList<>();
            for (int i = 0; i < n; i++) {
                System.out.print("Phan tu [" + i + "]: ");
                arr.add(sc.nextInt());
            }
            sc.nextLine(); // clear buffer

            while (true) {
                System.out.println("\nDanh sach hien tai: " + arr);
                System.out.println("Chon: 1-Them, 2-Xoa, 0-Thoat");
                System.out.print("Lua chon: ");
                String cmd = sc.nextLine().trim();

                if (cmd.equals("0")) break;

                if (cmd.equals("1")) {
                    System.out.print("Nhap gia tri muon them: ");
                    int val = Integer.parseInt(sc.nextLine().trim());
                    System.out.print("Nhap vi tri (0.." + arr.size() + ") de chen: ");
                    int pos = Integer.parseInt(sc.nextLine().trim());
                    if (pos < 0 || pos > arr.size()) {
                        System.out.println("Vi tri khong hop le.");
                    } else {
                        arr.add(pos, val);
                        System.out.println("Da chen.");
                    }
                } else if (cmd.equals("2")) {
                    if (arr.isEmpty()) {
                        System.out.println("Danh sach rong, khong the xoa.");
                        continue;
                    }
                    System.out.print("Nhap vi tri (0.." + (arr.size() - 1) + ") de xoa: ");
                    int pos = Integer.parseInt(sc.nextLine().trim());
                    if (pos < 0 || pos >= arr.size()) {
                        System.out.println("Vi tri khong hop le.");
                    } else {
                        arr.remove(pos);
                        System.out.println("Da xoa.");
                    }
                } else {
                    System.out.println("Lua chon khong hop le.");
                }
            }
        } finally {
            sc.close();
        }
    }
}

