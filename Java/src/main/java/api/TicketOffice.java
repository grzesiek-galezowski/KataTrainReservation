package api;

import logic.CommandFactory;
import logic.TicketFactory;
import request.dto.ReservationRequestDto;
import response.dto.TicketDto;

public class TicketOffice {

    private CommandFactory commandFactory;

    public TicketOffice(CommandFactory commandFactory, TicketFactory ticketFactory) {
        //todo implement

        this.commandFactory = commandFactory;
    }

    public TicketDto makeReservation(
        ReservationRequestDto request) {
        return new TicketDto(null, null, null);
    }

}