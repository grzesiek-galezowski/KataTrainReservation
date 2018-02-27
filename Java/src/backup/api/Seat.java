package api;

public interface Seat {
    boolean isFree();

    void reserveFor(Ticket response);
}
