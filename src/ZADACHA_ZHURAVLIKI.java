import java.util.Scanner;

public class ZADACHA_ZHURAVLIKI {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Введите S: ");

        int S = scanner.nextInt();
        int Petruha = S / 6;
        int Seriy = S / 6;
        int Katusha = (Petruha + Seriy) * 2;

        System.out.println(Petruha + " " + Katusha + " " + Seriy);


    }
}
