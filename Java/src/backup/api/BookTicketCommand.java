package api;

public class BookTicketCommand implements Command {
    private String trainId;
    private final BookingRequest bookingRequest;
    private Ticket ticket;
    private final TrainRepository trainRepository;

    public BookTicketCommand(
        TrainRepository trainRepository,
        String trainId,
        BookingRequest bookingRequest,
        Ticket ticket) {

        this.trainRepository = trainRepository;
        this.trainId = trainId;
        this.bookingRequest = bookingRequest;
        this.ticket = ticket;
    }

    public void execute() {
        Train train = trainRepository.retrieveBy(trainId);
        train.provideDetailsFor(bookingRequest);
        bookingRequest.makeWith(ticket);
        trainRepository.save(train);
    }
}
