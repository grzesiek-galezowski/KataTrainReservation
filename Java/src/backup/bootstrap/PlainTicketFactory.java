package bootstrap;

import api.Ticket;

public class PlainTicketFactory implements TicketFactory {
    @Override
    public Ticket blankTicketFor(String trainId) {
        return new DefaultTicket(trainId);
    }
}
