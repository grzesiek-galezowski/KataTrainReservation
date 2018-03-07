package logic;

import request.dto.ReservationRequestDto;

public class BookingCommandFactory implements CommandFactory {
    private TrainRepository trainRepo;

    public BookingCommandFactory(TrainRepository trainRepo) {
        this.trainRepo = trainRepo;
    }

    @Override
    public Command createBookCommand(ReservationRequestDto reservation, TicketInProgress ticketInProgress) {
        return new BookTicketCommand(
            reservation,
            ticketInProgress,
            trainRepo.getTrainBy(reservation.trainId));
    }
}
