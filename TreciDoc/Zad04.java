//Задатак 4. Деца су спремала приредбу у школском дворишту. Свако jе обукао костим различите боjе и
//поређали су се у квадратну матрицу. Током тачке деца су се премештала и то на веома правилне начине.
//Прво су пресликали матрицу око главне диjагонале. Затим су заротирали матрицу за 90 степени удесно (у
//смеру казаљке на сату). Након тога су jе пресликали хоризонтално и на краjу су jе пресликали око споредне диjагонале. Напиши програм коjи исписуjе распоред боjа дечиjих костима након сваког корака њихове
//кореографиjе.

//Улаз: Са стандардног улаза се учитава броj n(3 ≤ n ≤ 10), а затим и квадратна матрица димензиjе n коjа
//садржи броjеве између 0 и 10 (сваки броj означава jедну боjу костима).
//Излаз: На стандардни излаз исписуjе се 5 матрица. Полазна, учитана и затим матрица добиjена након сваке
//трансформациjе.

package TreciDoc;

import java.util.Scanner;

public class Zad04 {
    public static void koreografija(int[][] matr, int n) {
        
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

    }
}
