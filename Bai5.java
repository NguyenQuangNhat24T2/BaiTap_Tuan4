import java.util.Scanner;
public class Bai5 {
    public static void main(String[] args){
        Scanner sc = new Scanner (System.in);
        try{
            System.out.print("Hay nhap 1 so nguyen (>=0): ");
            long n = sc.nextLong();

            if(n<2) {System.out.println(n+" khong phai la so nguyen to.");}
            else {
                if(laNguyento(n)) System.out.println(n+" la so nguyen to.");
                else {System.out.println(n+ " khong la so nguyen to.");}
            }
        }
            catch (Exception e) {System.out.println("Dau vao khong hoop le.");}
            finally {sc.close();}
    }
static boolean laNguyento(long n){
    if(n<=1) return false;
    if(n<=3) return true;
    if(n%2==0) return false;
    long r=(long)Math.sqrt(n);
    for(long i=3;i<=r;i+=2)
        if(n%i==0) return false;
    return true;
}
}