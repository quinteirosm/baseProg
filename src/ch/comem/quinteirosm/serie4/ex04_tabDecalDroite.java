package ch.comem.quinteirosm.serie4;

import java.util.Arrays;

public class ex04_tabDecalDroite {
    public static void main(String[] args) {
        String[] tableau = {"Aline","Roger","Julia","Steven","Jules"};

        System.out.println("Avant: "+ Arrays.toString(tableau));

        String tmp= new String(tableau[tableau.length-1]);

        for(int i=tableau.length-2; i>=0; i--){
            tableau[i+1]=tableau[i];
        }

        tableau[0]=tmp;

        System.out.println("Après: "+Arrays.toString(tableau));
    }
}
