//Задатак 1. Дата jе шаховска табла на коjоj jе распоређено осам дама. Напиши програм коjи проверава да
//ли се неке две даме нападаjу (две даме се нападаjу ако се налазе у истоj врсти, истоj колони или на истоj
//диjагонали).

//Улаз: Са стандардног улаза учитава се 0 1 матрица димензиjе 8 × 8 чиjих 8 jединица описуjе положаj 8 дама.
//Излаз: На стандардном излазу исписати текст NE ако се даме не нападаjу или DA ако се неке две даме
//нападаjу.

package TreciDoc;

import java.util.Scanner;

public class Zad01 {
    public static boolean daLiSeDameNapadaju(int[][] sahovskaTabla, int n, int brojDama) {
        boolean pronadjenaDrugaDama = false;
        int brojTrenutneDame = 0;

        int[] odLijevaNaDolje = new int[brojDama];  //ovdje smjestam razlike od i i j dama
        int[] odDesnaNaDolje = new int[brojDama]; //ovdje smjestamo zbirove od i i j dama

        for (int i = 0; i < sahovskaTabla.length; i++) {
            for (int j = 0; j < sahovskaTabla.length; j++) {
                if(sahovskaTabla[i][j] == 1) {
                    odLijevaNaDolje[brojTrenutneDame] = i - j;
                    odDesnaNaDolje[brojTrenutneDame++] = i + j;
                    
                    for (int k = 0; k < sahovskaTabla[i].length; k++) {    //prolazi kroz taj red
                        if(k != j && sahovskaTabla[i][k] == 1) {    //ako element nije ta ISTA JEDINICA i ako je drugi el u istoj vrsti = 1:
                            pronadjenaDrugaDama = true;
                        }
                    }
                    for (int k2 = 0; k2 < sahovskaTabla.length; k2++) {
                        if(k2 != i && sahovskaTabla[k2][j] == 1) {
                            pronadjenaDrugaDama = true;
                        }
                    }
                }
            }
        }
        for (int i = 0; i < odDesnaNaDolje.length; i++) {
            for (int j = 0; j < odDesnaNaDolje.length; j++) {
                if(i != j && odDesnaNaDolje[i] == odDesnaNaDolje[j]) {
                    pronadjenaDrugaDama = true;
                }
            }
        }
        for (int i = 0; i < odLijevaNaDolje.length; i++) {
            for (int j = 0; j < odLijevaNaDolje.length; j++) {
                if(i != j && odLijevaNaDolje[i] == odLijevaNaDolje[j]) {
                    pronadjenaDrugaDama = true;
                }
            }
        }
        return pronadjenaDrugaDama;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int brojDama = 8;

        int n = 8;
        int[][] sahovskaTabla = new int[n][n];

        System.out.println("Unesite elemente sahovske table. Elementi mogu da budu 0 ili 1. 8 jedinica najvise.");
        for (int i = 0; i < sahovskaTabla.length; i++) {
            for (int j = 0; j < sahovskaTabla.length; j++) {
                sahovskaTabla[i][j] = scanner.nextInt();
            }
        }
        
        boolean rezultat = daLiSeDameNapadaju(sahovskaTabla, n, brojDama);
    
        if(rezultat) {
            System.out.println("DA");
        } else {
            System.out.println("NE");
        }
    }
}
