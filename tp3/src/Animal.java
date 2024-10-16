public class Animal {
    private String nom;
    private int poids;
    protected static Regime regime;

    public Animal(String nom, int poids) {
        this.nom = nom;
        this.poids = poids;
    }
    public String getNom() {
        return nom;
    }
    public int getPoids() {
        return poids;
    }
    public void crier(){
        System.out.println(nom + " crie...");
    }
    public Regime getRegime() {
        return regime;
    }

    // Méthode par défaut pour la quantité de nourriture
    public double calcQntNourriture() {
        return 0; // À surcharger selon l'espèce
    }

    @Override
    public String toString () {
        return " L'animal s'appele " + nom + " et pèse : " + poids ;
    }
}
