import java.util.Scanner;

public class ZADACHA_DENPRGM {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Введите год: ");
        int Year = scanner.nextInt();

        if (Year % 400 == 0) {
            System.out.println("12/09/" + Year);
        } else if (Year % 4 == 0 & Year % 100 != 0) {
            System.out.println("12/09/" + Year);
        } else {
            System.out.println("13/09/" + Year);
        }


    }
}
