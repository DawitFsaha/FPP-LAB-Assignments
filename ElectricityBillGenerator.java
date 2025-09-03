package assignment_one;

import java.util.Scanner;

public class ElectricityBillGenerator {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        String f = "y";



        do {

            System.out.printf("\nEnter user type (R/C/I): ");
            String userType = sc.nextLine().toUpperCase();
            System.out.printf("Enter units consumed: ");
            int unitConsumed = sc.nextInt();
            sc.nextLine();
            double billAmount;
            billAmount = switch (userType) {
                case "R" -> unitConsumed * 0.12;
                case "C" -> unitConsumed * 0.20;
                case "I" -> unitConsumed * 0.35;
                default -> 0.0;
            };

            System.out.printf("\nBill Amount: %.2f", billAmount);
            System.out.printf("\n\nDo you want to calculate another bill? (y/n): ");

            f = sc.nextLine();

        }while(f.equals("y"));

        sc.close();
        System.out.println("Goodbye! Thanks for using the Electricity Bill Generator.");



    }
}
