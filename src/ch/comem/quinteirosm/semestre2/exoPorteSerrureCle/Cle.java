package ch.comem.quinteirosm.semestre2.exoPorteSerrureCle;

/**
 * Permet de simuler une clé ayant un numéro fixe
 */
public class Cle {

    public final int NUMERO; // Propriété permettant de stocker le numéro de la clé
                             // Pas besoin de la protéger car c'est une constante (=> majuscule)

    /**
     * Crée une clé avec le numéro spécifié
     * @param numero Le numéro de la clé
     * Remarque : Si le numéro spécifié est inférieur à zéro, le numéro de clé sera 0
     */
    public Cle(int numero) {
        if (numero > 0) {
            this.NUMERO = numero;
        } else {
            this.NUMERO = 0;
        }
    }

    /**
     * Rend une description de la clé
     * @return Description de la clé
     */
    public String rendDescription() {
        String description = ("clé avec le numéro : " + this.NUMERO);
        return description;
    }
}