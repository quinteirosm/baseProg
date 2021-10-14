package ch.comem.quinteirosm.serie1;

public class ex03 {
  public static void main(String[] args) {
    int nombreDeTours2 = 3;
    double tempsEnMinParTour2 = 1.5;

    nombreDeTours2 += 1;
    double tempsTotalEnMin2 = nombreDeTours2 * tempsEnMinParTour2;

    System.out.println("Le temps effectué pour les " + nombreDeTours2 + " tours est de " + tempsTotalEnMin2 + " minutes");
  }
}
