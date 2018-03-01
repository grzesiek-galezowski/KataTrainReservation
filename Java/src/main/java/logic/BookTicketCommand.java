package logic;

import request.dto.ReservationRequestDto;

public class BookTicketCommand implements Command {
    private ReservationRequestDto reservation;

    public BookTicketCommand(ReservationRequestDto reservation) {
        this.reservation = reservation;
    }

    @Override
    public void execute() {
        //todo implement

    }
}
