package PBOP5;

import java.util.Scanner;

public class InputBilangan {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
         int a, tbs = 0, tkc = 0;
         System.out.println("===========================================================================");         
         System.out.println("=========================== Urutan Angka Inputan ==========================");
         System.out.println("===========================================================================");
         for (int i = 1; i <= 10; i++) {
            System.out.print("Masukkan Bilangan ke " + i + " Yang Akan di Input : ");
            a = s.nextInt();
            System.out.println("===========================================================================");

             if (i == 1) {
                 tbs = a;
                 tkc = a;
             }
             
             if (a > tbs) {
                 tbs = a;
             }
             
             if (a < tkc) {
                 tkc = a;
             }
        }
         System.out.println("Bilangan Terbesar : " + tbs);
         System.out.println("Bilangan Terkecil : " + tkc);
         System.out.println("===========================================================================");

    }
    
}
