public class UnaireCos extends ExpUnaire {
    public UnaireCos(ExpAbstraite operande) {
        super(operande, "cos");
    }

    @Override
    public double evaluer(Env env) {
        return Math.cos(operande.evaluer(env));
    }
}