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

        double rabais=0;
        double tva=0;

        if(pieces>=1000){
            rabais=10;
        }else if(pieces>=100){
            rabais=5;
        }else{
            rabais=3;
        }

        if(pieces>500){
            tva = 4.5;
        }else if(pieces>250){
            tva = 6.3;
        }else{
            tva=8.2;
        }

        double prix=pieces*prixUnitaire;
        double prixFinal=((prix/(100+rabais+tva))*100);

        System.out.println("Le prix TTC pour "+pieces+" pièces à "+prixUnitaire+" CHF avec un rabais de "+rabais+"% et un taux TVA à "+tva+"% sera de: "+prixFinal+" CHF");
    }
}
