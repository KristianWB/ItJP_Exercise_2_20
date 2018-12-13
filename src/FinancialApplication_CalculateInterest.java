import java.util.Scanner;

public class FinancialApplication_CalculateInterest {
    public static void main(String[] args)   {

        /* The task will be performed in three steps
        1) Prompt the user for account balance and annual interest rate, then declare and assign essential variables
        2) Calculate results
        3) Display results
         */

        // 1) Pompt, declare and asssign
        Scanner input = new Scanner(System.in); // We need a scanner
        System.out.print(
                "Please enter the account balance: " // The user are prompted for the account balance
        );
        double balance = input.nextDouble(); // We declare and assign the balance variable from user input

        System.out.print(
                "Please enter the annual interest rate> in percentage: " // the user is prompted for the interest rate
        );
        double annualInterestRate = input.nextDouble();  // The interest rate variable is declared and assigned from the user input

        // 2) Calculating the result
        double interest = balance * (annualInterestRate/1200);

        // 3) Displaying the result
        System.out.print(
                "The next months balance is: " + interest
        );
    }
}
