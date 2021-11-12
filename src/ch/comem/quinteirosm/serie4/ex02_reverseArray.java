package ch.comem.quinteirosm.serie4;

import java.util.Arrays;

public class ex02_reverseArray {
    public static void main(String[] args) {
        Integer[] tableau = new Integer[9];

        for(int i = 0; i<=tableau.length-1; ++i){
            tableau[i]=i+1;
        }

        System.out.println("Avant: "+Arrays.toString(tableau));

        for(int i=0; i<=(tableau.length-1)/2; i++){
            int tmp=tableau[i];
            tableau[i]=tableau[tableau.length-i-1];
            tableau[tableau.length-i-1]=tmp;
        }
        System.out.println("Après: "+Arrays.toString(tableau));
    }
}
