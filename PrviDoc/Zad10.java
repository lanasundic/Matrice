/*Napisati program koji u datoj matrici različitih cijelih brojeva pronalazi i štampa sve brojeve za koje važi da su najmanji u svom redu a najveći u svojoj koloni.
 */

import java.util.Scanner;

public class Zad10 {
    public static void najmanjiUReduNajveciUKoloni(int[][] matr) {

        for (int i = 0; i < matr.length; i++) {
            int najmanjiURedu = matr[i][0]; //prvi el je najmanji u prvom redu
            int minKolona = 0; //kolona u kojoj se nalazi najmanji element, da bi pamtili o kojoj je koloni rijec

            for (int j = 1; j < matr[i].length; j++) {
                if(matr[i][j] < najmanjiURedu) {
                    najmanjiURedu = matr[i][j];
                    minKolona = j;  //pamtimo u kojoj se koloni nalazi najmanji el u redu
                }
            }

        //provjera da li je najveci u svojoj koloni:
        for (int k = 0; k < matr.length; k++) {
            if(matr[k][minKolona] > najmanjiURedu) {
                break;
            }
            if(k == matr.length - 1) {  //ako smo dosli do zadnjeg el
                System.out.println("Element " + najmanjiURedu + "(Red: " + i + "Kolona:" + minKolona + ")");
            }
        }
        }
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = scanner.nextInt();
        int m = scanner.nextInt();

        int[][] matr = new int[n][m];

        for (int i = 0; i < matr.length; i++) {
            for (int j = 0; j < matr.length; j++) {
                matr[i][j] = scanner.nextInt();
            }
            System.out.println();
        }
        najmanjiUReduNajveciUKoloni(matr);
    }
}
