//Napisati funkciju void sumaMatrice(int mat[][]) koja izračunava zbir elemenata matrice sa parnim indeksom reda i neparnim indeksom kolone.

import java.util.Scanner;

class Zad01 {

    public static void sumaMatrice(int mat[][]) {
        int zbir = 0;

        for (int i = 0; i < mat.length; i++) {
            for (int j = 0; j < mat[i].length; j++) {
                if(i % 2 == 0 && j % 2 != 0) {
                    zbir += mat[i][j];
                } 
            }
        }
        System.out.println(zbir);
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Unesite dimenzije matrice:");
        int n = scanner.nextInt();
        int m = scanner.nextInt();

        int matr[][] = new int[n][m];
        System.out.println("Unesite elemente matrice:");
        for (int i = 0; i < matr.length; i++) {
            for (int j = 0; j < matr[i].length; j++) {
                matr[i][j] = scanner.nextInt();
            }
            System.out.println();
        }

        sumaMatrice(matr);
    }

}