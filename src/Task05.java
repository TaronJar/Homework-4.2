import java.util.Scanner;

public class Task05 {
    public static void main(String[] args) {
        System.out.println("Задание: 5");
        Scanner scanner = new Scanner(System.in);
        System.out.print("Введите высоту параллелограмма: ");
        int height = scanner.nextInt();
        System.out.print("Введите ширину параллелограмма: ");
        int width = scanner.nextInt();
        System.out.println();

        // Заполненный параллелограмм
        for (int i = 0; i < height; i++) {
            for (int j = 0; j < i; j++) {
                System.out.print(" ");
            }
            for (int j = 0; j < width; j++) {
                System.out.print("*");
            }
            System.out.println();
        }

        System.out.println();

        // Пустой параллелограмм
        for (int i = 0; i < height; i++) {
            for (int j = 0; j < i; j++) {
                System.out.print(" ");
            }
            for (int j = 0; j < width; j++) {
                if (i == 0 || i == height - 1 || j == 0 || j == width - 1) {
                    System.out.print("*");
                } else {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }
}