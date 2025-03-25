/*
    Data je kvadratna matrica dimenzija nxn koja predstavlja sliku. Napisati program koji štampa sliku rotiranu za 90 stepeni u smjeru kazaljke na satu. 
    Na primjer, ako je data matrica: 
    1 2 3
    4 5 6
    7 8 9
    nakon rotacije, ona izgleda ovako: 
    7 4 1
    8 5 2
    9 6 3

 */

import java.util.Scanner;

public class Zad6 {

    public static void rotacijaIStampa(int mat[][], int n) {
        for (int j = 0; j < mat.length; j++) {
            for (int i = mat.length - 1; i >= 0; i--) {
                System.out.print(mat[i][j] + " ");
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Unesite dimenzije matrice:");
        int n = scanner.nextInt();

        int matr[][] = new int[n][n];

        System.out.println("Unesite el matrice:");
        for (int i = 0; i < matr.length; i++) {
            for (int j = 0; j < matr[i].length; j++) {
                matr[i][j] = scanner.nextInt();
            }
            System.out.println();
        }
        rotacijaIStampa(matr, n);
    }
}
