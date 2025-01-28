package circularlinkedlist.onlineticketreservationsystem;

// Class to manage the ticket reservation system
class TicketReservation
{
    TicketDetails head;

    // Constructor
    public TicketReservation()
    {
        head = null;
    }

    // Add a new ticket reservation at the end of the circular list
    public void addTicket(int ticketID, String customerName, String movieName, String seatNumber, String bookingTime)
    {
        TicketDetails newTicket = new TicketDetails(ticketID, customerName, movieName, seatNumber, bookingTime);
        if (head == null)
        {
            head = newTicket;
            newTicket.next = head;
        }
        else
        {
            TicketDetails temp = head;
            while (temp.next != head)
            {
                temp = temp.next;
            }
            temp.next = newTicket;
            newTicket.next = head;
        }
    }

    // Remove a ticket by Ticket ID
    public void removeTicket(int ticketID)
    {
        if (head == null)
        {
            System.out.println("No tickets to remove");
            return;
        }

        TicketDetails temp = head;
        TicketDetails prev = null;
        do
        {
            if (temp.ticketID == ticketID)
            {
                if (prev != null)
                {
                    prev.next = temp.next;
                }
                else
                {
                    TicketDetails last = head;
                    while (last.next != head)
                    {
                        last = last.next;
                    }
                    head = temp.next;
                    last.next = head; // Maintain circular link
                }
                System.out.println("Ticket with ID " + ticketID + " removed");
                return;
            }
            prev = temp;
            temp = temp.next;
        } while (temp != head);

        System.out.println("Ticket with ID " + ticketID + " not found");
    }

    // Display all current tickets in the circular list
    public void displayTickets()
    {
        if (head == null)
        {
            System.out.println("No tickets booked yet.");
            return;
        }

        TicketDetails temp = head;
        do
        {
            System.out.println("Ticket ID is " + temp.ticketID);
            System.out.println("Customer Name: " + temp.customerName);
            System.out.println("Movie is " + temp.movieName);
            System.out.println("Seat Number is " + temp.seatNumber);
            System.out.println("Booking Time is " + temp.bookingTime);

            temp = temp.next;
        } while (temp != head);
    }

    // Search for a ticket by customer name or movie name
    public void searchTicket(String searchTerm)
    {
        if (head == null)
        {
            System.out.println("No tickets to search");
            return;
        }

        TicketDetails temp = head;
        do
        {
            if (temp.customerName.equalsIgnoreCase(searchTerm) || temp.movieName.equalsIgnoreCase(searchTerm))
            {
                System.out.println("Ticket found " + temp.ticketID + ", " + temp.customerName + ", " + temp.movieName);
                System.out.println("Seat Number is " + temp.seatNumber);
                System.out.println("Booking Time is " + temp.bookingTime);
                return;
            }
            temp = temp.next;
        } while (temp != head);

        System.out.println("Ticket not found for " + searchTerm);
    }

    // Calculate the total number of booked tickets
    public void countTotalTickets()
    {
        if (head == null)
        {
            System.out.println("No tickets booked");
            return;
        }

        int count = 0;
        TicketDetails temp = head;
        do
        {
            count++;
            temp = temp.next;
        } while (temp != head);
        System.out.println("Total booked tickets " + count);
    }
}
