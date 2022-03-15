package ch.comem.quinteirosm.semestre2.exoChaise;

public class Chaise {
    public static final int NB_PIED = 4;
    public final int NUMERO;
    private static int numeroChaiseSuivante=1;

    public Chaise() {
        this.NUMERO = Chaise.numeroChaiseSuivante;
        Chaise.numeroChaiseSuivante++;
    }

    public static int rendNumeroChaiseSuivante(){
        return Chaise.numeroChaiseSuivante;
    }
}