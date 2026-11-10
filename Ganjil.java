package PBOP5;

import java.util.Scanner;

public class Ganjil {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int b, a = 1, t = 0;
        double r;
        
        System.out.println("============================================================");
        System.out.print("Masukkan Bilangan : ");
        b = s.nextInt();
        System.out.println("============================================================");
        for (int i = 0; i <= b; i++) {
            System.out.print(a + " ");
            t += a;
            a += 2;
        }
        System.out.println("Total Jumlah : " + t);
        System.out.println("============================================================");
    }
    
}
