import java.util.HashMap;
import java.util.Map;

public class Env {
    private final Map<String, Double> valeurs;

    public Env() {
        valeurs = new HashMap<>();
    }

    // Ajouter une variable avec sa valeur
    public void associer(String variable, double valeur) {
        valeurs.put(variable, valeur);
    }

    // Récupérer la valeur d'une variable
    public double obtenirValeur(String variable) throws IllegalArgumentException {
        if (!valeurs.containsKey(variable)) {
            throw new IllegalArgumentException("Variable non définie : " + variable);
        }
        return valeurs.get(variable);
    }
}