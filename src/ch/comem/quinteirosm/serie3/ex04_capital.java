package ch.comem.quinteirosm.serie3;

import java.util.Locale;
import java.util.Scanner;

public class ex04_capital {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in).useLocale(new Locale("fr-CH"));
        System.out.println("Entrez le capital (>0) de départ");
        double capital = input.nextInt();

        System.out.println("Entrez le taux d'intérêt en %");
        double tauxInteret = input.nextInt();

        System.out.println("Entrez le nombre de périodes (>0)");
        int periodes = input.nextInt();

        System.out.println("Une somme de "+capital+" placée durant "+periodes+" période(s) avec un taux d'intérêt de "+tauxInteret+"% génère : ");

        for (int i=0; i<periodes; i++){
            capital=capital+capital*tauxInteret/100;
            System.out.println("Après "+i+" période(s) : "+capital);
        }
    }
}