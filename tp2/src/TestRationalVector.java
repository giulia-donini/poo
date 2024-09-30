public class TestRationalVector {
    public static void main(String[] args) {
        RationalVector v1 = new RationalVector(2);
        Rational r1 = new Rational(1, 2);
        Rational r2 = new Rational(3, 4);

        // Modification des éléments de v1
        v1.set(0, r1);
        v1.set(1, r2);

        // Affichage du vecteur
        System.out.println("v1: " + v1);

        // Multiplication par 2/3
        v1.multiply(new Rational(2, 3));
        System.out.println("v1 après multiplication par 2/3: " + v1);

        // Création d'un autre vecteur v2
        RationalVector v2 = new RationalVector(2);
        v2.set(0, new Rational(1, 3));
        v2.set(1, new Rational(2, 5));
        System.out.println("v2: " + v2);

        // Addition des vecteurs
        v1.add(v2);
        System.out.println("v1 après addition de v2: " + v1);
    }
}