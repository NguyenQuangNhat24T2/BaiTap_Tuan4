import java.util.Scanner;

public class Bai6 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        try{
            System.out.println("Nhap so nguyen a: ");
            long a= sc.nextLong();
            System.out.println("Nhap so nguyen b: ");
            long b= sc.nextLong();
            long aa= Math.abs(a);
            long bb=Math.abs(b);
            if(aa==0 && bb==0){
                System.out.println("Khong co UCLN & BCNN cho cap so (0,0)!");
            } else{
                long g= gcd(aa,bb);
                long l= (g==0)?0:(aa/g)*bb;
                System.out.println("UCLN= "+g);
                System.out.println("BCNN= "+l);
            }
        } catch(Exception e){
            System.out.println("Dau vao khong hop le.");
        }
        finally{
            sc.close();
        }
    }
static long gcd(long a, long b){
    while(b!=0)
    {
        long t=a%b;
        a=b;
        b=t;
    }
    return a;
}
}
