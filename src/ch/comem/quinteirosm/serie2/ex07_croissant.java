package ch.comem.quinteirosm.serie2;

import java.util.Locale;
import java.util.Scanner;

public class ex07_croissant {
  public static void main(String[] args) {
    Scanner userInput1 = new Scanner(System.in).useLocale(new Locale("fr-CH"));
    System.out.println("Veuillez saisir le 1e nombre :");
    double nombre1 = userInput1.nextDouble();

    Scanner userInput2 = new Scanner(System.in).useLocale(new Locale("fr-CH"));
    System.out.println("Veuillez saisir le 2e nombre :");
    double nombre2 = userInput2.nextDouble();

    Scanner userInput3 = new Scanner(System.in).useLocale(new Locale("fr-CH"));
    System.out.println("Veuillez saisir le 3e nombre :");
    double nombre3 = userInput3.nextDouble();

    double premier=0;
    double deuxieme=0;
    double troisieme=0;

    if(nombre1 <= nombre2) {
      if(nombre2 <= nombre3){
        premier = nombre1;
        deuxieme = nombre2;
        troisieme = nombre3;
      }else if(nombre3 <= nombre1){
        premier = nombre3;
        deuxieme = nombre1;
        troisieme = nombre2;
      }
    }else if(nombre1 <= nombre3) {
      if (nombre3 <= nombre2) {
        premier = nombre1;
        deuxieme = nombre3;
        troisieme = nombre2;
      } else if (nombre2 <= nombre1) {
        premier = nombre2;
        deuxieme = nombre1;
        troisieme = nombre3;
      }
    }else if(nombre2 <= nombre3 && nombre3 <= nombre1){
      premier = nombre2;
      deuxieme = nombre3;
      troisieme = nombre1;
    }else{
      premier = nombre3;
      deuxieme = nombre2;
      troisieme = nombre1;
    }

    System.out.println("Vous avez saisi les valeurs suivantes : "+premier+", "+deuxieme+" et "+troisieme);
  }
}
