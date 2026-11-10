package PBOP5;

import java.util.Scanner;

public class SegitigaNomor {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        
        int b, a= 1;
    
        System.out.println("===========================================================================");
        System.out.print("Masukkan Baris : ");
        b = s.nextInt();
        System.out.println("===========================================================================");
        for (int i = 1; i <= b; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print(a + " ");
                a++;
            }
            System.out.println();
        }
        System.out.println("===========================================================================");
    }
   
}
