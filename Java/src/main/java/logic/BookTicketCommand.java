package logic;

import request.dto.ReservationRequestDto;

public class BookTicketCommand implements Command {
    private ReservationRequestDto reservation;
    private TicketInProgress ticketInProgress;
    private Train train;

    public BookTicketCommand(
        ReservationRequestDto reservation,
        TicketInProgress ticketInProgress,
        Train train) {
        this.reservation = reservation;
        this.ticketInProgress = ticketInProgress;
        this.train = train;
    }

    @Override
    public void execute() {
        //todo a full DTO is not required
        train.reserve(reservation.seatCount, ticketInProgress);
    }
}
