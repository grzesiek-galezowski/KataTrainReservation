package api;

import logic.CommandFactory;
import logic.TicketFactory;
import lombok.val;
import request.dto.ReservationRequestDto;
import response.dto.TicketDto;

public class TicketOffice {

    private CommandFactory commandFactory;
    private TicketFactory ticketFactory;

    public TicketOffice(
        CommandFactory commandFactory,
        TicketFactory ticketFactory) {
        //todo implement

        this.commandFactory = commandFactory;
        this.ticketFactory = ticketFactory;
    }

    public TicketDto makeReservation(
        ReservationRequestDto request) {
        val ticket = ticketFactory.createBlankTicket();
        val command = commandFactory.createBookCommand(request, ticket);
        command.execute();
        return new TicketDto(null, null, null);
    }

}