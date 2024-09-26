public class TestRationalVector {
    public static void main(String[] args) {
        Rational r1 = new Rational(1,2);
        System.out.println(r1);

        Rational r2 = new Rational(3,2);
        System.out.println(r2);

        RationalVector vector = new RationalVector(2);

        vector.set(0, r1);
        vector.set(1, r2);
        System.out.println(vector);
    }
}