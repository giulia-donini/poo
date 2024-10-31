public class UnaireSin extends ExpUnaire {
    public UnaireSin(ExpAbstraite operande) {
        super(operande, "sin");
    }

    @Override
    public double evaluer(Env env) {
        return Math.sin(operande.evaluer(env));
    }
}
