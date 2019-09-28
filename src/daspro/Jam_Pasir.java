package daspro;

import java.util.Scanner;

public class Jam_Pasir {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int batas;
        String isi;
        System.out.print("Masukkan Ukuran: ");
        batas = input.nextInt();
        System.out.print("Masukkan Isi Jam Pasir:");
        isi = input.next();

        for (int a = 0; a < batas; a++) {
            System.out.print("|");
            for (int b = 0; b < a; b++) {
                System.out.print(" ");
            }
            System.out.print("\\");
            for (int c = batas - 2; c > a * 2 - batas; c--) {
                System.out.print(isi);
            }
            for (int d = 0; d > a; d++) {
                System.out.print(" ");
            }
            System.out.print("/");
            for (int e = 1; e < a + 1; e++) {
                System.out.print(" ");
            }
            System.out.print("|");
            System.out.println(" ");
        }
//segitiga bawah
        for (int a = batas; a > 0; a--) {
            System.out.print("|");
            for (int b = a - 1; b > 0; b--) {
                System.out.print(" ");
            }
            System.out.print("/");

            for (int i = a * 2 - batas; i < batas; i++) {
                System.out.print(isi);
            }
            for (int c = batas; c < 0; c--) {
                System.out.println(" ");
            }
            System.out.print("\\");
            for (int c = a - 1; c > 0; c--) {
                System.out.print(" ");
            }
            System.out.print("|");
            System.out.println(" ");
        }

    }    
}
