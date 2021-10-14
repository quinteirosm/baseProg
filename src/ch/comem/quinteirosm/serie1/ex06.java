package ch.comem.quinteirosm.serie1;

import java.util.Locale;
import java.util.Scanner;

public class ex06 {
  public static void main(String[] args) {
    Scanner userInput = new Scanner(System.in).useLocale(new Locale("fr-CH"));  // Create a Scanner object
    System.out.println("Veuillez saisir la valeur du rayon du cercle :");
    double rayon = userInput.nextDouble();

    double aire=Math.PI*(Math.pow(rayon,2));
    double perimetre=2*Math.PI*rayon;

    System.out.println("La surface du cercle est de :"+aire);
    System.out.println("La circonférence est de :"+perimetre);
  }
}
