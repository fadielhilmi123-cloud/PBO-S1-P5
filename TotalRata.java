package PBOP5;

import java.util.Scanner;

public class TotalRata {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int b, a, t = 0;
        double r;
        
        System.out.println("Masukkan Bilangan : ");
        b = s.nextInt();
        
        for (int i = 0; i <= b; i++) {
            System.out.println("Masukkan angka ke - " + i + " :");
            a = s.nextInt();
            
            t += a;
        }
        
        r = (double) t/b;
        System.out.println("Total Jumlah : " + t);
        System.out.println("Rata - Rata : " + r);
    }
    
}
