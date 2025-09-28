import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;
public class Bai8 
{
    public static void main(String[] args) 
    {
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhap so phan tu n: ");
        int n = sc.nextInt();
        int[] arr = new int[n];
        System.out.println("Nhap cac phan tu cua mang:");
        for (int i = 0; i < n; i++) 
            arr[i] = sc.nextInt();
        HashMap<Integer, Integer> freq = new HashMap<>();
        for (int x : arr) 
            freq.put(x, freq.getOrDefault(x, 0) + 1);       
        int maxFreq = 0;
        int mode = arr[0]; 
        for (Map.Entry<Integer, Integer> entry : freq.entrySet()) 
            if (entry.getValue() > maxFreq) 
            {
                maxFreq = entry.getValue();
                mode = entry.getKey();
            }
        System.out.println("Phan tu xuat hien nhieu nhat: " + mode + " (xuat hien " + maxFreq + " lan)");
        sc.close();
    }
}
