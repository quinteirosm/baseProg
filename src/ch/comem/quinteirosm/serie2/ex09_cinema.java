package ch.comem.quinteirosm.serie2;

import java.util.Locale;
import java.util.Scanner;

public class ex09_cinema {
  public static void main(String[] args) {
    Scanner userInput = new Scanner(System.in).useLocale(new Locale("fr-CH"));
    System.out.println("Saisissez l'âge de la personne :");
    int age = userInput.nextInt();

    System.out.println("Veuillez entrer le nom du jour en minuscule (Ex: lundi) :");
    String day = userInput.next().toLowerCase();

    double price=0;

    if(age>18){
      price=15;
    }else if(age<=18 && age>=8){
      price=10;
    }else if(age<=7){
      price=5;
    }

    double rabais = 0;

    if(day.equals("lundi")){
      rabais = 20;
    }else if(day.equals("mardi") || day.equals("jeudi")){
      rabais = 10;
    }

    System.out.printf("Prix de base : %.2f CHF \n", price);
    System.out.printf("Votre rabais : %d%% \n",(int)rabais);
    System.out.printf("Votre prix : %.2f CHF \n",roundDemi(price-price*rabais/100d));

  }
  public static double roundDemi(double price) {
    return Math.round(price*2)/2d;
  }
}
