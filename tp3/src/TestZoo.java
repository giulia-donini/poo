public class TestZoo {
    public static void main(String[] args) {
        Zoo Ensimag = new Zoo("Ensimag");

        Vache marie = new Vache("marie", 40, 2);
        Canard matthieu = new Canard("matthieu", 60, "green");
        Vache karine = new Vache("karine", 46, 178);
        Canard nicolas = new Canard("nicolas", 15, "blue");

        Ensimag.ajouteAnimal(marie);
        Ensimag.ajouteAnimal(matthieu);
        Ensimag.ajouteAnimal(karine);
        Ensimag.ajouteAnimal(nicolas);

        Ensimag.crier();

        // Calcul et affichage du coût total de la nourriture dans le zoo
        double coutTotalNourriture = Ensimag.calcCoutTotalNourriture();
        System.out.println("Le coût total de la nourriture pour le zoo Ensimag est de : " + coutTotalNourriture + " euros par jour.");

    }
}
