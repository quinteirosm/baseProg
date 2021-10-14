package ch.comem.quinteirosm.serie1;

import java.util.Locale;
import java.util.Scanner;

public class ex08 {
    public static void main(String[] args) {
        Scanner userInput1 = new Scanner(System.in).useLocale(new Locale("fr-CH"));
        System.out.println("Note obtenue à l'examen intermédiaire :");
        double examenIntermediaire = userInput1.nextDouble();

        Scanner userInput2 = new Scanner(System.in).useLocale(new Locale("fr-CH"));
        System.out.println("Note obtenue au projet :");
        double projet = userInput2.nextDouble();

        Scanner userInput3 = new Scanner(System.in).useLocale(new Locale("fr-CH"));
        System.out.println("Note obtenue à l'examen final :");
        double examenFinal = userInput3.nextDouble();

        double moyenne=(examenIntermediaire*2+projet+examenFinal*3)/6;

        System.out.println("La moyenne est de : "+moyenne);
    }
}
