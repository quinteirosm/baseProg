package ch.comem.quinteirosm.serie2;

import java.util.Locale;
import java.util.Scanner;

public class ex11_date {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in).useLocale(new Locale("fr-CH"));
        int[] date = {0,0,0};
        System.out.println("Saisissez le jour de la date en nombre");
        date[0] = input.nextInt();
        System.out.println("Saisissez le mois de la date en nombre");
        date[1] = input.nextInt();
        System.out.println("Saisissez l'année de la date en nombre");
        date[2] = input.nextInt();

        if((date[1]==4 || date[1]==6 || date[1]==9 || date[1]==11) && !(date[0]<=30)){
            System.out.println("la date est erronée");
            return;
        }else if(date[1]==2 && !(date[0]<=28)){
            System.out.println("la date est erronée");
            return;
        }

        // exercice pas fini :(
    }
}
