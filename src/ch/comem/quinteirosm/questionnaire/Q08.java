package ch.comem.quinteirosm.questionnaire;

public class Q08 {
    public static void main(String[] args) {
        int[][] tab = new int[2][3];
        tab[0][0] = 1;
        tab[0][1] = 2;
        tab[0][2] = 3;
        tab[1][0] = 9;
        tab[1][1] = 8;
        tab[1][2] = 7;

        afficheTab(tab);

        int taille = rendTaille(tab, 2);
    }

    private static void afficheTab(int[][] tab) {
        for (int i=0; i<tab.length; i++){
            for (int j=0;j<tab[0].length;j++){
                System.out.print(tab[i][j]);
                System.out.print(" ");
            }
            System.out.println();
        }
    }

    public static int rendTaille(int[][] tab, int  i) {
        int length=0;
        if(i==1){
            length = tab.length;
        }else if(i==2){
            length = tab.length;
        }else if(i==2){
            length = tab.length;
        }
        return length;
    }
}
