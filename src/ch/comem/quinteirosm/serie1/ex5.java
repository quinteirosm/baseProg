package ch.comem.quinteirosm.serie1;

public class ex5 {
    public static void main(String[] args) {
        int x1 = 1;
        int y1 = 2;
        int z1 = 3;
        int x2 = 0;
        int y2 = 0;
        int z2 = 0;

        x2 = y1;
        y2 = z1;
        z2 = x1;

        System.out.println("Avant");
        System.out.println("x=" + x1);
        System.out.println("y=" + y1);
        System.out.println("y=" + z1);
        System.out.println("Après");
        System.out.println("x=" + x2);
        System.out.println("y=" + y2);
        System.out.println("y=" + z2);
    }
}
