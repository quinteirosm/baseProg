package ch.comem.quinteirosm.serie2;

import java.util.Locale;
import java.util.Scanner;

public class ex02_verifMin {
    public static void main(String[] args) {
        Scanner userInput = new Scanner(System.in).useLocale(new Locale("fr-CH"));
        System.out.println("Veuillez saisir une seule lettre :");
        char caractere = userInput.next().charAt(0);

        if(Character.isLowerCase(caractere)){
            System.out.println("Ce caractère est en minuscule.");
        }else{
            System.out.println("Ce caractère est en majuscule !");
        }
    }
}