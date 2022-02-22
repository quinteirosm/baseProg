package ch.comem.quinteirosm.semestre2;

public class ProgPOO {
    public static void main(String[] args) {
        Gourde uneGourde = new Gourde();

        if(uneGourde.isOpen()==true){
            System.out.println("La gourde est ouverte");
        }else{
            System.out.println("La gourde est fermée");
        }
    }
}
