public class Canard extends Animal {
    private String colorPlumes;

    static {
        regime = new Regime("graines", 2.5);
    }

    public Canard(String nom, int poids, String colorPlumes) {
        super(nom, poids);
        this.colorPlumes = colorPlumes;
    }

    public String getColorPlumes() {
        return colorPlumes;
    }

    public void crier(){
        System.out.println(getNom() + " crie... Ce canard de " + getPoids()+ " aux belles plumes " + getColorPlumes() + " tuxien cancane !");
    }

    @Override
    public double calcQntNourriture() {
        return 1.0;  // Tous les canards mangent 1 kg de nourriture par jour
    }

    public double calcCoutNourriture() {
        return calcQntNourriture() * regime.getPrix();
    }

}
