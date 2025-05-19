public class Main {

    // Metoda rozwiązująca równanie kwadratowe ax^2 + bx + c = 0
    public static void rozwiazRownanie(double a, double b, double c) {
        if (a == 0) {
            System.out.println("To nie jest równanie kwadratowe (a = 0).");
            return;
        }

        double delta = b * b - 4 * a * c;
        System.out.println("Delta: " + delta);

        if (delta > 0) {
            double x1 = (-b + Math.sqrt(delta)) / (2 * a);
            double x2 = (-b - Math.sqrt(delta)) / (2 * a);
            System.out.println("Dwa pierwiastki rzeczywiste: x1 = " + x1 + ", x2 = " + x2);
        } else if (delta == 0) {
            double x = -b / (2 * a);
            System.out.println("Jeden pierwiastek rzeczywisty: x = " + x);
        } else {
            System.out.println("Brak pierwiastków rzeczywistych.");
        }
    }

    public static void main(String[] args) {
        // Testy
        System.out.println("Test 1:");
        rozwiazRownanie(1, -3, 2); // x1 = 2, x2 = 1

        System.out.println("\nTest 2:");
        rozwiazRownanie(1, 2, 1);  // x = -1

        System.out.println("\nTest 3:");
        rozwiazRownanie(1, 0, 1);  // brak rozwiązań
    }
}
