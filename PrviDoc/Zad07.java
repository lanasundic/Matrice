//Napisati funkciju int[][] popuniMatricu1(int m, int n, int k) koja za date m i n kreira matricu dimenzija mxn
// i popunjava je slučajnim brojevima iz intervala [-k,k].

import java.util.Random;
import java.util.Scanner;

public class Zad07 {

    public static int[][] popuniMatricu1(int m, int n, int k) {
        Random rand = new Random();
        int matr[][] = new int[m][n];

        for (int i = 0; i < matr.length; i++) {
            for (int j = 0; j < matr.length; j++) {
                matr[i][j] = rand.nextInt(2 * k) - k;
            }
        }

        return matr;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Unesite dimenzije matrice:");
        int n = scanner.nextInt();
        int m = scanner.nextInt();

        System.out.println("Unesite k:");
        int k = scanner.nextInt();



        
    }

}
