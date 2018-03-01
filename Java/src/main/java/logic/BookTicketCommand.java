package logic;

import request.dto.ReservationRequestDto;

public class BookTicketCommand implements Command {
    private ReservationRequestDto reservation;
    private Ticket ticket;
    private Train trainBy;

    public BookTicketCommand(
        ReservationRequestDto reservation,
        Ticket ticket,
        Train train) {
        this.reservation = reservation;
        this.ticket = ticket;
        this.trainBy = train;
    }

    @Override
    public void execute() {
        //todo implement

    }
}
