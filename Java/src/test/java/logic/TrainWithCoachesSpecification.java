package logic;

import autofixture.publicinterface.Any;
import lombok.val;
import org.testng.annotations.Test;

import static org.mockito.BDDMockito.then;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.never;

public class TrainWithCoachesSpecification {
    @Test
    public void shouldXXXXX() { //todo rename
        //GIVEN
        val trainWithCoaches = new TrainWithCoaches();
        val seatCount = Any.intValue();
        val ticket = mock(TicketInProgress.class);

        //WHEN
        trainWithCoaches.reserve(seatCount, ticket);

        //THEN
        then(coach1).should(never()).reserve(seatCount, ticket);
        then(coach2).should().reserve(seatCount, ticket);
        then(coach3).should(never()).reserve(seatCount, ticket);
    }
    //todo ticket in progress instead of plain ticket

}