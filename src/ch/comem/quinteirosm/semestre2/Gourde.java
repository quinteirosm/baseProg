package ch.comem.quinteirosm.semestre2;

public class Gourde {
            private String color;
            private boolean open;

            public Gourde(){
                color="noire";
                open=false;
                System.out.println("On passe par le constructeur");
            }

            public String rendColor() {
                return color;
            }

            public boolean isOpen(){
                return open;
            }

            public void open(){
                open=true;
            }

            public void close(){
                open=false;
            }
        }