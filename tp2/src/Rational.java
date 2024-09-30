public class Rational {
   int num;
   int denom;

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

   public Rational mult(Rational other){
       int newNum = this.num * other.num;
       int newDenom = this.denom * other.denom;
       return new Rational(newNum, newDenom);
   }

    public Rational add(Rational other){
        int newNum = this.num * other.denom + other.num * this.denom;
        int newDenom = this.denom * other.denom;
        return new Rational(newNum, newDenom);
    }

    public int pgcd(int a, int b) {
        if (b == 0) {
            return a;
        } else {
            return pgcd(b, a % b);
        }
    }

    public void simplify(){
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

