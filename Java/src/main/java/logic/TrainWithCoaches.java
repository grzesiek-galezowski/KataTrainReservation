package logic;

public class TrainWithCoaches implements Train {
    private Coach[] coaches;

    public TrainWithCoaches(Coach... coaches) {
        this.coaches = coaches;
    }

    @Override
    public void reserve(int seatCount, TicketInProgress ticketInProgress) {
        for (Coach coach : coaches) {
            if(coach.allowsReservationOf(seatCount)) {
                coach.reserve(seatCount, ticketInProgress);
                break;
            }
        }
        for (Coach coach : coaches) {
            if(coach.allowsUpFrontReservationOf(seatCount)) {
                coach.reserve(seatCount, ticketInProgress);
                return;
            }
        }

    }
}
