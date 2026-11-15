public class Fraction {
    private int numerator;
    private int denominator;

    public Fraction(int n) {
        this(n, 1);
    }

    public Fraction(int numerator, int denominator) {
        this.numerator = numerator;
        if (denominator == 0) {
            this.denominator = 1;
        } else {
            this.denominator = denominator;
        }
    }

    @Override
    public String toString() {
        return numerator + "/" + denominator;
    }

    public Fraction multiply(Fraction factor) {
        return new Fraction(
            this.numerator * factor.numerator,
            this.denominator * factor.denominator
        );
    }

    public Fraction add(Fraction summand) {
        return new Fraction(
            this.numerator * summand.denominator + summand.numerator * this.denominator,
            this.denominator * summand.denominator
        );
    }

    public double asDouble() {
        return (double) numerator / denominator;
    }

    public static void main(String[] args) {
        // TODO: Berechne Pi = 4 * (1 - 1/3 + 1/5 - 1/7 + 1/9 - ...) mithilfe von Fraction
        //       Gib jede Zwischensumme aus als Bruch und als Double aus
        //       Tipp: 𝜋 = 3.141592654...

        
    }
}
