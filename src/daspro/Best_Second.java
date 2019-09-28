package daspro;

import java.util.Arrays;
import java.util.Scanner;

public class Best_Second {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int x = 0;
        int b = 0;

        System.out.println("Aplikasi menentukan Best Second");
        System.out.print("Total Data: ");
        x = input.nextInt();
        System.out.println();
        int[] total = new int[x];
        for (b = 0; b < x; b++) {
            System.out.print("Angka ke-" + (b + 1) + ": ");
            total[b] = input.nextInt();
        }

        Arrays.sort(total);
        System.out.println("");
        System.out.println("");
        System.out.println("best second: " + total[total.length - 2]);

    }
}
