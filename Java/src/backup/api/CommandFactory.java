package api;

import request.dto.ReservationRequestDto;

public interface CommandFactory {
    Command createBookTicketCommand(ReservationRequestDto request, Ticket ticket);

    Ticket blankTicketFor(String trainId);

    BookingRequest reservationOf(int seatCount);
}
