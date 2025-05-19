public class Main {

    // Metoda sprawdzająca podzielność liczby x przez y
    public static boolean czyPodzielne(int x, int y) {
        if (y == 0) {
            System.out.println("Błąd: nie można dzielić przez zero!");
            return false;
        }
        return x % y == 0;
    }

    public static void main(String[] args) {
        int x1 = 10;
        int y1 = 5;
        System.out.println(x1 + " podzielne przez " + y1 + "? " + (czyPodzielne(x1, y1) ? "Tak" : "Nie"));

        int x2 = 7;
        int y2 = 3;
        System.out.println(x2 + " podzielne przez " + y2 + "? " + (czyPodzielne(x2, y2) ? "Tak" : "Nie"));

        int x3 = 15;
        int y3 = 0;
        System.out.println(x3 + " podzielne przez " + y3 + "? " + (czyPodzielne(x3, y3) ? "Tak" : "Nie"));
    }
}
