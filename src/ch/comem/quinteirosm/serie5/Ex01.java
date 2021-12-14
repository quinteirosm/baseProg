package ch.comem.quinteirosm.serie5;

import java.util.Locale;
import java.util.Scanner;

public class ex01 {
    public static void main(String[] args) {
        Scanner userInput = new Scanner(System.in).useLocale(new Locale("fr-CH"));
        System.out.println("Ecrivez un nombre");
        int nombre1 = userInput.nextInt();
        System.out.println("Ecrivez un nombre");
        int nombre2 = userInput.nextInt();
        System.out.println("Ecrivez un nombre");
        int nombre3 = userInput.nextInt();

        System.out.printf("La somme de ces chiffres est"+addition(nombre1,nombre2,nombre3));
    }
    private static Integer addition(Integer nombre1, Integer nombre2, Integer nombre3) {
        int resultat=nombre1+nombre2+nombre3;
    }
}

