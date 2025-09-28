import java.util.ArrayList;
import java.util.Scanner;

public class Bai9 {
    public static void main(String[] args) 
    {
        Scanner scanner = new Scanner(System.in);
        ArrayList<Integer> list = new ArrayList<>();
        
        System.out.println("Nhap danh sach so nguyen (nhap -1 de ket thuc):");
        
        while (true)
         {
            System.out.print("Nhap so: ");
            int so = scanner.nextInt();
            
            if (so == -1) {
                break;
            }
            
            list.add(so);
        }
        
        System.out.println("\nDanh sach so vua nhap:");
        for (int i = 0; i < list.size(); i++) {
            System.out.println("So " + (i + 1) + ": " + list.get(i));
        }
        
        scanner.close();
    }
}