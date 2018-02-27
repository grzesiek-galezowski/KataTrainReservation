package api;

public interface BookingRequest {
    /* void collectSeatInfoFrom(Coach coach); */ //todo not part of the book
    void evaluateCandidatureOf(Coach coach);
    void makeWith(Ticket ticket);
}
