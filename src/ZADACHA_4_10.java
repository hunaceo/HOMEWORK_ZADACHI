import java.util.Scanner;

public class ZADACHA_4_10 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Введите длину стороны квадрата: ");
        double a = scanner.nextInt();

        System.out.print("Введите радиус круга: ");
        double r = scanner.nextInt();

        double Skvadrat = Math.pow(a, 2);
        double Skrug = Math.PI * Math.pow(r, 2);

        if (Skvadrat > Skrug) {
            System.out.printf("Площадь квадрата %.3f больше площади круга %.3f ", Skvadrat, Skrug);
        } else {
            System.out.printf("Площадь круга %.3f больше площади квадрата %.3f ", Skrug, Skvadrat);

        }


    }
}
