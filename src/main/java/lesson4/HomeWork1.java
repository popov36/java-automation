package lesson4;

public class HomeWork1 {
    public static void main(String[] args) {
        int rows = 5;
        for (int i = 1; i <= rows; i++) {
            // Додаємо пробіли
            for (int space = 1; space <= rows - i; space++) {
                System.out.print("  ");
            }

            for (int j = 1; j <= i * 2 - 1; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }

    }
}
