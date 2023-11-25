import java.util.Scanner;

public class Task04 {
    public static void main(String[] args) {
        System.out.println("Задание: 4");
        Scanner scanner = new Scanner(System.in);
        System.out.print("Введите высоту ромба: ");
        int height = scanner.nextInt();

        // Заполненный ромб
        for (int i = 0; i < height; i++) {
            for (int j = height - i; j > 1; j--) {
                System.out.print(" ");
            }
            for (int j = 0; j <= i; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }

        for (int i = height - 2; i >= 0; i--) {
            for (int j = height - i; j > 1; j--) {
                System.out.print(" ");
            }
            for (int j = 0; j <= i; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }

        System.out.println();

        // Пустой ромб
        for (int i = 0; i < height; i++) {
            for (int j = height - i; j > 1; j--) {
                System.out.print(" ");
            }
            for (int j = 0; j <= i; j++) {
                if (j == 0 || j == i) {
                    System.out.print("* ");
                } else {
                    System.out.print("  ");
                }
            }
            System.out.println();
        }

        for (int i = height - 2; i >= 0; i--) {
            for (int j = height - i; j > 1; j--) {
                System.out.print(" ");
            }
            for (int j = 0; j <= i; j++) {
                if (j == 0 || j == i) {
                    System.out.print("* ");
                } else {
                    System.out.print("  ");
                }
            }
            System.out.println();
        }
    }
}