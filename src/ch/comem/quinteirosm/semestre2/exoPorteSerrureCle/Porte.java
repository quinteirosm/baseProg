package ch.comem.quinteirosm.semestre2.exoPorteSerrureCle;

/**
 * Permet de simuler une porte pouvant :
 * - s'ouvrir et se fermer
 * - posséder ou non une serrure
 */
public class Porte {
    private Serrure serrure;
    private boolean estOuverte;

    /**
     * Crée une porte fermée sans serrure
     */
    public Porte() {
        this.serrure = null;
        this.estOuverte = false;
    }

    /**
     * Permet d'ajouter la serrure spécifiée à la porte
     * @param serrureAAjouter La serrure à ajouter
     * @return null si la serrure a pu être ajoutée, sinon rend la serrure spécifiée
     */
    public Serrure ajouteSerrure(Serrure serrureAAjouter) {
        Serrure serrureARetourner = null;
        // est-ce que la serrureAAjouter existe ?
        if (serrureAAjouter != null) {
            // S'il la porte n'a pas de serrure, on peut l'ajouter
            if (this.serrure == null) {
                this.serrure = serrureAAjouter;
            }
            // Il y a déjà une serrure ! On retourne donc la serrureAAjouter
            else {
                serrureARetourner = serrureAAjouter;
            }
        }
        return serrureARetourner;
    }

    /**
     * Permet d'enlever (et de récupérer) la serrure de la porte
     * @return La serrure ou null (s'il n'y en avait pas)
     */
    public Serrure enleveSerrure() {
        Serrure serrureARetourner = this.serrure;
        this.serrure = null;
        return serrureARetourner;
    }

    /**
     * Permet d'accéder à la serrure de la porte
     * @return La serrure ou null
     */
    public Serrure rendSerrure() {
        return this.serrure;
    }

    /**
     * Permet d'ouvrir la porte (si c'est possible)
     * @return true si elle a pu être ouverte, false sinon
     */
    public boolean ouvre() {
        boolean aEteOuverte = false;
        // si la porte est fermée
        if (!this.estOuverte) {
            // si la porte possède une serrure
            if (this.serrure != null) {
                // si la serrure est ouverte on peut ouvrir la porte :-)
                if (this.serrure.estOuverte()) {
                    this.estOuverte = true;
                    aEteOuverte = true;
                }
            // La porte n'a pas de serrure, on peut l'ouvrir
            } else {
                this.estOuverte = true;
                aEteOuverte = true;
            }
        }
        return aEteOuverte;
    }

    /**
     * Permet de fermer la porte (si c'est possible)
     * @return true si la porte a pu être fermée, false sinon
     */
    public boolean ferme() {
        boolean aEteFermee = false;
        // si la porte est ouverte
        if (this.estOuverte) {
            // si la porte possède une serrure
            if (this.serrure != null) {
                // si la serrure est ouverte on peut fermer la porte :-)
                if (this.serrure.estOuverte()) {
                    this.estOuverte = false;
                    aEteFermee = true;
                }
            // La porte n'a pas de serrure, on peut la fermer
            } else {
                this.estOuverte = false;
                aEteFermee = true;
            }
        }
        return aEteFermee;
    }

    /**
     * Permet de savoir si la porte est ouverte ou non
     * @return true si la porte est ouverte, false sinon
     */
    public boolean estOuverte() {
        return this.estOuverte;
    }

    /**
     * Rend une description de la porte
     * @return Description de la porte
     */
    public String rendDescription() {
        // L'objet StringBuilder est particulièrement adapté pour la construction d'une
        // chaîne de caractère.
        // Cela permet d'être plus efficace que la concaténation à l'aide du +. Exemple :
        // String chaine = "porte " + "ouverte " + "avec ... ";
        StringBuilder builder = new StringBuilder("porte ");
        if (this.estOuverte) {
            builder.append("ouverte ");
        } else {
            builder.append("fermée ");
        }
        if (this.serrure != null) {
            builder.append("avec ");
            builder.append(this.serrure.rendDescription());
        } else {
            builder.append("sans serrure");
        }
        return builder.toString();
    }
}