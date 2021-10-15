package ch.comem.quinteirosm.serie2;

import java.util.Locale;
import java.util.Scanner;

public class ex06_droite {
    public static void main(String[] args) {
        Scanner userInputA = new Scanner(System.in).useLocale(new Locale("fr-CH"));
        System.out.println("Veuillez saisir la valeur de A :");
        double a = userInputA.nextDouble();

        Scanner userInputB = new Scanner(System.in).useLocale(new Locale("fr-CH"));
        System.out.println("Veuillez saisir la valeur de B :");
        double b = userInputB.nextDouble();

        double x=-b/a;

        System.out.println("L'équation "+a+"x+"+b+"=0, a comme solution x="+x);
    }
}
