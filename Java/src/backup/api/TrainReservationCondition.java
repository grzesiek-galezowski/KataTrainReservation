package api;

public interface TrainReservationCondition extends SeatCollector {
    boolean isMetAfterBooking(int seatCount);

    @Override
    void addSeatsCounts(double free, double total);
}
