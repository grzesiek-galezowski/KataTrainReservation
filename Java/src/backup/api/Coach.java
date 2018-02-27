package api;

public interface Coach {
    void fillSeatInfo(SeatCollector reservationRequest);

    boolean isWithinTheLimitAfterBooking(int seatCount);

    boolean hasFreeSeats(int requiredSeatCount);

    void reserveSeats(int requiredSeatCount, Ticket response);
}
