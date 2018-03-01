package logic;

import request.dto.ReservationRequestDto;

public class BookingCommandFactory implements CommandFactory {
    public BookingCommandFactory(TrainRepository trainRepo) {
        //todo implement

    }

    @Override
    public Command createBookCommand(ReservationRequestDto reservation, Ticket ticket) {
        return new BookTicketCommand(reservation, ticket);
    }
}
