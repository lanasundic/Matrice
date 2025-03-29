/*Kvadratna matrica reda n se smatra validnom ukoliko svaki red i svaka kolona te matrice sadrže svaki prirodan broj od 1 do n. 
  Napisati program koji sa standardnog ulaza učitava kvadratnu matricu reda n i štampa „DA“ ukoliko je ta matrica validna, a „NE“ u suprotnom. 
 */
//kvadratna je matrica

import java.util.Scanner;

public class Zad13 {
    public static void Validna(int[][] matr, int n) {
        boolean matricaValidna = true;
        
        for (int i = 0; i < matr.length; i++) {
            boolean redValidan = true;
            for (int k = 1; k <= matr.length; k++) {
                boolean postojiURedu = false;
                for (int j = 0; j < matr.length; j++) {
                    if(matr[i][j] == k) {
                        postojiURedu = true;
                    }
                }
                if (!postojiURedu)
                    redValidan = false;
            }
            if (!redValidan)
                matricaValidna = false;
        }
        if(matricaValidna) {
            System.out.println("DA");
        } else {
            System.out.println("NE");
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = scanner.nextInt();

        int[][] matr = new int[n][n];
        for (int i = 0; i < matr.length; i++) {
            for (int j = 0; j < matr.length; j++) {
                matr[i][j] = scanner.nextInt();
            }
            System.out.println();
        }
        Validna(matr, n);
    }
}
