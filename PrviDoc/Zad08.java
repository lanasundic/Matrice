/*Napisati funkciju int[][] popuniMatricu2(int n) koja za dato n kreira i popunjava cijelim brojevima kvadratnu matricu reda n na zadati način. Na primjer, za n=4
        1 2 3 4
        2 3 4 1
        3 4 1 2
        4 1 2 3 
 */

import java.util.Scanner;

public class Zad08 {

    public static int[][] popuniMatricu(int n) {
        int[][] matr = new int[n][n];

        for (int j = 0; j < n; j++) {
                matr[0][j] = j + 1;     //prvi red popunjavamo normalno
        }

        for (int i = 1; i < n; i++) {   //krecemo od drugog reda
                for (int j = 0; j < n; j++) {
                        if(j == n - 1) {        //ako je posljednji el
                                matr[i][j] = matr[i - 1][0];    //uzmi vrijednost prvog elementa prethodnog reda
                        } else {
                                matr[i][j] = matr[i - 1][j + 1];        //ostali elementi - pomjeri ih ulijevo i popunjavaj normalno
                        }
                }            
        }
        for (int i = 0; i < matr.length; i++) {
                for (int j = 0; j < matr.length; j++) {
                        System.out.print(matr[i][j] + " ");
                }
                System.out.println();
        }
        return matr;
     }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("Unesite n:");
        int n = scanner.nextInt();

        popuniMatricu(n);
    }
}
