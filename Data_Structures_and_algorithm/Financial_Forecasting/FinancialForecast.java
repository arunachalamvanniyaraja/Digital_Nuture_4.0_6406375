import java.util.Scanner;

public class FinancialForecast {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        
        System.out.print("Enter Principal Amount (₹): ");
        double principal = sc.nextDouble();

        System.out.print("Enter Annual Interest Rate (%): ");
        double rate = sc.nextDouble();

        System.out.print("Enter Time Period (years): ");
        int time = sc.nextInt();

        System.out.print("Enter Number of times interest applied per year: ");
        int n = sc.nextInt();

       
        double amount = principal * Math.pow((1 + rate / (100 * n)), n * time);
        double interest = amount - principal;

       
        System.out.printf("\nForecasted Amount after %d years: ₹%.2f\n", time, amount);
        System.out.printf("Total Interest Earned: ₹%.2f\n", interest);
        
        sc.close();
    }
}
