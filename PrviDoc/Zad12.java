/*Napisati program koji u datoj binarnoj matrici dimenzija mxn pronalazi
 i štampa pozicije svih elemenata matrice za koje važi da im je vrijednost 1 i da vrijednost svih ostalih elemenata u istom redu i istoj koloni 0.
 */

import java.util.Scanner;

public class Zad12 {
    public static void samoJedinicaUKoloniIRedu(int[][] matr, int m, int n) {
        int xSameJedinice = 0;
        int ySameJedinice = 0;

        for (int i = 0; i < matr.length; i++) {
            for (int j = 0; j < matr.length; j++) {
                if(matr[i][j] == 1) { //ako naidjemo na 1
                    boolean SamaJedinicaX = true;
                    boolean SamaJedinicaY = true;
                    for (int k = 0; k < matr[0].length; k++) {     //idemo po redu u kojem se nalazi ta jedinica
                        if(matr[i][k] == 1) {
                            if (k != j) //  Tek kada naidjemo na neko drugo 1 
                                SamaJedinicaX = false;
                        }
                    }
                    for (int g = 0; g < matr.length; g++) {     //provjeravamo elemente u istoj koloni gdje se nalazi ta jedinica
                        if(matr[g][j] == 1) {
                            if (g != i)
                                SamaJedinicaY = false;
                        }
                    }
                    if(SamaJedinicaX && SamaJedinicaY) {
                        xSameJedinice = i;
                        ySameJedinice = j;
                        System.out.println(xSameJedinice + ", " + ySameJedinice);
                    }
                }
            }
        }
    }
    
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int m = scanner.nextInt();
        int n = scanner.nextInt();

        int[][] matr = new int[m][n];

        System.out.println("Unesite matricu:");
        for (int i = 0; i < matr.length; i++) {
            for (int j = 0; j < matr.length; j++) {
                matr[i][j] = scanner.nextInt();
            }
            System.out.println();
        }
        samoJedinicaUKoloniIRedu(matr, m, n);
    }
}
