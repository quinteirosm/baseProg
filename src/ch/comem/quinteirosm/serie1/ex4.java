package ch.comem.quinteirosm.serie1;

public class ex4 {
    public static void main(String[] args) {
        int x1 = 1;
        int y1 = 2;
        int x2 = 0;
        int y2 = 0;

        x2 = y1;
        y2 = x1;

        System.out.println("Avant");
        System.out.println("x=" + x1);
        System.out.println("y=" + y1);
        System.out.println("Après");
        System.out.println("x=" + x2);
        System.out.println("y=" + y2);
    }
}
