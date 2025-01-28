package circularlinkedlist.onlineticketreservationsystem;

// Main class for the online ticket reservation system
public class OnlineTicketReservationSystem
{
    public static void main(String[] args)
    {
        TicketReservation ticket = new TicketReservation();

        // Adding ticket reservations
        ticket.addTicket(101, "Rajan", "Avengers Age of Ultron", "A1", "28/01/2025 10:00AM");
        ticket.addTicket(102, "Sachin", "Avengers Infinity War", "B2", "29/01/2025 11:00AM");
        ticket.addTicket(103, "Neeraj", "Avengers Endgame", "C3", "30/01/2025 12:00PM");

        // Displaying all tickets
        ticket.displayTickets();

        // Searching for a ticket by customer name
        ticket.searchTicket("Neeraj");

        // Removing a ticket by ticket ID
        ticket.removeTicket(102);

        // Displaying tickets after removal
        ticket.displayTickets();

        // Counting the total number of booked tickets
        ticket.countTotalTickets();
    }
}