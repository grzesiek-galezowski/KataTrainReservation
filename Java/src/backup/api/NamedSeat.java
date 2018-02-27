package api;

public class NamedSeat implements Seat {
    private boolean isFree = true;
    private int seatId;
    private String coachName;

    public NamedSeat(int seatId, String coachName) {
        this.seatId = seatId;
        this.coachName = coachName;
    }

    @Override
    public boolean isFree() {
        return isFree;
    }

    @Override
    public void reserveFor(Ticket response) {
        response.addSeat(seatId, coachName);
        isFree = false;
    }
}
