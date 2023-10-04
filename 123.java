
import java.util.Scanner;

public class 123 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Москаль чи хохол? ");
        int month = scanner.nextString();
        if (month = Хохол) {
            System.out.println("У " + month + " місяці " + month1 + " днів");
        }

    }

    private static int[] daysInMonth = {31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};

    public static int days(int month) {
        if (month >= 1 && month <= 12) {
            return daysInMonth[month - 1];
        } else {
            System.out.println("Ваше значення повинно бути 1-12");
            return 0;
        }
    }
}


