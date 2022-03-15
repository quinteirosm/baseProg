package ch.comem.m503.exoPorteSerrureCle;

/**
 * Permet de tester nos différentes classes (Fabriques d'objets)
 */
public class progPorteSerrureCle {
    public static void main(String[] args) {
        System.out.println();
        System.out.println("Porte 1");
        // On crée une porte
        Porte porte1 = new Porte();
        System.out.println(porte1.rendDescription());
        // On ouvre la porte (comme elle n'a pas de serrure, elle s'ouvre)
        porte1.ouvre();
        System.out.println(porte1.rendDescription());
        // On crée une serrure
        Serrure serrure1 = new Serrure(5);
        System.out.println(serrure1.rendDescription());
        // On ajoute la serrure à la porte
        porte1.ajouteSerrure(serrure1);
        System.out.println(porte1.rendDescription());
        // On crée une clé
        Cle cle = new Cle(5);
        System.out.println(cle.rendDescription());
        // On ferme la serrure avec la clé (comme elle ont le même numéro, cela fonctionne)
        serrure1.ferme(cle);
        System.out.println(serrure1.rendDescription());
        // Comme la serrure est sur la porte, l'état de la porte en dépend
        System.out.println(porte1.rendDescription());
        // On essaye de fermer la porte. Cela ne fonctionne pas car la serrure est fermée ;-)
        porte1.ferme();
        System.out.println(porte1.rendDescription());
        // On ouvre donc la serrure avec la cle
        serrure1.ouvre(cle);
        // On essaye de fermer la porte. Cela fonctionne car la serrure est ouverte :-)
        porte1.ferme();
        System.out.println(porte1.rendDescription());

        // Porte 2
        System.out.println();
        System.out.println("Porte 2");
        Porte porte2 = new Porte(); // On crée une nouvelle porte
        porte2.ajouteSerrure(new Serrure(7)); // On y ajoute une nouvelle serrure
        porte2.rendSerrure().ferme(new Cle(7)); // On ferme la serrure de la porte avec une nouvelle clé
        porte2.ouvre(); // On essaye d'ouvrir la porte. Cela ne fonctionne pas car la serrure est fermée.
        System.out.println(porte2.rendDescription());
        // On ouvre la serrure de la porte avec une nouvelle clé (la clé 7 précédente est perdue ;-)
        porte2.rendSerrure().ouvre(new Cle(7));
        porte2.ouvre(); // On essaye d'ouvrir la porte. Cela fonctionne puisque la serrure est ouverte :-)
        System.out.println(porte2.rendDescription());

        // Porte 3 et 4
        System.out.println();
        System.out.println("Porte 3 et 4");
        Porte porte3 = new Porte();
        Serrure serrure = new Serrure(3);
        serrure = porte3.ajouteSerrure(serrure);
        System.out.println(serrure); // null puisque la serrure est sur la porte !
        Serrure autreSerrure = new Serrure(4);
        autreSerrure = porte3.ajouteSerrure(autreSerrure);
        System.out.println(porte3.rendDescription()); // C'est bien une serrue no 3 sur la porte
        System.out.println(autreSerrure); // pas null puisqu'il y avait déjà une serrure sur la porte
        // Du coup on peut la monter sur une autre porte :-)
        Porte porte4 = new Porte();
        porte4.ajouteSerrure(autreSerrure);
        System.out.println(porte4.rendDescription());
    }
}