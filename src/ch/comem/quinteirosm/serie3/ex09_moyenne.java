package ch.comem.quinteirosm.serie3;

import java.util.Locale;
import java.util.Scanner;

public class ex09_moyenne{
  public static void main(String[] args) {
    double moyenne = 0;
    double note = 0;
    double meilleure = 1.0;

    Scanner input = new Scanner(System.in).useLocale(new Locale("fr-CH"));
    System.out.println("Combien de notes voulez-vous rentrer?");
    int nbNote = input.nextInt();

    for (int i=1;i<=nbNote;i++){
      System.out.println("Veuillez rentrer votre "+i+" note");
      note = input.nextDouble();
      if(note>=1.0&&note<=6.0){
        if(note>meilleure){
          meilleure=note;
        }
        moyenne+=note;
      }else{
        System.out.println("Cette note est fausse");
        i-=1;
      }
    }
    System.out.println("Votre moyenne est de "+moyenne/nbNote+" et votre meilleure note est un "+meilleure);
  }
}
