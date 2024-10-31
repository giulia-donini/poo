public class BinairePlus extends ExpBinaire {
    public BinairePlus(ExpAbstraite gauche, ExpAbstraite droit) {
        super(gauche, droit, "+");
    }
    
    @Override
    public String toStringInfixe(){

        return "("+this.gauche.toStringInfixe()+"+"+this.droit.toStringInfixe()+")";

    }

    @Override
    public double evaluer(Env env) {
        return gauche.evaluer(env) + droit.evaluer(env);
    }
}