package ch.comem.quinteirosm.serie3;

import java.util.Locale;
import java.util.Scanner;

public class ex08_factorielle {
  public static void main(String[] args) {
    Scanner input = new Scanner(System.in).useLocale(new Locale("fr-CH"));
    System.out.println("Entrez un nombre");
    int nombre = input.nextInt();

    int factorielle = nombre;

    for(int i=1; i<nombre; ++i){
      factorielle = factorielle*i;
    }

    System.out.println("La factorielle de "+nombre+" vaut "+factorielle);
  }
}