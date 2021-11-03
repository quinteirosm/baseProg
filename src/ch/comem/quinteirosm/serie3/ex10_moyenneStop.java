package ch.comem.quinteirosm.serie3;

import java.util.Locale;
import java.util.Scanner;

public class ex10_moyenneStop {
  public static void main(String[] args) {
    Scanner input = new Scanner(System.in).useLocale(new Locale("fr-CH"));
    double compteur=1;
    double note=1;

    System.out.println("Une note non valide exécutera le programme");

    while(note>=1.0&&note<=6.0) {
      System.out.println("Entrez la " + compteur + "note [1;6] :");
      note = input.nextDouble();
    }
  }
}
