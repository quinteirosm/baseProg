package ch.comem.quinteirosm.serie2;

import java.util.Locale;
import java.util.Scanner;

public class ex11_date {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in).useLocale(new Locale("fr-CH"));

        boolean valid = false;
        String valide = "";

        System.out.println("Saisissez le jour de la date en nombre");
        int jour = input.nextInt();
        System.out.println("Saisissez le mois de la date en nombre");
        int mois = input.nextInt();
        System.out.println("Saisissez l'année de la date en nombre");
        int annee = input.nextInt();

        if((mois==4 || mois==6 || mois==9 || mois==11) && jour<=30){
            valid=true;
        }else if((annee%4!=0 && annee%100==0) && jour<=28){
            //fev non bisex
            valid=true;
        }else if(((annee%4==0 && annee%100!=0) || annee%400==0) && jour<=29){
            //fev bisex
            valid=true;
        }else if(jour<=31&&mois<=12){
            valid=true;
        }

        if(valid=true){
            valide="valide";
        }else{
            valide="non-valide";
        };

        System.out.println("La date "+jour+"/"+mois+"/"+annee+" est "+valide);
    }
}
