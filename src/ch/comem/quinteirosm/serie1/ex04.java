package ch.comem.quinteirosm.serie1;

public class ex04 {
  public static void main(String[] args) {
    int x = 1;
    int y = 2;

    System.out.println("Avant");
    System.out.println("x=" + x);
    System.out.println("y=" + y);
    Entier a = new Entier(x);
    Entier b = new Entier(y);
    swap(a, b);

    System.out.println("Après");
    System.out.println("x=" + a.value);
    System.out.println("y=" + b.value);

  }

  public static void swap(Entier x,Entier y){
    int temp = x.value;
    x.value=y.value;
    y.value=temp;
  }
}
class Entier{
  int value;
  Entier(int x){
    this.value=x;
  }
}