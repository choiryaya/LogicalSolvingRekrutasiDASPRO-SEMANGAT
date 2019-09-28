package daspro;

import java.util.LinkedList;
import java.util.Scanner;

public class FPB {

    public static void main(String[] args) {
        LinkedList<Integer> list = new LinkedList();
        LinkedList<Integer> link = new LinkedList();

        Scanner in = new Scanner(System.in);
        System.out.println("Input faktor Persekutuan 2 Bilangan");
        System.out.print("Angka pertama     : ");
        int a = in.nextInt();
        System.out.print("Angka kedua       : ");
        int b = in.nextInt();

        System.out.print("Faktor dari " + a + "    : ");
        int i = 1;
        while (i <= a) {
            if (a % i == 0) {
                System.out.print(i + " ");
                list.addLast(i);
            }
            i++;
        }
        System.out.println(" ");
        System.out.print("Faktor dari " + b + "    : ");
        int j = 1;
        while (j <= b) {
            if (b % j == 0) {
                System.out.print(j + " ");
                link.addLast(j);
            }
            j++;
        }

        System.out.println(" ");
        System.out.print("Faktor persekutuan bilangan " + a + " dan " + b + " : ");
        for (int k = 0; k < list.size(); k++) {
            for (int l = 0; l < link.size(); l++) {
                if (!list.isEmpty()) {
                    if (list.get(k) == (link.get(l))) {
                        System.out.print(list.get(k) + " ");
                    }

                }
            }
        }
        System.out.println(" ");

    }
}
