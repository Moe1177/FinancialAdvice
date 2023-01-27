import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Please enter your yearly income ($): ");
        double income = scanner.nextDouble();

        System.out.print("Please enter the price of the car you want to purchase ($): ");
        double price = scanner.nextDouble();

        System.out.print("Please enter the yearly maintenance and insurance of the car ($): ");
        double fees = scanner.nextDouble();

        System.out.print("Please enter the down payment on the car (%): ");
        double downPayment = scanner.nextDouble();

        System.out.print("Please enter the interest rate on the car (%): ");
        double interestRate = scanner.nextDouble();

        System.out.print("Enter the time you plan on financing the car (months): ");
        double duration = scanner.nextDouble();

        System.out.print("Finally, please enter the tax rate in the place where you reside (%): ");
        double taxRate = scanner.nextDouble();

        System.out.println();

        double monthlyFees = (fees / 12);
        double years = (duration / 12);

        double interest = (price * (interestRate / 100) * years);
        double tax = ((100 + taxRate) / 100);
        double price2 = (price - (price * (downPayment / 100)));

        double monthlyCost = ((tax * price2 + interest) / duration) + monthlyFees;
        double idealIncome = (monthlyCost * 10 * 12);

        System.out.println("Interest amount: " + interest);
        System.out.println("Monthly cost: " + monthlyCost);
        System.out.println("Ideal income: " + idealIncome);
        System.out.println();

        if(income > idealIncome) {
            System.out.println("Congratulations you can very comfortably buy the car!");
        } else if(idealIncome - income < 5000) {
            System.out.println("Congratulations your income is just enough to comfortably buy the car!");
        } else {
            System.out.println("We do not recommend you buy this car!");
        }
    }

}