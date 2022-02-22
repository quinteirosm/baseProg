package ch.comem.m503;

import java.util.Locale;
import java.util.Scanner;

public class MartinsQuinteirosMiguelProbleme1 {
    public static void main(String[] args) {
        Scanner userInput = new Scanner(System.in).useLocale(new Locale("fr-CH"));
        System.out.println("Combien d'articles voulez-vous saisir?");
        int nbrArticles = userInput.nextInt();

        String[] nomArticles=new String[nbrArticles];
        double[] prixArticles=new double[nbrArticles];
        double prixTotal=0;

        for(int i=0; i<nbrArticles; i++){
            nomArticles[i] = nomArticles(nbrArticles,i);
            prixArticles[i] = prixArticles(nbrArticles,i);
            prixTotal += prixArticles[i];
        }
        triArticles(prixArticles,nomArticles);
        ticketBuilder(nomArticles,prixArticles,prixTotal);
    }
    public static String nomArticles(int nbrArticles,int numArticle){
        Scanner userInput = new Scanner(System.in).useLocale(new Locale("fr-CH"));
        System.out.println("Veuillez saisir le nom du "+(numArticle+1)+"e article");
        String nomArticles = userInput.nextLine();
        return nomArticles;
    }
    public static double prixArticles(int nbrArticles, int numArticle){
        Scanner userInput = new Scanner(System.in).useLocale(new Locale("fr-CH"));
        System.out.println("Veuillez saisir le prix du "+(numArticle+1)+"e article");
        double prixArticles = userInput.nextDouble();
        return prixArticles;
    }
    public static void triArticles(double[] arr, String[] arr2) {
        for (int k=0; k<arr.length-1; k++){
            for (int i=0; i<arr.length-1-k; i++){
                if (arr[i] > arr[i+1]) {
                    int temp = (int) arr[i];
                    String temp2 = arr2[i];
                    arr[i] = arr[i+1];
                    arr2[i] = arr2[i+1];
                    arr[i+1] = temp;
                    arr2[i+1] = temp2;
                }
            }
        }
    }
    private static double arrondi(double valeur, double precision) {
        return Math.round(valeur/precision)*precision;
    }
    public static void ticketBuilder(String[] nomArticles,double[] prixArticles, double prixTotal){
        System.out.printf("\n***** TICKET CLIENT *****\n");
        for(int i=nomArticles.length-1;i>=0; i--){
            System.out.printf("%s :\t%.2f\n", nomArticles[i], prixArticles[i]);
        }
        System.out.printf("-------------------------\n");
        System.out.printf("Total sans TVA:\t%.2f\n",prixTotal);
        System.out.printf("TVA (7.7):\t%.2f\n",(prixTotal*7.7/100));
        System.out.printf("-------------------------\n");
        System.out.printf("Total avec TVA:\t%.2f\n",arrondi(prixTotal+(prixTotal/100)*7.7, 0.05));
    }
}