import java.util.LinkedList;

public class Zoo {
    private String nom;
    private LinkedList<Animal> animaux;

    public Zoo(String nom) {
        this.nom = nom;
        animaux = new LinkedList<Animal>();
    }

    public int getNbAnimaux() {
        return animaux.size();
    }

    public void ajouteAnimal(Animal animal) {
        animaux.add(animal);
    }

    // fais crier tous les animaux. Bonjour l'ambiance...
    public void crier() {
        System.out.println("*** 1, 2, 3 crions:");
        for (Animal a : animaux) {
            a.crier();
        }
    }

    public double calcCoutTotalNourriture() {
        double coutTotal = 0;
        for (Animal a : animaux) {
            coutTotal += a.calcQntNourriture() * a.getRegime().getPrix();
        }
        return coutTotal;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Le zoo " + nom + " contient " + getNbAnimaux() + " animaux:");
        sb.append(animaux.toString());
        return sb.toString();

        // alternative:
        // return "le zoo " + nom + "contient:" + animaux;
    }
}
