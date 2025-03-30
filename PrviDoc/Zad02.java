//Napisati funkciju void lokalni_maksimumi(int mat[][]) koja određuje i štampa pozicije (indekse) svih "lokalnih maksimuma" u matrici. 
//Element mat[i][j] matrice mat je "lokalni maksimum" ako je veći ili jednak od svih njemu susjednih elemenata.

import java.util.Scanner;

public class Zad02 {

    public static void lokalni_maksimumi(int mat[][]) {
        int index = 0;

        for (int i = 0; i < mat.length; i++) {
            for (int j = 0; j < mat[i].length; j++) {
                boolean maksimum = true;

                if(i > 0 && mat[i][j] < mat[i-1][j]) { //gore    Ako smo u prvom redu (i = 0), NE SME da se desi i-1, jer bismo izašli van granica.
                    maksimum = false;
                }
                if(i < mat.length - 1 && mat[i][j] < mat[i+1][j]) {   //dolje   Ako smo u poslednjem redu (i = mat.length - 1), NE SME da se desi i+1, jer bismo izašli van matrice.
                    maksimum = false;
                }
                if(j > 0 && mat[i][j] < mat[i][j-1]) {  //lijevo    Ako smo u prvoj koloni (j = 0), NE SME da se desi j-1, jer bismo izašli iz matrice.
                    maksimum = false;
                }
                if(j < mat[i].length - 1  && mat[i][j] < mat[i][j+1]) {  //desno   Ako smo u poslednjoj koloni (j = mat[i].length - 1), NE SME da se desi j+1.
                    maksimum = false;
                }

                if(maksimum) {
                    System.out.println("(" + i + ", " + j + ")");
                }
            }
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
            for (int j = 0; j < matr[1].length; j++) {
                matr[i][j] = scanner.nextInt();
            }
            System.out.println();
        }
        lokalni_maksimumi(matr);
    }
}
