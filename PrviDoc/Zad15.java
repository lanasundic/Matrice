//Napisati funkciju int[][] pomnozi(int a[][], int b[][]) koja množi dvije matrice cijelih brojeva.

import java.util.Scanner;

public class Zad15 {
    public static void stampaMatrice(int[][] rezultat) {
        for (int i = 0; i < rezultat.length; i++) {
            for (int j = 0; j < rezultat[i].length; j++) {
                System.out.print(rezultat[i][j] + " ");
            }
            System.out.println();
        }
    }

    public static int[][] pomnozi(int a[][], int b[][]) {
        int m = a.length;
        int n = a[0].length;    //broj kolona prve matrice odnosno broj vrsta druge
        int q = b[0].length;

        int[][] rezultat = new int[m][q];    //rezultujuca matrica

        for (int i = 0; i < m; i++) {    //idemo po redovi prve matrice
            for (int j = 0; j < q; j++) {    //idemo po kolonama druge matrice 
                int suma = 0;
                
                for (int k = 0; k < n; k++) {  //idemo kroz zajednicku dimenziju n - broj kolona prve matrice i broj vrsta druge matrice
                    suma += a[i][k] * b[k][j];
                }
            
                rezultat[i][j] = suma;
            }
        }
        return rezultat;
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Unesite dimenzije prve matrice:");
        int m = scanner.nextInt();
        int n = scanner.nextInt();

        System.out.println("Unesite dimenzije druge matrice:");
        int p = scanner.nextInt();
        int q = scanner.nextInt();

        if(n != p) {
            System.out.println("Da bi se dvije matrice pomnozile n i q moraju da budu isti.");
        }
        
        int[][] matr1 = new int[m][n];
        int[][] matr2 = new int[p][q];

        System.out.println("Unesite elemente prve matrice:");
        for (int i = 0; i < matr1.length; i++) {
            for (int j = 0; j < matr1[i].length; j++) {
                matr1[i][j] = scanner.nextInt();
            }
            System.out.println();
        }

        System.out.println("Unesite elemente druge matrice:");
        for (int i = 0; i < matr2.length; i++) {
            for (int j = 0; j < matr2[i].length; j++) {
                matr2[i][j] = scanner.nextInt();
            }
            System.out.println();
        }
        int[][] rezultat = pomnozi(matr1, matr2);
        stampaMatrice(rezultat);
    }
}
