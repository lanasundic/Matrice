//Napisati funkciju void zamijeniKolone(int mat[][], int r, int s) koja mijenja datu matricu cijelih brojeva tako što zamijeni r-tu i s-tu kolonu.

import java.util.Scanner;

public class Zad3 {
    public static void ispisiMatricu(int mat[][]) {
        for (int i = 0; i < mat.length; i++) {
            for (int j = 0; j < mat[i].length; j++) {
                System.out.print(mat[i][j] + " ");
            }
            System.out.println();
        }
    }

    public static void zamijeniKolone(int mat[][], int r, int s) {

        for (int i = 0; i < mat.length; i++) {
                int temp = mat[i][r];   //zamjena kolona
                mat[i][r] = mat[i][s];
                mat[i][s] = temp;
        }
    }
    
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Unesite dimenzije matrice:");
        int n = scanner.nextInt();
        int m = scanner.nextInt();

        int matr[][] = new int[n][m];
        System.out.println("Unesite el matrice:");
        for (int i = 0; i < matr.length; i++) {
            for (int j = 0; j < matr[i].length; j++) {
                matr[i][j] = scanner.nextInt();
            }
            System.out.println();
        }

        System.out.println("Koje kolone mijenjate:");
        int r = scanner.nextInt();
        int s = scanner.nextInt();

        zamijeniKolone(matr, r, s);
        ispisiMatricu(matr);
    }
}
