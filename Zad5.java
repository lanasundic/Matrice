/*Napisati program koji provjerava da li je data matrica cijelih brojeva Toplicova. Matrica se smatra Toplicovom ukoliko za svaku dijagonalu paralelnu glavnoj dijagonali 
(uključujući i samu glavnu dijagonalu) važi da su svi elementi na dijagonali jednaki. Ukoliko je matrica Toplicova odštampati riječ “DA”. 
U suprotnom odštampati riječ “NE”.
Primjeri:
Ulaz:	Ulaz:
3 4

1 2 3 4
5 1 2 3
9 5 1 2

2 2

1 2
2 2
Izlaz:	Izlaz:
DA	NE

 */

import java.util.Scanner;

public class Zad5 {
    public static boolean jeToplicova(int mat[][]) {
        for (int i = 0; i < mat.length - 1; i++) {      
            for (int j = 0; j < mat[i].length - 1; j++) {
                if(mat[i][j] != mat[i + 1][j + 1]) {
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

        int matr[][] = new int[n][m];

        System.out.println("Unesite el matrice:");
        for (int i = 0; i < matr.length; i++) {
            for (int j = 0; j < matr[i].length; j++) {
                matr[i][j] = scanner.nextInt();
            }
        }
        if(jeToplicova(matr)) {
            System.out.println("Da.");
        } else {
            System.out.println("Ne.");
        }
     }
}
