package ch.comem.quinteirosm.serie1;

import java.util.InputMismatchException;
import java.util.Locale;
import java.util.Scanner;

public class ex11_boolean {
  public static void main(String[] args) {
    Scanner userInput1 = new Scanner(System.in).useLocale(new Locale("fr-CH"));
    System.out.println("Veuillez saisir un nombre :");

    int nombre;

    while (true){
      try{
        nombre = userInput1.nextInt();
      }catch (InputMismatchException e){
        System.out.println("Ce n'est pas un nombre");
        userInput1.nextLine();
        continue;
      }
      break;
    }

    Scanner userInput2 = new Scanner(System.in).useLocale(new Locale("fr-CH"));
    System.out.println("Veuillez saisir un diviseur :");
    int diviseur = userInput2.nextInt();

    boolean resultat=false;
    if(nombre%diviseur==0){
      resultat=true;
    }

    System.out.println(nombre+" est-il entièrement divisible par "+diviseur+" ? "+(resultat ? "Oui !" : "Non !"));
  }}