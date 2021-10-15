package ch.comem.quinteirosm.serie2;

import java.util.Locale;
import java.util.Scanner;

public class ex05_posNegNul {
    public static void main(String[] args) {
        Scanner userInput = new Scanner(System.in).useLocale(new Locale("fr-CH"));
        System.out.println("Veuillez saisir un nombre :");
        int nombre = userInput.nextInt();
        if(nombre>0){
            System.out.println("Ce nombre est positif");
        }else if(nombre<0){
            System.out.println("Ce nombre est négatif");
        }else{
            System.out.println("Ce nombre est nul");
        }
    }
}
