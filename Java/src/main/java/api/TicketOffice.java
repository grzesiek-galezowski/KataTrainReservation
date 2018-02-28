package api;

import logic.CommandFactory;
import request.dto.ReservationRequestDto;
import response.dto.TicketDto;

public class TicketOffice {

    public TicketOffice(CommandFactory commandFactory) {
        //todo implement

    }

    public TicketDto makeReservation(
        ReservationRequestDto request) {
        throw new RuntimeException("lol");
    }

}