package ch.comem.quinteirosm.serie6;

import java.util.Locale;
import java.util.Scanner;

public class exercice01_tabtri {
    public static void main(String[] args) {
        int[] tab = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};

        Scanner userInput = new Scanner(System.in).useLocale(new Locale("fr-CH"));
        System.out.println("Quelle valeur recherchez-vous ?");
        int value = userInput.nextInt();

        int result=indexOf(tab,value);
        System.out.println("La valeur "+value+" est à l'index "+result);
    }

    public static int indexOf(int[] tab, int value){
        int index=tab.length/2;

        do{
            if(index<0 || index>tab.length-1){
                return -1;
            }

            if(tab[index]<value){
                index+=index/2;
            }
            if(tab[index]>value){
                index/=2;
            }
        }while(tab[index]!=value);
        return index;
    }
}