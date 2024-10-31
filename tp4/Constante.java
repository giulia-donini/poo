public class Constante extends ExpAbstraite {
    private final double valeur;

    public Constante(double valeur) {
        this.valeur = valeur;
    }
    
    public Constante(int valeur) {
        this.valeur = (double) valeur;
    }

    @Override
    public String toStringInfixe() {
        return ""+this.valeur;
    }

    @Override
    public double evaluer(Env env) {
        return valeur;
    }
}