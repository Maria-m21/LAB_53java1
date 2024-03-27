import java.util.Scanner;
public class second {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Введіть тризначне число: ");
        int n = scanner.nextInt();
        int maxDigit = 0;
        while (n > 0) {
            int digit = n % 10;
            if (digit > maxDigit) {
                maxDigit = digit;
            }
            n /= 10;
        }
        System.out.println("Найбільша цифра: " + maxDigit);
    }
}




