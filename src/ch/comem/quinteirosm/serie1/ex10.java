package ch.comem.quinteirosm.serie1;

import java.util.Locale;
import java.util.Scanner;

public class ex10 {
  public static void main(String[] args) {
    Scanner userInput1 = new Scanner(System.in).useLocale(new Locale("fr-CH"));
    System.out.println("Nombre de photos :");
    int photos = userInput1.nextInt();

    Scanner userInput2 = new Scanner(System.in).useLocale(new Locale("fr-CH"));
    System.out.println("Nombre de photos par ligne :");
    int photosParLigne = userInput2.nextInt();

    int nombreDeLignes = photos / photosParLigne;
    int nombreDePhotosDerniereLigne=photos-photosParLigne*nombreDeLignes;


    System.out.println("Il y aura "+nombreDeLignes+" lignes constituées de "+photosParLigne+" photos.");
    System.out.println("Il y aura "+nombreDePhotosDerniereLigne+" photos sur la dernière ligne.");
  }
}