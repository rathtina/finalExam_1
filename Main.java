import java.util.Scanner;

public class Main {

    private static final int MAX_SIZE = 100;
    private static int[] numbers = new int[MAX_SIZE];
    private static int count = 0;

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int choice;

        do {
            System.out.println("\nOption:");
            System.out.println("1. Input Int Numbers");
            System.out.println("2. View Input Numbers");
            System.out.println("3. Exit");
            System.out.print("Enter your choice (1-3): ");
            choice = scanner.nextInt();

            switch (choice) {
                case 1:
                    inputNumbers(scanner);
                    break;
                case 2:
                    viewNumbers();
                    break;
                case 3:
                    System.out.println("Exiting program.");
                    break;
                default:
                    System.out.println("Invalid choice. Please try again.");
            }
        } while (choice != 3);

        scanner.close();
    }

    private static void inputNumbers(Scanner scanner) {
        System.out.println("Enter numbers (input a negative number to stop inputting):");
        int num;
        while (true) {
            num = scanner.nextInt();
            if (num < 0) {
                System.out.println("Input complete.");
                break;
            }
            numbers[count] = num;
            count++;
        }
    }

    private static void viewNumbers() {
        System.out.print("Input Numbers: [");
        for (int i = 0; i < count; i++) {
            if (i > 0) {
                System.out.print(", ");
            }
            System.out.print(numbers[i]);
        }
        System.out.println("]");
    }
}