import java.util.Scanner;

public class ZADACHA_1_28 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Введите длину ребра:");

        int a = scanner.nextInt();

        double V = Math.pow(a, 3);
        double S = 4 * Math.pow(a, 2);

        System.out.println("Объем: " + V);
        System.out.println("Площадь боковой поверхности: " + S);

    }
}
