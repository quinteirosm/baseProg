package ch.comem.quinteirosm.semestre2.exoChaise;

public class ProgChaise {
    public static void main(String[] args) {
        Chaise[] tabChaises = new Chaise[7];

        for(int i=0;i<tabChaises.length;i++){
            tabChaises[i] = new Chaise();
            System.out.println(tabChaises[i].NUMERO);
        }
    }
}