import java.util.Scanner;

public class ZADACHA_GULIVER_ULSK {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Введите K M: ");

        double K = scanner.nextDouble();
        double M = scanner.nextDouble();

        System.out.println(Math.pow(K, 2) * M);
    }
}
