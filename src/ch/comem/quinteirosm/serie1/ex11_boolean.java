package ch.comem.quinteirosm.serie1;

import java.util.Locale;
import java.util.Scanner;

public class ex11_boolean {
    public static void main(String[] args) {
        Scanner userInput1 = new Scanner(System.in).useLocale(new Locale("fr-CH"));
        System.out.println("Veuillez saisir un nombre :");
        int nombre = userInput1.nextInt();

        Scanner userInput2 = new Scanner(System.in).useLocale(new Locale("fr-CH"));
        System.out.println("Veuillez saisir un diviseur :");
        int diviseur = userInput2.nextInt();

        boolean resultat=false;
        if(nombre%diviseur==0){
            resultat=true;
        }else if(nombre%diviseur>0){
            resultat=false;
        }

        System.out.println(nombre+" est-il entièrement divisible par "+diviseur+" ? "+resultat);
    }}