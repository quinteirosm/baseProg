package ch.comem.quinteirosm.semestre2.exoPorteSerrureCle;

/**
 * Permet de simuler une serrure ayant un numéro pouvant s'ouvrir et se fermer
 * à l'aide d'une clé ayant le même numéro
 */
public class Serrure {
    public final int NUMERO; // Propriété permettant de stocker le numéro de la clé
    private boolean estOuverte; // Propriété permettant de savoir si la serrure est ouverte ou non

    /**
     * Crée une serrure ayant le numéro spécifié
     * @param numero Le numéro de la serrure
     * Remarque : Si le numéro spécifié est inférieur à zéro, le numéro de la serrure sera 0
     */
    public Serrure (int numero) {
        if (numero > 0) {
            this.NUMERO = numero;
        } else {
            this.NUMERO = 0;
        }
        this.estOuverte = true;
    }

    /**
     * Permet d'ouvrir la serrure à l'aide de la clé spécifiée
     * (La serrure s'ouvre si la clé a le même numéro que la serrure)
     * @param cle La clé à l'aide de laquelle on essaye d'ouvrir la serrure
     * @return true la serrure a pu s'ouvrir, false sinon
     */
    public boolean ouvre(Cle cle) {
        boolean aEteOuverte = false;
        // La variable contient elle l'adresse d'un objet ou pas
        if (cle != null) {
            // Est-ce que le numéro de la clé correspond à celui de la serrure ?
            if (cle.NUMERO == this.NUMERO) {
                this.estOuverte = true; // la serrure est ouverte
                aEteOuverte = true;
            }
        }
        // Permet à l'utilisateur de savoir si la serrure s'est ouverte ou non
        return aEteOuverte;
    }

    /**
     * Permet de fermer la serrure à l'aide de la clé spécifiée
     * @param cle La clé à l'aide de laquelle on essaye de fermer la serrure
     * @return true si la serrure a pu s'ouvrir, false sinon
     */
    public boolean ferme(Cle cle) {
        boolean aEteFermee = false;
         // Y-a-t'il bien l'adresse d'une clé dans la variable "cle"
        if (cle != null) {
            // Est-ce que le numéro de la clé correspond au numéro de la serrure ?
            if (cle.NUMERO == this.NUMERO) {
                this.estOuverte = false; // la serrure est fermée
                aEteFermee = true;
            }
        }
        return aEteFermee;
    }

    /**
     * Permet de savoir si la serrure est ouverte ou non
     * @return true si la serrure est ouverte, false sinon
     */
    public boolean estOuverte() {
        return this.estOuverte;
    }

    /**
     * Rend une description de la serrure
     * @return Description de la serrure
     */
    public String rendDescription() {
        // L'objet StringBuilder est particulièrement adapté pour la construction d'une
        // chaîne de caractère.
        // Cela permet d'être plus efficace que la concaténation à l'aide du +. Exemple :
        // String chaine = "serrue" + "ouverte " + "avec le numéro " + this.NUMERO;
        StringBuilder builder = new StringBuilder("serrue ");
        if (this.estOuverte) {
            builder.append("ouverte ");
        } else {
            builder.append("fermée ");
        }
        builder.append("avec le numéro ");
        builder.append(this.NUMERO);
        return builder.toString();
    }
}