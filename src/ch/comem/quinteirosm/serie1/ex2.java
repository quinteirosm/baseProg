package ch.comem.quinteirosm.serie1;

public class ex2 {
    public static void main(String[] args) {
        int nombreDeTours = 3;
        double tempsEnMinParTour = 1.5;

        double tempsTotalEnMin = nombreDeTours * tempsEnMinParTour;

        System.out.println("Le temps effectué pour les " + nombreDeTours + " tours est de " + tempsTotalEnMin + " minutes");
    }
}
