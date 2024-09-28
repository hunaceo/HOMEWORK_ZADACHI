import java.util.Scanner;

public class ZADACHA_DVA_BANDITA {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Веддите Larry Harry: ");

        int Larry = scanner.nextInt();
        int Harry = scanner.nextInt();

        int L = Larry - 1;
        int H = Harry - 1;

        System.out.println(H + " " + L);
    }
}
