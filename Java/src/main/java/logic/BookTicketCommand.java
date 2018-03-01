package logic;

import request.dto.ReservationRequestDto;

public class BookTicketCommand implements Command {
    private ReservationRequestDto reservation;
    private Ticket ticket;

    public BookTicketCommand(ReservationRequestDto reservation, Ticket ticket) {
        this.reservation = reservation;
        this.ticket = ticket;
    }

    @Override
    public void execute() {
        //todo implement

    }
}
