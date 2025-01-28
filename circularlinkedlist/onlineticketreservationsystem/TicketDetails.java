package circularlinkedlist.onlineticketreservationsystem;

class TicketDetails
{
    int ticketID;
    String customerName;
    String movieName;
    String seatNumber;
    String bookingTime;
    TicketDetails next;

    // Constructor of the class
    public TicketDetails(int ticketID, String customerName, String movieName, String seatNumber, String bookingTime)
    {
        this.ticketID = ticketID;
        this.customerName = customerName;
        this.movieName = movieName;
        this.seatNumber = seatNumber;
        this.bookingTime = bookingTime;
        this.next = null;
    }
}
