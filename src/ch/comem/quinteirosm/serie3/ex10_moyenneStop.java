package ch.comem.quinteirosm.serie3;

import java.util.Locale;
import java.util.Scanner;

public class ex10_moyenneStop {
  public static void main(String[] args) {
    Scanner input = new Scanner(System.in).useLocale(new Locale("fr-CH"));
    double nbNote=0;
    double note=1;
    double moyenne =1;
    double meilleure=1;

    System.out.println("Une note non valide exécutera le programme");

    while(note>=1.0&&note<=6.0) {
      System.out.println("Entrez la " + (nbNote+1) + "note [1;6] :");
      note = input.nextDouble();
      if(note>meilleure){
        meilleure=note;
      }
      moyenne+=note;
      nbNote+=1;
    }
    System.out.println("Votre moyenne est de "+moyenne/nbNote+" et votre meilleure note est un "+meilleure);
  }
}
