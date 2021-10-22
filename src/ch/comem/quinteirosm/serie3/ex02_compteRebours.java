package ch.comem.quinteirosm.serie3;

import java.util.Locale;
import java.util.Scanner;

public class ex02_compteRebours {
    public static void main(String[] args) {
        int userInput=0;
        while(userInput<=0){
            Scanner input = new Scanner(System.in).useLocale(new Locale("fr-CH"));
            System.out.println("Veuillez saisir un nombre strictement positif");
            userInput = input.nextInt();

            if(userInput > 0){
                System.out.println("Compte à rebours à partir de "+userInput+"\n");
                for (int i = userInput; i >= 0; --i) {
                    System.out.println(i);
                }
            }else{
                System.out.println("Le nombre n'est pas strictement positif\n");
            }
        }
    }
}
