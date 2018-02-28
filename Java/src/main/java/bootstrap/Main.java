package bootstrap;

import api.TicketOffice;
import logic.BookingCommandFactory;
import logic.TrainTicketFactory;

public class Main {

    public static void main(String[] args) {
        new TicketOffice(new BookingCommandFactory(),
            new TrainTicketFactory());
    }

}
