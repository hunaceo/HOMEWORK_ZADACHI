import java.util.Scanner;

public class ZADACHA_1_35 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Введите длину катета a = ");
        int a = scanner.nextInt();

        System.out.print("Введите длину катета b = ");
        int b = scanner.nextInt();

        double c = Math.sqrt(Math.pow(a, 2) + Math.pow(b, 2));

        System.out.println("Длина гипотенузы = " + c);


    }
}
