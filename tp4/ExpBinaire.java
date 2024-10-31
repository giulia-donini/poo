public abstract class ExpBinaire extends ExpAbstraite {
    protected ExpAbstraite gauche;
    protected ExpAbstraite droit;
    protected String operateur;

    public ExpBinaire(ExpAbstraite gauche, ExpAbstraite droit, String operateur) {
        this.gauche = gauche;
        this.droit = droit;
        this.operateur = operateur;
    }

    @Override
    public String toStringInfixe() {
        return "(" + gauche.toStringInfixe() + " " + operateur + " " + droit.toStringInfixe() + ")";
    }

    @Override
    public abstract double evaluer(Env env);
}