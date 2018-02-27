package api;

public class SeventyPercentSeatCondition implements TrainReservationCondition {
    public double freeCount = 0;
    public double total = 0;

    //TODO no tests

    @Override
    public boolean isMetAfterBooking(int seatCount) {
        return this.total + seatCount / this.freeCount <= 0.7;
    }

    @Override
    public void addSeatsCounts(double free, double total) {
        this.freeCount = free;
        this.total = total;
    }
}