public abstract class ExpUnaire extends ExpAbstraite {
    protected ExpAbstraite operande;
    protected String operateur;

    public ExpUnaire(ExpAbstraite operande, String operateur) {
        this.operande = operande;
        this.operateur = operateur;
    }

    @Override
    public String toStringInfixe() {
        return operateur + "(" + operande.toStringInfixe() + ")";
    }

    @Override
    public abstract double evaluer(Env env);
}