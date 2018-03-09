package logic;

public class CoachWithSeats implements Coach {
    @Override
    public void reserve(int seatCount, TicketInProgress ticket) {
        //todo implement

    }

    @Override
    public boolean allowsUpFrontReservationOf(int seatCount) {
        //todo implement
        return false;
    }

    @Override
    public boolean allowsReservationOf(int seatCount) {
        //todo implement
        return false;
    }
}
