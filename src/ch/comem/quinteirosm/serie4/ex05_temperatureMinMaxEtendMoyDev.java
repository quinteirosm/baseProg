package ch.comem.quinteirosm.serie4;

public class ex05_temperatureMinMaxEtendMoyDev {
    public static void main(String[] args) {
        double[] temperatures = {0.7,2,5.5,9,13,16.3,18.1,17.6,14.8,10.1,5,2.3};

        double petitNb=Integer.MAX_VALUE;
        double grandNb=Integer.MIN_VALUE;
        double deviation=0;

        double moyenne=0;
        for (double temperature : temperatures) {
            moyenne += temperature;
        }
        moyenne/=temperatures.length;

        for(int i=0; i<=temperatures.length-1; i++){
            if(temperatures[i]<petitNb){
                petitNb=temperatures[i];
            }else if(temperatures[i]>grandNb){
                grandNb=temperatures[i];
            }
            deviation+=Math.abs(moyenne-temperatures[i]);
        }
        deviation/=temperatures.length;

        System.out.printf("Max: %.2f\nMin: %.2f\nEtendue: %.2f\nMoyenne des temperatures: %.2f\nDeviation moyenne: %.2f\n", grandNb, petitNb,(grandNb-petitNb),moyenne,deviation);
    }
}
