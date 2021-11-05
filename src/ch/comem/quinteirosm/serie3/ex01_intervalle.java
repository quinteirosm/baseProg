package ch.comem.quinteirosm.serie3;

import java.util.Locale;
import java.util.Scanner;

public class ex01_intervalle {
    public static void main(String[] args) {
        double userInput=0;
        do{
            Scanner input = new Scanner(System.in).useLocale(new Locale("fr-CH"));
            System.out.println("Veuillez saisir un nombre dans l'intervalle [1;3]");
            userInput = input.nextDouble();

            System.out.println("La valeur : "+userInput+" est correcte :-) \n");
        }while(userInput < 1 || userInput > 3);

        if(userInput < 1 || userInput > 3){
            System.out.println("La valeur "+userInput+" ne fait pas partie de l'intervalle spécifiée.. \n");
        }
    }
}
