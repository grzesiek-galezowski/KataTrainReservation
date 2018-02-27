package api;

import java.util.List;

import static com.google.common.collect.Lists.newArrayList;

public class DefaultBookingRequest implements BookingRequest {
    private final int seatCount;
    private final TrainReservationCondition trainReservationCondition;
    private List<Coach> candidates = newArrayList();
    private List<Coach> secondaryCandidates = newArrayList();

    public DefaultBookingRequest(
        int seatCount,
        TrainReservationCondition trainReservationCondition) {

        this.seatCount = seatCount;
        //taking advantage of this being done once
        this.trainReservationCondition = trainReservationCondition;
    }

    @Override
    public void makeWith(Ticket ticket) {
        if (trainReservationCondition.isMetAfterBooking(seatCount)) { //todo this is not the right condition, it should take seat count????
            for(Coach candidate : candidates) {
                candidate.reserveSeats(seatCount, ticket);
                return;
            }
            for(Coach secondaryCandidate : secondaryCandidates) {
                secondaryCandidate.reserveSeats(seatCount, ticket);
                return;
            }
        }

    }

    //TODO no tests
    @Override
    public void evaluateCandidatureOf(Coach coach) {
        if (coach.isWithinTheLimitAfterBooking(seatCount)) {
            candidates.add(coach);
        } else if (coach.hasFreeSeats(seatCount)) {
            secondaryCandidates.add(coach); //todo more tests
        }
    }


    //todo not part of the book
    /*@Override
    public void collectSeatInfoFrom(Coach coach) {
        coach.fillSeatInfo(this.trainReservationCondition);
    }*/
}
