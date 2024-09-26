public class RationalVector {
    private Rational[] vector;

    public RationalVector(int size) {
        vector = new Rational[size];
    }

    public String toString() {
        String result = "(";
        for (int i = 0; i < vector.length; i++) {
            result += vector[i].num + "/" + vector[i].denom;
            if (i < vector.length - 1) {
                result += ", ";
            }
        }
        result += ")";
        return result;
    }

    public void set(int index, Rational value) {
        if (index < 0 || index >= vector.length) {
            throw new ArrayIndexOutOfBoundsException("index hors limites.");
        }
        vector[index] = value;
    }
}