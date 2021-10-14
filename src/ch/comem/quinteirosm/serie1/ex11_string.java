package ch.comem.quinteirosm.serie1;

import java.util.Locale;
import java.util.Scanner;

// J'ai fait une version avec une variable de type string car répondre par true ou false ne fait pas sens :(

public class ex11_string {
    public static void main(String[] args) {
        Scanner userInput1 = new Scanner(System.in).useLocale(new Locale("fr-CH"));
        System.out.println("Veuillez saisir un nombre :");
        int nombre = userInput1.nextInt();

        Scanner userInput2 = new Scanner(System.in).useLocale(new Locale("fr-CH"));
        System.out.println("Veuillez saisir un diviseur :");
        int diviseur = userInput2.nextInt();

        String resultat="";
        if(nombre%diviseur==0){
            resultat="Oui!";
        }else if(nombre%diviseur>0){
            resultat="Non.";
        }

        System.out.println(nombre+" est-il divisible par "+diviseur+" ? "+resultat);
    }}