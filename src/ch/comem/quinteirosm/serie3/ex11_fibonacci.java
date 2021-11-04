package ch.comem.quinteirosm.serie3;

import java.util.Locale;
import java.util.Scanner;

public class ex11_fibonacci {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in).useLocale(new Locale("fr-CH"));
        System.out.println("Quel est l'ordre du nombre de Fibonacci à calculer ? (>=0)");
        int userInput = input.nextInt();
        int fibo=1;

        for (int i=0;i<=userInput;i++){
            if(i==0){
                fibo=0;
            }else if(i==1){
                fibo=1;
            }else{
                fibo=(i-1)+(i-2);
            }
            System.out.println("f("+i+")="+fibo);
        }
    }
}
