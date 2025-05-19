public class Main {

    public static void main(String[] args) {
        int a = 10;
        int b = 0; // możesz testować też inne wartości

        // Suma
        int suma = a + b;
        System.out.println("Suma: " + suma);

        // Różnica
        int roznica = a - b;
        System.out.println("Różnica: " + roznica);

        // Iloczyn
        int iloczyn = a * b;
        System.out.println("Iloczyn: " + iloczyn);

        // Iloraz – z zabezpieczeniem
        if (b != 0) {
            double iloraz = (double) a / b;
            System.out.println("Iloraz: " + iloraz);
        } else {
            System.out.println("Nie można dzielić przez zero.");
        }
    }
}
