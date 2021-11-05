package ch.comem.quinteirosm.serie4;

import java.util.Arrays;
import java.util.Locale;
import java.util.Scanner;

public class ex03_file {
    public static void main(String[] args) {
        String[] tableau = {"Aline","Roger","Julia","Steven","Jules"};

        Scanner userInput = new Scanner(System.in).useLocale(new Locale("fr-CH"));
        System.out.println("Veuillez saisir un prénom :");
        int input = userInput.nextInt();

        for(String personne:tableau){
            if(personne == input){
                System.out.println("Julia se trouve en 3e position dans la file");
            }
        }

    }
}
