import java.util.Scanner;
//Bài 8: Tìm số phần tử xuất hiện nhiều nhất trong một mảng
/*Trần Thị Thu Hiền */
public class Bai8_ThuHien
 {
    public static void main(String[] args) 
    {
        Scanner sc = new Scanner(System.in);
        // Nhập số phần tử
        System.out.print("Nhập số phần tử của mảng: ");
        int n = sc.nextInt();
        int[] arr = new int[n];
        // Nhập mảng
        System.out.println("Nhập các phần tử của mảng:");
        for (int i = 0; i < n; i++) 
            arr[i] = sc.nextInt();
        int maxCount = 0;  // số lần xuất hiện lớn nhất
        int mostFrequent = arr[0]; // phần tử xuất hiện nhiều nhất
        // Duyệt từng phần tử để đếm
        for (int i = 0; i < n; i++) 
        {
            int count = 0;
            for (int j = 0; j < n; j++) 
                if (arr[i] == arr[j]) 
                    count++;
            // Nếu số lần xuất hiện lớn hơn maxCount thì cập nhật
            if (count > maxCount) 
            {
                maxCount = count;
                mostFrequent = arr[i];
            }
         }
        // In kết quả
        System.out.println("Phần tử xuất hiện nhiều nhất là: " + mostFrequent);
        System.out.println("Số lần xuất hiện: " + maxCount);

        sc.close();
    }
}
