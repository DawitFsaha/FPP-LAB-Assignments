package lab7.problem4;

public class TicketTest {
        public static void main(String[] args) {
            TicketingSystem system = new TicketingSystem();

            System.out.println("======== Adding Tickets ==========");
            system.addTicket("Cannot log in to account");
            system.addTicket("Payment not processing");
            system.addTicket("Error when uploading file");

            System.out.println("\n======== View next Ticket ==========");
            System.out.println("Next ticket: " + system.viewNextTicket());

            System.out.println("\n======== View next Ticket ==========");
            system.processTicket();

            system.showAllTickets();
        }
    }

