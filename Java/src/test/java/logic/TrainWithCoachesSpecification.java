package logic;

import autofixture.publicinterface.Any;
import lombok.val;
import org.testng.annotations.Test;

import static org.assertj.core.api.Assertions.assertThat;
import static org.mockito.Mockito.mock;

public class TrainWithCoachesSpecification {
    @Test
    public void shouldXXXXX() { //todo rename
        //GIVEN
        val trainWithCoaches = new TrainWithCoaches();
        val seatCount = Any.intValue();
        val ticket = mock(Ticket.class);

        //WHEN
        trainWithCoaches.reserve(seatCount, ticket);

        //THEN
        assertThat(1).isEqualTo(2);
    }

}