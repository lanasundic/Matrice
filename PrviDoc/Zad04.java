//Napisati funkciju boolean simetricna(int mat[][]) koja provjerava da li je data kvadratna matrica simetrična u odnosu na glavnu dijagonalu.

import java.util.Scanner;

public class Zad04 {
    public static boolean simetricna(int mat[][]) {

        for (int i = 0; i < mat.length; i++) {
            for (int j = i + 1; j < mat.length; j++) {  //j = i + 1 osigurava da ne provjeravamo dijagonalu i donji trougao, što bi bilo suvišno
                if(mat[i][j] != mat[j][i]) {
                    return false;
                }
            }
        }
        
        return true;
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Unesite dimenzije matrice:");
        int n = scanner.nextInt();
        int m = scanner.nextInt();

        if (n != m) {
            System.out.println("Matrica mora biti kvadratna!");
            return;
        }

        int matr[][] = new int[n][m];

        System.out.println("Unesite el matrice:");
        for (int i = 0; i < matr.length; i++) {
            for (int j = 0; j < matr[i].length; j++) {
                matr[i][j] = scanner.nextInt();
            }
            System.out.println();
        }

        if (simetricna(matr)) {
            System.out.println("Matrica je simetricna.");
        } else {
            System.out.println("Matrica nije simetricna.");
        }
    }
}
