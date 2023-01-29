import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner playAgain = new Scanner(System.in);
        String choice;

        do {

            System.out.print("Please enter your yearly income ($): ");
            double income = playAgain.nextDouble();

            System.out.print("Please enter the price of the car you want to purchase ($): ");
            double price = playAgain.nextDouble();

            System.out.print("Please enter the yearly maintenance and insurance of the car ($): ");
            double fees = playAgain.nextDouble();

            System.out.print("Please enter the down payment on the car (%): ");
            double downPayment = playAgain.nextDouble();

            System.out.print("Please enter the interest rate on the car (%): ");
            double interestRate = playAgain.nextDouble();

            System.out.print("Enter the time you plan on financing the car (months): ");
            double duration = playAgain.nextDouble();

            System.out.print("Finally, please enter the tax rate in the place where you reside (%): ");
            double taxRate = playAgain.nextDouble();

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

            if (income > idealIncome) {
                System.out.println("Congratulations you can very comfortably buy the car!");
            } else if (idealIncome - income < 10000) {
                System.out.println("Congratulations your income is just enough to comfortably buy the car!");
            } else {
                System.out.println("We do not recommend you buy this car!");
            }
            System.out.println("Do you want to input new information (Yes|No)?");
            choice = playAgain.next();
        } while (choice.equals("Yes") | choice.equals("yes"));
            if(choice.equals("No") | choice.equals("no")) {
                System.out.println("Have a good day!");
            }
    }

}