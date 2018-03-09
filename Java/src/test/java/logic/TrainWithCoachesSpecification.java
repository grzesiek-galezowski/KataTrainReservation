package logic;

import autofixture.publicinterface.Any;
import lombok.val;
import org.testng.annotations.Test;

import static org.mockito.BDDMockito.given;
import static org.mockito.BDDMockito.then;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.never;

public class TrainWithCoachesSpecification {
    @Test
    public void shouldReserveSeatsInFirstCoachThatHasPlaceBelowLimit() {
        //GIVEN
        val seatCount = Any.intValue();
        val ticket = mock(TicketInProgress.class);

        Coach coach1 = coachWithoutAvailableUpFront(seatCount);
        Coach coach2 = coachWithAvailableUpFront(seatCount);
        Coach coach3 = coachWithAvailableUpFront(seatCount);

        val trainWithCoaches = new TrainWithCoaches(
            coach1, coach2, coach3
        );
        //WHEN
        trainWithCoaches.reserve(seatCount, ticket);

        //THEN
        then(coach1).should(never()).reserve(seatCount, ticket);
        then(coach2).should().reserve(seatCount, ticket);
        then(coach3).should(never()).reserve(seatCount, ticket);
    }

    private Coach coachWithAvailableUpFront(Integer seatCount) {
        val coach2 = mock(Coach.class);
        given(coach2.allowsUpFrontReservationOf(seatCount))
            .willReturn(true);
        given(coach2.allowsReservationOf(seatCount))
            .willReturn(true);
        return coach2;
    }

    private Coach coachWithoutAvailableUpFront(Integer seatCount) {
        val coach1 = mock(Coach.class);
        given(coach1.allowsUpFrontReservationOf(seatCount))
            .willReturn(false);
        given(coach1.allowsReservationOf(seatCount))
            .willReturn(true);
        return coach1;
    }

    @Test
    public void
    shouldReserveSeatsInFirstCoachThatHasFreeSeatsIfNoneAllowsReservationUpFront() {
        //GIVEN
        val seatCount = Any.intValue();
        val ticket = mock(TicketInProgress.class);
        val coach1 = mock(Coach.class);
        val coach2 = mock(Coach.class);
        val coach3 = mock(Coach.class);
        val trainWithCoaches = new TrainWithCoaches(
            coach1, coach2, coach3
        );

        given(coach1.allowsUpFrontReservationOf(seatCount))
            .willReturn(false);
        given(coach2.allowsUpFrontReservationOf(seatCount))
            .willReturn(false);
        given(coach3.allowsUpFrontReservationOf(seatCount))
            .willReturn(false);
        given(coach1.allowsReservationOf(seatCount))
            .willReturn(false);
        given(coach2.allowsReservationOf(seatCount))
            .willReturn(true);
        given(coach3.allowsReservationOf(seatCount))
            .willReturn(false);

        //WHEN
        trainWithCoaches.reserve(seatCount, ticket);

        //THEN
        then(coach1).should(never()).reserve(seatCount, ticket);
        then(coach2).should().reserve(seatCount, ticket);
        then(coach3).should(never()).reserve(seatCount, ticket);
    }


    //todo what if no coach allows up front reservation?
}