import java.util.Scanner;

public class Main {
    private static Scanner scanner = new Scanner(System.in);
    public static void main(String[] args) {
        int[] numbersArray = new int[6];

        System.out.print("Enter first number: ");
        numbersArray[0] = scanner.nextInt();

        System.out.print("Enter second number: ");
        numbersArray[1] = scanner.nextInt();

        System.out.print("Enter third number: ");
        numbersArray[2] = scanner.nextInt();

        System.out.print("Enter fourth number: ");
        numbersArray[3] = scanner.nextInt();

        System.out.print("Enter fifth number: ");
        numbersArray[4] = scanner.nextInt();

        System.out.print("Enter sixth number: ");
        numbersArray[5] = scanner.nextInt();

        for (int i = 0; i < numbersArray.length; i++) {
            System.out.print("The " + i + " index is: " + numbersArray[i] + "\n");
        }

    }
}