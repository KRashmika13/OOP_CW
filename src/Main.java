import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        System.out.println("Please enter the total number of tickets(): ");
        int totalTickets = scan.nextInt();

        System.out.println("Please enter ticket release rate for vendor(): ");
        int ticketReleaseRate = scan.nextInt();

        System.out.println("Enter maximum ticket capacity ");
        int maximumTicketCapacity = scan.nextInt();


    }
}