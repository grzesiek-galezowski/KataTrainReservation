package api;

import java.util.List;

public class TrainWithCoaches implements Train {
    private List<Coach> coaches;

    public TrainWithCoaches(List<Coach> coaches) {
        this.coaches = coaches;
    }

    @Override
    public void provideDetailsFor(BookingRequest bookingRequest) {
        for(Coach coach : coaches) {
            //bookingRequest.collectSeatInfoFrom(coach); todo not part of the book
            bookingRequest.evaluateCandidatureOf(coach);
        }
    }

}
