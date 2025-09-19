package lab7.problem4;

import java.util.LinkedList;
import java.util.Queue;

public class TicketingSystem {
    private Queue<Ticket> ticketQueue;
    private int nextId;

    public TicketingSystem() {
        ticketQueue = new LinkedList<>();
        nextId = 1; // start ticket IDs from 1
    }

    public void addTicket(String description) {
        Ticket newTicket = new Ticket(nextId++, description);
        ticketQueue.add(newTicket);
        System.out.println("Ticket added: " + newTicket);
    }

    public Ticket processTicket() {
        if (ticketQueue.isEmpty()) {
            System.out.println("No tickets to process.");
            return null;
        }
        Ticket ticket = ticketQueue.poll(); // removes head
        System.out.println("Processing: " + ticket);
        return ticket;
    }

    public Ticket viewNextTicket() {
        if (ticketQueue.isEmpty()) {
            System.out.println("No tickets in the queue.");
            return null;
        }
        return ticketQueue.peek();
    }

    public void showAllTickets() {
        if (ticketQueue.isEmpty()) {
            System.out.println("No tickets in the queue.");
        } else {
            System.out.println("\n ======== Current queue ===========");
            for (Ticket t : ticketQueue) {
                System.out.println(t);
            }
        }
    }
}
