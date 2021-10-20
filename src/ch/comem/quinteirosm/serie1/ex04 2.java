package ch.comem.quinteirosm.serie1;

public class ex04 {
  public static void main(String[] args) {
    int x = 1;
    int y = 2;

    System.out.println("Avant");
    System.out.println("x=" + x);
    System.out.println("y=" + y);

    int temp = x;
    x=y;
    y=temp;

    System.out.println("Après");
    System.out.println("x=" + x);
    System.out.println("y=" + y);
  }
}
