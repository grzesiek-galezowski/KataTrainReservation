package api;

import bootstrap.TicketFactory;
import request.dto.ReservationRequestDto;
import response.dto.ReservationDto;

public class TicketOffice {

    private final CommandFactory commandFactory;
    private TicketFactory ticketFactory;

    public TicketOffice(
        CommandFactory commandFactory,
        TicketFactory ticketFactory) {

        this.commandFactory = commandFactory;
        this.ticketFactory = ticketFactory;
    }

    public ReservationDto makeReservation(
        ReservationRequestDto request) {
        Ticket ticket = ticketFactory.blankTicketFor(request.trainId);

        commandFactory
            .createBookTicketCommand(request, ticket)
            .execute();

        return ticket.buildDto();
    }

}