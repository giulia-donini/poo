public class RationalVector {
    private Rational[] vector;

    public RationalVector(int size) {

        vector = new Rational[size];
        for (int i = 0; i < size; i++) {
            vector[i] = new Rational(0, 1); // Initialiser chaque élément à 0/1
        }

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

    public Rational get(int index) {
        if (index < 0 || index >= vector.length) {
            throw new ArrayIndexOutOfBoundsException("index hors limites.");
        }
        return vector[index];
    }

    public void multiply(Rational value) {
        for (int i = 0; i < vector.length; i++) {
            vector[i] = vector[i].mult(value);
        }
    }

    public void add(RationalVector other) {
        if (other.vector.length != this.vector.length) {
            throw new IllegalArgumentException("vectors doivent avoir la même taille");
        }
        for (int i = 0; i < vector.length; i++) {
            vector[i] = vector[i].add(other.vector[i]);
        }
    }
}