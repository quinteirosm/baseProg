package ch.comem.quinteirosm.serie4;

public class ex05_temperature {
    public static void main(String[] args) {
        double[] temperatures = {0.7,2,5.5,9,13,16.3,18.1,17.6,14.8,10.1,5,2.3};

        double petitNb=Integer.MAX_VALUE;
        double grandNb=Integer.MIN_VALUE;

        for(int i=0; i<temperatures.length; i++){
            if(temperatures[i]<petitNb){
                petitNb=temperatures[i];
            }else if(temperatures[i]>grandNb){
                grandNb=temperatures[i];
            }
        }

        double moyenne=0;
        for (double temperature : temperatures) {
            moyenne += temperature;
        }
        moyenne/=temperatures.length;

        double deviation=0;

        System.out.printf("Max: %f\nMin: %f\nEtendue: %f\nMoyenne des temperatures: %f\nDeviation moyenne: %f\n", petitNb, grandNb,(grandNb-petitNb),moyenne,deviation);
    }
}
