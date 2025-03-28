/* Napisati program koji sa standardnog ulaza učitava matricu dimenzija mxn, koja je popunjena isključivo brojevima 0 i 1 i koja predstavlja mapu serverskog centra. 
   Broj 1 predstavlja polje na kojem je server, a broj 0 predstavlja prazno polje. Dva servera mogu komunicirati ukoliko se nalaze u istom redu ili u istoj koloni. 
   Vaš program treba da pronađe broj servera koji komuniciraju sa barem jednim serverom.
 */

import java.util.Scanner;

public class Zad11 {
    public static void BrojServeraKojiKomuniciraju(int matr[][]) {
        int n = matr.length;    //duzina matrice
        int m = matr[0].length; //sirina matrice
        int cnt = 0;    //broj servera

        for (int i = 0; i < matr.length; i++) {
            for (int j = 0; j < matr[i].length; j++) {
                if(matr[i][j] == 1) {
                     = matr[i][j];    //nasli smo server

                    //int red = i;    //zapamti red u koji se nalazi server
                    //int kolona = j;     //zapamti kolonu u kojoj se nalazi server
                }
                int brojacURedu = 0;
                for (int k = 0; k < m; k++) {     //da li postoje serveri u istom redu
                    if(matr[i][k] == 1) {
                        brojacURedu++;
                    }
                }
                
                int brojacUKoloni = 0;
                for (int k = 0; k < matr.length; k++) {      //da li postoje serveri u istoj koloni
                    if(matr[k][j] == 1) {     //idemo po koloni gdje se nalazi element
                        brojacUKoloni++;
                    }
                }
                if(brojacURedu > 1 || brojacUKoloni > 1) {
                    cnt++;      //povecavamo cnt sto nam je broj servera koji komuniciraju
                }
            }
        }
        System.out.println("Broj servera koji komuniciraju:" + cnt);
    }
    
    
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = scanner.nextInt();
        int m = scanner.nextInt();

        int[][] matr = new int[n][m];

        System.out.println("Unesite matricu ciji su elementi 0 ili 1:");
        for (int i = 0; i < matr.length; i++) {
            for (int j = 0; j < matr[i].length; j++) {
                matr[i][j] = scanner.nextInt();
            }
            System.out.println();
        }
        BrojServeraKojiKomuniciraju(matr);
    }
}
