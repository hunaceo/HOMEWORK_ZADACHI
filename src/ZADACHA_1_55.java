import java.util.Scanner;

public class ZADACHA_1_55 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Введите скорость первого автомобиля: ");
        int V1 = scanner.nextInt();

        System.out.print("Введите скорость второго автомобиля: ");
        int V2 = scanner.nextInt();

        System.out.print("Введите расстояние между автомобилями: ");
        int S = scanner.nextInt();

        double t = (S / (V1 + V2));

        System.out.printf("Время через которое встретятся автомобили: %.2f час ", t);


    }
}
