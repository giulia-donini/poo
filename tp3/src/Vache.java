public class Vache extends Animal {
    private int nbTaches;

    static {
        regime = new Regime("herbe", 15);  // Initialisation du régime pour les vaches
    }

    public Vache(String nom, int poids, int nbTaches) {
        super(nom, poids);
        this.nbTaches = nbTaches;
    }

    public int getNbTaches() {
        return nbTaches;
    }

    public void crier(){
        System.out.println(getNom() + ", la vache à " + getNbTaches() + " taches qui tache, crie... il meugle");
    }

    @Override
    public double calcQntNourriture() {
        return getPoids()*0.1; // Les vaches mangent 0.1 kg d'herbe par kg de poids
    }

    public double calcCoutNourriture() {
        return calcQntNourriture() * regime.getPrix();
    }

}
