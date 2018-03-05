package logic;

import request.dto.ReservationRequestDto;

public class BookingCommandFactory implements CommandFactory {
    private TrainRepository trainRepo;

    public BookingCommandFactory(TrainRepository trainRepo) {
        this.trainRepo = trainRepo;
    }

    @Override
    public Command createBookCommand(ReservationRequestDto reservation, Ticket ticket) {
        return new BookTicketCommand(
            reservation,
            ticket,
            trainRepo.getTrainBy(reservation.trainId));
    }
}
