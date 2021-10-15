package ch.comem.quinteirosm.serie2;

import java.util.Locale;
import java.util.Scanner;

public class ex08_lesAiles {
  public static void main(String[] args) {
    Scanner userInput = new Scanner(System.in).useLocale(new Locale("fr-CH"));
    System.out.println("Entrez le prix du billet :");
    double price = userInput.nextDouble();

    System.out.println(
      "Tapez 1 si vous êtes un client normal,\n" +
      "Tapez 2 si vous êtes un employé de la compagnie,\n" +
      "Tapez 3 si vous êtes membre du club CIGOGNE.");
    int status = userInput.nextInt();

    System.out.println("Entez le nombre de vols effectués avec notre compagnie :");
    int vol = userInput.nextInt();

    double rabaisVol = 0;

    if(vol>=5){
      rabaisVol = 20;
    }else if(vol>1){
      rabaisVol = 15;
    }else if(vol>0){
      rabaisVol = 10;
    }

    switch (status){
      /* unused
        case 1:
        // normal
        break;
      */
      case 2:
        //employe
        rabaisVol+=20;
        break;
      case 3:
        //membre
        rabaisVol+=10;
        break;
    }
    System.out.printf("Prix de base : %.2f CHF \n", price);
    System.out.printf("Votre rabais : %d%% \n",(int)rabaisVol);
    System.out.printf("Votre prix : %.2f CHF \n",roundFive(price-price*rabaisVol/100d));
  }

  public static double roundFive(double price) {
    return Math.round(price*20)/20d;
  }
}
