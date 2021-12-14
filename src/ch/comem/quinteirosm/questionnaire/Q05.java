package ch.comem.quinteirosm.questionnaire;

import java.util.Scanner;

public class Q05 {
    public static void main(String[] args) {
        double [] temps=new double[10];
        double diffInt=0;
        double diff=Double.MAX_VALUE;
        int meilleurEssai=0;

        Scanner scanner = new Scanner(System.in);

        for(int i=0; i<temps.length; i++){
            System.out.println("Essai "+(i+1));
            System.out.print("Veuillez appuyer sur la touche Enter pour démarrer le chrono");
            String play = scanner.nextLine();
            long t1 = System.currentTimeMillis();
            System.out.println("Veuillez appuyer sur la touche Enter pour stopper le chrono");
            String stop = scanner.nextLine();
            long t2 = System.currentTimeMillis();
            temps[i]=(t2 - t1)/1000d;
            System.out.println("Votre estimation: "+(temps[i])+" [s]\n");

            if(temps[i]<1.0){
                diffInt = 1-temps[i];
            }else{
                diffInt = temps[i]-1;
            }

            if(diffInt<diff){
                diff=diffInt;
                meilleurEssai=i+1;
            }
        }

        for(int i=0; i<temps.length; i++){
            System.out.println((i+1)+" essai(s) : "+temps[i]+" [s]");
        }

        System.out.printf("\nVotre meilleur essai a été le %d e avec un écart de %.4f [s]", meilleurEssai, diff);
    }
}