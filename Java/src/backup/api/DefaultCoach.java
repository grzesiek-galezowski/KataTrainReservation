package api;

import java.util.Arrays;

public class DefaultCoach implements Coach {
    private Seat[] seats;

    public DefaultCoach(Seat... seats) {
        this.seats = seats;
    }

    @Override
    public void fillSeatInfo(SeatCollector reservationRequest) {
        //NO TESTS
        reservationRequest.addSeatsCounts(countOfFree(seats), totalCountOf(seats));
    }

    @Override
    public boolean isWithinTheLimitAfterBooking(int seatCount) {
        //todo bad algorithm??
        return (countOfFree(seats) - seatCount)
            / totalCountOf(seats) >= 0.7;
    }

    @Override
    public boolean hasFreeSeats(int requiredSeatCount) {
        return countOfFree(seats) >= requiredSeatCount;
    }

    @Override
    public void reserveSeats(int requiredSeatCount, Ticket ticket) {
        for (Seat seat : seats) {
            if(seat.isFree()) {
                seat.reserveFor(ticket);
            }
        }
    }

    //todo mention why the double is here!!
    private double totalCountOf(Seat[] seats) {
        return seats.length;
    }

    private double countOfFree(Seat[] seats) {
        return Arrays.stream(seats).filter(s -> s.isFree()).count();
    }
}
