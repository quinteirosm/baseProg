package ch.comem.quinteirosm.questionnaire.m503;

import java.util.Locale;
import java.util.Scanner;

public class MartinsQuinteirosMiguelProbleme2{
    public static void main(String[] args) {
        Scanner userInput = new Scanner(System.in).useLocale(new Locale("fr-CH"));

        System.out.println("Combien de villes voulez-vous saisir ?");
        Integer nbVille = userInput.nextInt();

        String[] nomVille = new String[nbVille];
        int[] distanceVille = new int[nbVille];
        int distance=0;

        for(int i=0; i<nomVille.length; i++){
            System.out.println("Nom de la " + (i+1) + "e gare : ");
            nomVille[i] = userInput.next().trim();
        }

        for(int i=0; i<distanceVille.length-1; i++){
            System.out.println("Distance entre "+nomVille[i]+" et "+nomVille[i+1]+" ?");
            distanceVille[i] = userInput.nextInt();
        }

        System.out.println("Veuillez saisir la ville de départ :");
        String nomDepart = userInput.next().trim();
        boolean trouve = false;
        int i = -1;
        do {
            i++;
            trouve = nomVille[i].equals(nomDepart);
        } while (!trouve && i<nomVille.length-1);

        System.out.println("Veuillez saisir la ville d'arrivée :");
        String nomArrivee = userInput.next().trim();
        trouve = false;
        int j = -1;
        do {
            j++;
            trouve = nomVille[j].equals(nomArrivee);
        } while (!trouve && j<nomVille.length-1);

        if(i<j){
            do{
                distance+=distanceVille[i];
                i++;
            }while(i<j);
        }else{
            do{
                distance+=distanceVille[j];
                j++;
            }while(j<i);
        }

        if(distance>=0){
            System.out.println("La distance entre "+nomDepart+" et "+nomArrivee+" est de "+distance+" [km]");
        }
    }
}
