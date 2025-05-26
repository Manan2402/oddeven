
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter numbers separated by spaces:");
        String input = scanner.nextLine();

        String[] numbers = input.split(" ");

        for (String number : numbers) {
            try {
                int num = Integer.parseInt(number);

                if (num % 2 == 0) {
                    System.out.println(num + " is an Even number");
                } else {
                    System.out.println(num + " is an Odd number");
                }
            } catch (NumberFormatException e) {
                System.out.println(number + " is not a valid integer.");
            }
        }

        scanner.close();
    }
}
