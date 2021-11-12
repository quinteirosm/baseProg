package ch.comem.quinteirosm.serie4;

import java.util.Arrays;
import java.util.Locale;
import java.util.Scanner;

public class ex03_file {
    public static void main(String[] args) {
        int i=0;

        String[] tableau = {"Aline","Roger","Julia","Steven","Jules"};

        Scanner userInput = new Scanner(System.in).useLocale(new Locale("fr-CH"));
        System.out.println("Veuillez saisir un prénom :");
        String input = userInput.nextLine();

            for (i=0; i < tableau.length-1; i++){
                if(input==tableau[i]){
                    System.out.println(input+" se trouve en "+i+"e position dans la file");
                }else{
                    break;
                }
            }
    }
}