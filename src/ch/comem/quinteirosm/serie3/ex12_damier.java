package ch.comem.quinteirosm.serie3;

public class ex12_damier {
    public static void main(String[] args) {
        for (int i=0; i<8; i++){
            for (int x=0; x<8; x++){
                if(x%2==0){
                    System.out.print(" o");
                }else if(x%2!=0){
                    System.out.print(" #");
                }
            }
            System.out.println("");
        }
    }
}