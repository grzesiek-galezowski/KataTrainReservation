package api;

public class TrainSeatsCondition {
    public boolean isMet(
        double freeCount,
        int seatCount,
        double total) {
        return total + seatCount / freeCount <= 0.7;
    }
}
