import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        double money = 1.0;
        int month = 1;
        double interestRate = 1.0;
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the money: ");
        money = sc.nextDouble();
        System.out.print("Enter the month: ");
        month = sc.nextInt();
        System.out.print("Enter the interest: ");
        interestRate = sc.nextDouble();

        double totalInterest = 0;
        totalInterest += money * (interestRate/100)/12 * month;
        System.out.printf("Total of interest: %f", totalInterest);
    }
}
