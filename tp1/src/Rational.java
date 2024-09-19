public class Rational {
   int num;
   int denom;
   public Rational(int num, int denom) {
       this.num = num;
       this.denom = denom;
   }
   public String toString() {
       return num + "/" + denom;
   }
}