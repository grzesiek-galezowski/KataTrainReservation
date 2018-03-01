package logic;

import request.dto.ReservationRequestDto;

public class BookingCommandFactory implements CommandFactory {
    @Override
    public Command createBookCommand(ReservationRequestDto reservation, Ticket ticket) {
        return new BookTicketCommand(reservation, ticket);
    }
}
