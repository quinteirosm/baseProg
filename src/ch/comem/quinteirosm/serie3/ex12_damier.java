package ch.comem.quinteirosm.serie3;

public class ex12_damier {
    public static void main(String[] args) {
        for (int i=0; i<8; i++){
            String ligne="";
            for (int x=0; x<8; x++){
                if (i%2==0&&ligne.endsWith("o")){
                    ligne+="  #";
                }else if(i%2==0&&(ligne.endsWith("#"))||ligne.endsWith("")){
                    ligne+="  o";
                }else if(i%2!=0&&ligne.endsWith("#")){
                    ligne+="  o";
                }else if(i%2!=0&&(ligne.endsWith("o")||ligne.endsWith(""))){
                    ligne+="  #";
                }
            }
            System.out.println(ligne);
        }
    }
}
