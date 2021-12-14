package ch.comem.quinteirosm.questionnaire;
import java.util.Scanner;
import java.util.Locale;

public class Q07 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in).useLocale(new Locale("fr-CH"));

        int entier = scan.nextInt();
        scan.nextLine();
        String chaine = scan.nextLine();
        int entier2 = scan.nextInt();

        System.out.println(entier);
        System.out.println(chaine);
        System.out.println(entier2);
    }
}