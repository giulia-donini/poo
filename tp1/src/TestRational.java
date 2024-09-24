public class TestRational {
    public static void main(String[] args) {
        // prints rational 1 == 3/2
        Rational r1 = new Rational(3,2);
        System.out.println(r1);

       /* forced error to test when denom == 0
        Rational rational0 = new Rational(3,0);
        System.out.println(rational0); */

        // prints rational 1 == 1/3
        Rational r2 = new Rational(1,3);
        System.out.println(r2);

        // prints rational 1 == rational 1 * rational 2 == 3/6
        r1.mult(r2);
        System.out.println(r1);

        // prints rational 1 == rational 1 + rational 2 == 15/18
        r1.add(r2);
        System.out.println(r1);

        Rational r3 = Rational.mult(r1,r2);
        System.out.println(r3);

    }
}
