package ch.comem.quinteirosm.serie5_Suite;

import java.util.Locale;
import java.util.Scanner;

public class Probleme02 {
    public static void main(String[] args) {
        Scanner userInput = new Scanner(System.in).useLocale(new Locale("fr-CH"));
        System.out.println("Combien de villes voulez-vous saisir ?");
        Integer nbVille = userInput.nextInt();
        String[] nomVille=nomVille(nbVille);
        int[] distanceVille=distanceEntreVille(nomVille, nbVille);
        int indexDepart = depart(nomVille);
        int indexArrivee = arrivee(nomVille);
        int distanceEntreVilleDepArr=distanceVilleDepArr(distanceVille,indexDepart,indexArrivee);
        System.out.println("La distance entre "+nomVille[indexDepart]+" et "+nomVille[indexArrivee]+" est de "+distanceEntreVilleDepArr+" [km]");
    }

    public static String[] nomVille(Integer nbVille){
        String[] nomVille = new String[nbVille];
        for(int i=0; i<nomVille.length; i++){
            Scanner userInput = new Scanner(System.in).useLocale(new Locale("fr-CH"));
            System.out.println("Nom de la " + (i+1) + "e gare : ");
            nomVille[i] = userInput.next().trim();
        }
        return nomVille;
    }

    public static int[] distanceEntreVille(String[] nomVille,Integer nbVille){
        int[] distanceVille = new int[nbVille];
        for(int i=0; i<distanceVille.length-1; i++){
            Scanner userInput = new Scanner(System.in).useLocale(new Locale("fr-CH"));
            System.out.println("Distance entre "+nomVille[i]+" et "+nomVille[i+1]+" ?");
            distanceVille[i] = userInput.nextInt();
        }
        return distanceVille;
    }

    public static int depart(String[] nomVille){
        Scanner userInput = new Scanner(System.in).useLocale(new Locale("fr-CH"));
        System.out.println("Veuillez saisir la ville de départ :");
        String nomDepart = userInput.next().trim();
        boolean trouve = false;
        int indexDepart = -1;
        int distance=0;
        do {
            indexDepart++;
            trouve = nomVille[indexDepart].equals(nomDepart);
        } while (!trouve && indexDepart<nomVille.length-1);
        return indexDepart;
    }

    public static int arrivee(String[] nomVille){
        Scanner userInput = new Scanner(System.in).useLocale(new Locale("fr-CH"));
        System.out.println("Veuillez saisir la ville d'arrivée :");
        String nomArrivee = userInput.next().trim();
        boolean trouve = false;
        int indexArrivee = -1;
        do {
            indexArrivee++;
            trouve = nomVille[indexArrivee].equals(nomArrivee);
        } while (!trouve && indexArrivee<nomVille.length-1);
        return indexArrivee;
    }

    public static int distanceVilleDepArr(int[] distanceVille, int indexDepart, int indexArrivee){
        int distance=0;
        if(indexDepart<indexArrivee){
            do{
                distance+=distanceVille[indexDepart];
                indexDepart++;
            }while(indexDepart<indexArrivee);
        }else{
            do{
                distance+=distanceVille[indexArrivee];
                indexArrivee++;
            }while(indexArrivee<indexDepart);
        }
        return distance;
    }
}
