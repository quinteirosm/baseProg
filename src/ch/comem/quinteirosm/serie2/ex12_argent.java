package ch.comem.quinteirosm.serie2;

import java.util.Locale;
import java.util.Scanner;
public class ex12_argent {
  public static void main(String[] args) {
    Scanner userInput = new Scanner(System.in).useLocale(new Locale("fr-CH"));
    System.out.println("Veuillez saisir la somme à décomposer en pièces :");
    int somme = userInput.nextInt();

    int piece5 = somme/5;
    int reste = somme%5;

    int piece2 = reste/2;
    reste = reste%2;

    System.out.printf("Il faut %d pièces pour arriver à %d CHF\n", reste+piece2+piece5, somme);
    System.out.printf("%d pièce%s de 5.-\n", piece5, piece5>1?"s":"");
    System.out.printf("%d pièce%s de 2.-\n", piece2, piece2>1?"s":"");
    System.out.printf("%d pièce de 1.-\n", reste);
  }
}
