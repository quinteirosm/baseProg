package ch.comem.quinteirosm.serie3;

import java.util.Locale;
import java.util.Scanner;

public class ex06_quinze {
  public static void main(String[] args) {
    int compteur=0;

    Scanner input = new Scanner(System.in).useLocale(new Locale("fr-CH"));

    for(int i=0; i<5; i++){
      System.out.println("Entrez le "+(i+1)+" nombre");
      int nombre = input.nextInt();

      if(nombre<=15){
        compteur+=1;
      }
    }
    System.out.println("Il y a "+compteur+" nombre(s) <= 15");
  }
}
