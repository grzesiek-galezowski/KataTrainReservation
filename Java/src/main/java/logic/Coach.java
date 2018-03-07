package logic;

public interface Coach {
    void reserve(int seatCount, TicketInProgress ticket);

    boolean allowsUpFrontReservationOf(int seatCount);
}
