package logic;

import request.dto.ReservationRequestDto;

public class BookTicketCommand implements Command {
    private ReservationRequestDto reservation;
    private Ticket ticket;
    private Train train;

    public BookTicketCommand(
        ReservationRequestDto reservation,
        Ticket ticket,
        Train train) {
        this.reservation = reservation;
        this.ticket = ticket;
        this.train = train;
    }

    @Override
    public void execute() {
        //todo a full DTO is not required
        train.reserve(reservation.seatCount, ticket);
    }
}
