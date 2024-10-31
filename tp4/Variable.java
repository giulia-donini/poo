public class Variable extends ExpAbstraite {
    public String nom;
    public Variable(String nom) {
        this.nom = nom;
    }
    @Override
    public String toStringInfixe(){
        return this.nom;
    }

    @Override
    public double evaluer(Env env) {
        return env.obtenirValeur(nom);
    }
}