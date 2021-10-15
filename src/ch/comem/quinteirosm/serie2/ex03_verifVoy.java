package ch.comem.quinteirosm.serie2;

import java.util.Locale;
import java.util.Scanner;

public class ex03_verifVoy {
    public static void main(String[] args) {
        Scanner userInput = new Scanner(System.in).useLocale(new Locale("fr-CH"));
        System.out.println("Veuillez saisir une seule lettre :");
        char caractere = userInput.next().charAt(0);

        if(caractere == 'a'){
            System.out.println("Cette lettre est une voyelle.");
        }else if(caractere == 'e'){
            System.out.println("Cette lettre est une voyelle.");
        }else if(caractere == 'i'){
            System.out.println("Cette lettre est une voyelle.");
        }else if(caractere == 'o'){
            System.out.println("Cette lettre est une voyelle.");
        }else if(caractere == 'u'){
            System.out.println("Cette lettre est une voyelle.");
        }else{
            System.out.println("Cette lettre est une consonne.");
        }
}}
