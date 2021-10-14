package ch.comem.quinteirosm.serie1;

public class ex5 {
    public static void main(String[] args) {
        int x = 1;
        int y = 2;
        int z = 3;

        System.out.println("Avant");
        System.out.println("x=" + x);
        System.out.println("y=" + y);
        System.out.println("y=" + z);

        int temp=x;
        x=y;
        y=z;
        z=temp;

        System.out.println("Après");
        System.out.println("x=" + x);
        System.out.println("y=" + y);
        System.out.println("y=" + z);
    }
}
