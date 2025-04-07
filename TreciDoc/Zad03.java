//Задатак 3. На папиру подељеном на n × n jединичних квадратића, нацртано jе неколико правоугаоника
//(паралелно ивицама папира) коjи се не додируjу, осим евентуално jедним теменом. Написати програм коjи
//одређуjе броj правоугаоника на папиру.

//Улаз: У првом реду стандардног улаза дата jе димензиjа табле n ≤ 10, а затим jе у наредним редовима
//задата матрица коjа садржи jединице и нуле, тако да су jединице уписане на местима на коjима су нацртани
//правоугаоници.
//Излаз: На стандардни излаз исписати тражени броj правоугаоника.

package TreciDoc;

import java.util.Scanner;

public class Zad03 {
    public static int pravougaonik(int[][] matr, int n) {
        int pronadjeniPravougaonici = 0;

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                if(matr[i][j] == 1) {   //ako pronadjemo 1 koju nismo do sada pronasli to je novi pravougaonik
                    pronadjeniPravougaonici++;
                }

                //Granice pravougaonika:
                int x = i;  
                int y = j;

                while(y < n && matr[i][y] == 1) {   //idi desno dok su elementi 1
                    y++;
                }
                while(x < n && matr[x][j] == 1) {   //idi dolje dok su elementi 1
                    x++;
                }

                //Brpjanje pravougaonika - oznacavamo ga sa -1 kao da je vec obradjen
                for (int k = 0; k < x; k++) {
                    for (int k2 = 0; k2 < y; k2++) {
                        matr[k][k2] = -1;   //oznacavamo sa -1 da ih ne bi smo ponovo racunali kao da je pravougaonik 
                    }
                }
            }
        }
        return pronadjeniPravougaonici;

    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Unesite dimenzije matrice:");
        int n = scanner.nextInt();

        int[][] matr = new int[n][n];

        System.out.println("Unesite elemente matrice:");
        for (int i = 0; i < matr.length; i++) {
            for (int j = 0; j < matr.length; j++) {
                matr[i][j] = scanner.nextInt();
            }
        }
        System.out.println(pravougaonik(matr, n));
    }
}
