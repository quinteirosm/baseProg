package ch.comem.quinteirosm.serie3;

import java.util.Locale;
import java.util.Scanner;

public class ex11_fibonacci {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in).useLocale(new Locale("fr-CH"));
        System.out.println("Quel est l'ordre du nombre de Fibonacci à calculer ? (>=0)");
        int userInput = input.nextInt();

        int first = 0;
        int second = 1;
        int result = 0;

            for(int i = 0; i <= userInput; i++) {
                if(i==0){
                    System.out.println("f("+0+")="+0);
                }else if(i==1){
                    System.out.println("f("+1+")="+1);
                }else{
                    result = first + second;
                    first = second;
                    second = result;
                    System.out.println("f("+i+")="+result);
                }
            }
        }
    }