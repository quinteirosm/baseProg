package ch.comem.quinteirosm.serie3;

public class ex12_damier {
    public static void main(String[] args) {
        int largeur=8;
        int longueur=8;

        for (int i=0; i<longueur; i++){
            for (int x=0; x<largeur; x++){
                if((i%2!=0 && x%2==0) || (i%2==0 && x%2!=0)){
                    System.out.print("  #");
                }else{
                    System.out.print("  o");
                }
            }
            System.out.println("");
        }
    }
}