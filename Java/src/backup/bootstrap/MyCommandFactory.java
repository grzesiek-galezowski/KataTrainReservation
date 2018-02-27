package bootstrap;

import api.BookTicketCommand;
import api.BookingRequest;
import api.Command;
import api.CommandFactory;
import api.DefaultBookingRequest;
import api.SeventyPercentSeatCondition;
import api.Ticket;
import api.TrainRepository;
import request.dto.ReservationRequestDto;

public class MyCommandFactory implements CommandFactory {
    private TrainRepository trainRepository;

    MyCommandFactory(TrainRepository trainRepository) {
        this.trainRepository = trainRepository;
    }

    @Override
    public Command createBookTicketCommand(
        ReservationRequestDto request, Ticket ticket) {
        return new BookTicketCommand(
            this.trainRepository,
            request.trainId,
            reservationOf(request.seatCount),
            ticket
        );
    }

    @Override
    public Ticket blankTicketFor(String trainId) {
        return new DefaultTicket(trainId);
    }

    @Override
    public BookingRequest reservationOf(int seatCount) {
        return new DefaultBookingRequest(
            seatCount,
            new SeventyPercentSeatCondition());
    }
}
