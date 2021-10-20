package ch.comem.quinteirosm.serie2;

import java.util.Locale;
import java.util.Scanner;

public class ex10_ventePieceDeta {
    public static void main(String[] args) {
        Scanner userInput = new Scanner(System.in).useLocale(new Locale("fr-CH"));
        System.out.println("Combien de pièces voulez-vous acheter ?");
        double pieces = userInput.nextDouble();

        System.out.println("Quel est le prix unitaire de la pièce ?");
        double prixUnitaire = userInput.nextDouble();

        double rabais;
        double tva;

        if(pieces>=50){
            rabais=3;
        }else if(pieces>=100){
            rabais=5;
        }else if(pieces>=1000){
            rabais=10;
        }

        if(pieces>500){
            tva = 4.5;
        }else if(pieces>250){
            tva = 6.3;
        }else{
            tva=8.2;
        }

        double prixFinal = ((pieces*prixUnitaire)*tva)-(prixUnitaire/(100*rabais));

        System.out.printf("Le prix TTC pour %.2f pièces à %.2f avec un rabais de %.2f et un taux TVA à %.2f % sera de %.2f \n", pieces, prixUnitaire, rabais, tva, prixFinal);
    }
}
