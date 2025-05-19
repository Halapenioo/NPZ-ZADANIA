public class Main {

    // Metoda obliczająca wartość funkcji signum dla liczby rzeczywistej
    public static int signum(double x) {
        if (x > 0) {
            return 1;
        } else if (x == 0) {
            return 0;
        } else {
            return -1;
        }
    }

    public static void main(String[] args) {
        // Testowanie metody signum
        double liczba1 = 5.2;
        double liczba2 = 0;
        double liczba3 = -3.7;

        System.out.println("signum(" + liczba1 + ") = " + signum(liczba1)); // 1
        System.out.println("signum(" + liczba2 + ") = " + signum(liczba2)); // 0
        System.out.println("signum(" + liczba3 + ") = " + signum(liczba3)); // -1
    }
}
