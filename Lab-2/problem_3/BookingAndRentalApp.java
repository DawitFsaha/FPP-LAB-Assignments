package Lab_2.problem_3;

import java.util.Scanner;

public class BookingAndRentalApp {

    public static void main(String[] args) {

        String flag = "y";

        do {

            System.out.println("\n======== MENU ========\n");
            System.out.println("Enter F for Flight Booking");
            System.out.println("Enter H for Hotel Booking");
            System.out.println("Enter C for Car Rental");
            System.out.printf("->");
            Scanner sc = new Scanner(System.in);
            String menu = sc.nextLine().toUpperCase();

            switch (menu) {
                case "F" -> {
                    System.out.println("Welcome to Flight Booking");
                    System.out.printf("Enter Origin: ");
                    String origin = sc.nextLine();

                    System.out.printf("Enter Destination: ");
                    String destination = sc.nextLine();

                    System.out.printf("Enter distance in Km: ");
                    double distance = sc.nextDouble();

                    System.out.printf("Enter average Speed (Km/h): ");
                    double avgSpeed = sc.nextDouble();

                    FlightBooking flightBooking = new FlightBooking(origin, destination, distance);
                    double flightTime = flightBooking.computeFlightTime(avgSpeed);
                    System.out.printf("Estimated Flight Time = %.2f Hours", flightTime);

                    System.out.printf("\n\nDo you want to continue (y/n): ");
                    flag = sc.next();
                }
                case "H" -> {
                    System.out.println("Welcome to Hotel Booking");
                    System.out.printf("Enter hotel name: ");
                    String hotelName = sc.nextLine();

                    System.out.printf("Enter number of nights: ");
                    int nights = sc.nextInt();

                    System.out.printf("Enter price per night in $: ");
                    double pricePerNnight = sc.nextDouble();

                    HotelBooking hotelBooking = new HotelBooking(hotelName, nights, pricePerNnight);
                    double totalCost = hotelBooking.totalCost();

                    System.out.printf("\nTotal Hotel Cost == $%.2f", totalCost);

                    System.out.printf("\n\nDo you want to continue (y/n): ");
                    flag = sc.next();
                }
                case "C" -> {
                    System.out.println("Welcome to Car Rental");
                    System.out.printf("Enter car model: ");
                    String hotelName = sc.nextLine();

                    System.out.printf("Enter number of days: ");
                    int noOfDays = sc.nextInt();

                    System.out.printf("Enter rate per day in $: ");
                    double ratePerDay = sc.nextDouble();

                    System.out.printf("Enter miles per day: ");
                    double milesPerDay = sc.nextDouble();

                    CarRental carRental = new CarRental(hotelName, noOfDays, ratePerDay, milesPerDay);
                    double totaRentalCost = carRental.totalRentalCost();
                    double totalMilesAllowed = carRental.totalMilesAllowed();

                    System.out.printf("\nTotal Rental Cost = $%.2f", totaRentalCost);
                    System.out.printf("\nTotal Miles Allowed = %.2f Miles", totalMilesAllowed);

                    System.out.printf("\n\nDo you want to continue (y/n): ");
                    flag = sc.next();
                }
                default -> {
                    System.out.println("\nInvalid Input. Enter F, H or C!");
                }
            }
        }while(flag.equalsIgnoreCase("y"));
        System.out.println("Thankyou for using our Service");
    }
}
