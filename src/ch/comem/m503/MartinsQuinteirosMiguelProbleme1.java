package ch.comem.quinteirosm.questionnaire.m503;

import java.util.Locale;
import java.util.Scanner;

public class MartinsQuinteirosMiguelProbleme1 {
    public static void main(String[] args) {
        Scanner userInput = new Scanner(System.in).useLocale(new Locale("fr-CH"));
        String choixBoisson;
        String[] nomBoisson={"Eau", "Thé froid", "jus de Pommes", "Quitter"};
        String[] toucheBoisson={"E", "T", "P", "Q"};
        boolean trouve = false;
        do{
            System.out.println("Quelle boisson voulez-vous?");
            for (int i=0; i<nomBoisson.length; i++){
                System.out.println("Tapez "+toucheBoisson[i]+" pour : "+nomBoisson[i]);
            }
            choixBoisson = userInput.nextLine().trim();

            int i = -1;
            do {
                i++;
                trouve = toucheBoisson[i].equals(choixBoisson);
            } while (!trouve && i<toucheBoisson.length-1);

            if (trouve && !choixBoisson.equals("Q")){
                System.out.println("Vôtre "+nomBoisson[i] +" est prêt(e)");
            }else if(trouve && choixBoisson.equals("Q")){

            }else{
                System.out.println("Votre choix ne correspond pas à une des options !");
            }
        }while(!trouve);
    }
}
