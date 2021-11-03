package ch.comem.quinteirosm.serie3;

import java.util.Locale;
import java.util.Scanner;

public class ex07_sommeEntier {
  public static void main(String[] args) {
    Scanner input = new Scanner(System.in).useLocale(new Locale("fr-CH"));
    System.out.println("Entrez un nombre");
    int nombre = input.nextInt();

    System.out.println("La somme des entiers de "+nombre+" vaut "+(nombre*(nombre+1)/2));
    /*
    int result = nombre;
    for(int i=1; i<nombre; ++i){
    result = result+i;}
    System.out.println("La somme des entiers de "+nombre+" vaut "+result);
    */
  }
}
