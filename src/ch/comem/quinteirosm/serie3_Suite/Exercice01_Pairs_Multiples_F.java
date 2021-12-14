package ch.comem.serie3_Suite;

public class Exercice01_Pairs_Multiples_F {

    public static void main(String[] args) {
        afficheEntiersPairsComprisEntre0et10();
        afficheEntiersPairsEtMultiplesDe7ComprisEntre0et100();
        afficheEntiersPairsEtMultiplesDe3et7ComprisEntre0et100();
        afficheEntiersPairsEtMultiplesDe3etNonDe7ComprisEntre0et100();
    }
    
    public static void afficheEntiersPairsComprisEntre0et10() {
        System.out.println("Entiers pairs compris entre 0 et 1");
        for (int entier=0; entier<=10; entier+=2) {
            System.out.println(entier);
        }
        System.out.println();
    }
    
    public static void afficheEntiersPairsEtMultiplesDe7ComprisEntre0et100() {
        System.out.println("Entiers pairs et multiples de 7 compris entre 0 et 100");
        for (int entier=0; entier<=100; entier+=2) {
            if (entier%7==0) System.out.println(entier);
        }
        System.out.println();
    }
    
    public static void afficheEntiersPairsEtMultiplesDe3et7ComprisEntre0et100() {
        System.out.println("Entiers pairs et multiples de 3 et 7 compris entre 0 et 100");
        for (int entier=0; entier<=100; entier+=2) {
            if (entier%3==0 && entier%7==0) System.out.println(entier);
        }
        System.out.println();
    }
    
    public static void afficheEntiersPairsEtMultiplesDe3etNonDe7ComprisEntre0et100() {
        System.out.println("Entiers pairs et multiples de 3, mais non de 7 compris entre 0 et 100");
        for (int entier=0; entier<=100; entier+=2) {
            if (entier%3==0 && entier%7!=0) System.out.println(entier);
        }
        System.out.println();
    }    
}