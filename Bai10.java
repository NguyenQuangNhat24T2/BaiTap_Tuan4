import java.util.Scanner;
//Bài 10: Viết chương trình để thêm, xóa một phần tử vào danh sách tại vị trí chỉ định
/*Trần Thị Thu Hiền */
public class Bai10_ThuHien
{
     public static void main(String[] args) 
     {
        Scanner sc = new Scanner(System.in);
        ArrayList<Integer> list = new ArrayList<>(); 
        System.out.print("Nhập số phần tử ban đầu: ");
        int n = sc.nextInt();
        System.out.println("Nhập các phần tử:");
        for (int i = 0; i < n; i++) 
            list.add(sc.nextInt());
        System.out.println("Danh sách ban đầu: " + list);
        System.out.print("Nhập giá trị muốn thêm: ");
        int valueAdd = sc.nextInt();
        System.out.print("Nhập vị trí muốn thêm (0.." + list.size() + "): ");
        int indexAdd = sc.nextInt();
         if (indexAdd >= 0 && indexAdd <= list.size()) 
        {
            list.add(indexAdd, valueAdd);
            System.out.println("Danh sách sau khi thêm: " + list);
        } 
        else 
        System.out.println("Vị trí không hợp lệ!");
        System.out.print("Nhập vị trí muốn xóa (0.." + (list.size() - 1) + "): ");
        int indexRemove = sc.nextInt();
        if (indexRemove >= 0 && indexRemove < list.size()) 
        {
            list.remove(indexRemove);
            System.out.println("Danh sách sau khi xóa: " + list);
        } 
        else 
            System.out.println("Vị trí không hợp lệ!");
        

        sc.close();
    }

}
