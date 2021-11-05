package ch.comem.quinteirosm.serie4;

public class ex01_printReverse {
    public static void main(String[] args) {
        Integer[] tableau = new Integer[10];

        for(int i = 0; i<=tableau.length-1; i++){
            tableau[i]=i;
        }

        for(int i=tableau.length-1; i >= 0; i--){
            System.out.println(tableau[i]);
        }
    }
}