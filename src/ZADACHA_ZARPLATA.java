import java.util.Scanner;

public class ZADACHA_ZARPLATA {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Введите ZP1 ZP2 ZP3: ");

        int ZP1 = scanner.nextInt();
        int ZP2 = scanner.nextInt();
        int ZP3 = scanner.nextInt();
        int Maxsalary;
        int Minsalary;


        if (ZP1 > ZP2) {
            Maxsalary = ZP1;
        } else {
            Maxsalary = ZP2;

        }
        if (Maxsalary > ZP3) {
        } else {
            Maxsalary = ZP3;
        }


        if (ZP1 < ZP2) {
            Minsalary = ZP1;
        } else {
            Minsalary = ZP2;
        }
        if (Minsalary < ZP3) {
        } else {
            Minsalary = ZP3;
        }


        System.out.println(Maxsalary - Minsalary);
    }
}
