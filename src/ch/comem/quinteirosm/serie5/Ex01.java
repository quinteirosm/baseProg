package ch.comem.quinteirosm.serie5;

import java.util.Locale;
import java.util.Scanner;

public class Ex01 {
    public static void main(String[] args) {
        Scanner userInput = new Scanner(System.in).useLocale(new Locale("fr-CH"));
        System.out.println("Ecrivez un nombre");
        int nombre1 = userInput.nextInt();
        System.out.println("Ecrivez un nombre");
        int nombre2 = userInput.nextInt();
        System.out.println("Ecrivez un nombre");
        int nombre3 = userInput.nextInt();

        addition(nombre1,nombre2,nombre3);
    }
    private static void addition(int nombre1, int nombre2, int nombre3) {
        System.out.printf("La somme de ces chiffres est de "+(nombre1+nombre2+nombre3));
    }
}