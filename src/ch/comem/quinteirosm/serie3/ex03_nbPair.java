package ch.comem.quinteirosm.serie3;

import java.util.Locale;
import java.util.Scanner;

public class ex03_nbPair {
    public static void main(String[] args) {
        int userInput;
        do {
            Scanner input = new Scanner(System.in).useLocale(new Locale("fr-CH"));
            System.out.println("Entrez le nombre de nombres pairs que vous voulez afficher");
            userInput = input.nextInt();

            System.out.println("Liste des nombres pairs entre 1 et " + userInput + " :");

            for (int i = 2; i <= userInput; i += 2) {
                System.out.println(i);
            }
        } while (userInput < 1);
    }
}
