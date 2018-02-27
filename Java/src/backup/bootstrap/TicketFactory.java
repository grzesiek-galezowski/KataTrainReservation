package bootstrap;

import api.Ticket;

public interface TicketFactory {
    Ticket blankTicketFor(String trainId);
}
