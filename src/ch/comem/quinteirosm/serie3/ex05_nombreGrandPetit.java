package ch.comem.quinteirosm.serie3;

import java.util.Locale;
import java.util.Scanner;

public class ex05_nombreGrandPetit {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in).useLocale(new Locale("fr-CH"));

        int[] nombres = new int[5];
        int petitNb=Integer.MAX_VALUE;
        int grandNb=Integer.MIN_VALUE;

        for(int i=0; i<nombres.length; i++){
            System.out.println("Entrez le "+(i+1)+" nombre");
            nombres[i] = input.nextInt();

            if(nombres[i]<petitNb){
                petitNb=nombres[i];
            }else if(nombres[i]>grandNb){
                grandNb=nombres[i];
            }
        }

        System.out.println("Le plus petit nombre saisi est "+petitNb);
        System.out.println("Le plus grand nombre saisi est "+grandNb);
    }
}
