/*Napisati funkciju void filtar(int[][] slika, int k) koja nad datom slikom, koja je predstavljena matricom prirodnih brojeva dimenzija mxn (m>=k, n>=k), 
  primjenjuje filtar veličine kxk i štampa rezultujuću sliku odnosno matricu. 
  Filter se primjenjuje tako što se pomjera po matrici slika i računa se prosječna vrijednost elemenata matrice koje filter preklopi.
 */

import java.util.Scanner;

public class Zad14 {
	public static void stampajMatricu(int[][] matr) {
		for (int i = 0; i < matr.length; i++) {
			for (int j = 0; j < matr[i].length; j++) {
				System.out.print(matr[i][j] + " ");
			}
			System.out.println();
		}
	}

	public static void filter(int[][] slika, int k) {
		int m = slika.length;
		int n = slika[0].length;

		int[][] rezultujucaSlika = new int[m - k + 1][n - k + 1];	//nije k vel

		for (int i = 0; i <= slika.length - k; i++) {	//i i j su nam samo pocetne pozicije filtera
			for (int j = 0; j <= slika[i].length - k; j++) {
				int suma = 0;
				int avg = 0;

				for (int ki = 0; ki < k; ki++) {	//kada su el u filteru moramo da ih sve saberemo i izracunamo ih avg
					for (int kj = 0; kj < k; kj++) {
						suma += slika[i + ki][j + kj];
						avg = suma / (k * k);
					
						rezultujucaSlika[i][j] = avg;
					}
				}
			}
		}
		stampajMatricu(rezultujucaSlika);
	}
    public static void main(String[] args) {
    	Scanner scanner = new Scanner(System.in);
		
		System.out.println("Unesite dimenzije matrice:");
		int m = scanner.nextInt();
		int n = scanner.nextInt();

		System.out.println("Unesite dimenziju filtera:");
		int k = scanner.nextInt();

		int[][] slika = new int[m][n];

		System.out.println("Unesite elemente matrice:");
		for (int i = 0; i < slika.length; i++) {
			for (int j = 0; j < slika[i].length; j++) {
				slika[i][j] = scanner.nextInt();
			}
			System.out.println();
		}
		filter(slika, k);
    }
}
