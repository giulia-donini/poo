public class Rational {
   private int num;
   private int denom = 1;

   public Rational(int num, int denom) {
       if (denom == 0){
           throw new IllegalArgumentException("denominator cannot be zero");
       }
       this.num = num;
       this.denom = denom;
       this.simplify();
   }

   public String toString() {
       return num + "/" + denom;
   }

   public void mult(Rational other){
       this.num *= other.num;
       this.denom *= other.denom;

       this.simplify();
   }

    public void add(Rational other){
        this.num = this.num * other.denom + other.num * this.denom;
        this.denom = this.denom * other.denom;

        this.simplify();
    }

    private static int pgcd(int a, int b) {
        if (b == 0) {
            return a;
        } else {
            return pgcd(b, a % b);
        }
    }

    private void simplify(){
        int pgcdValue = pgcd(Math.abs(this.num), Math.abs(this.denom));
        this.num /= pgcdValue;
        this.denom /= pgcdValue;

        if (denom < 0) {
            num = -num;
            denom = -denom;
        }
    }

    public static Rational mult(Rational a, Rational b) {
        Rational c = new Rational(a.num * b.num, a.denom * b.denom);
        c.simplify();
        return c;
    }

}

