package logic;

import lombok.val;
import org.testng.annotations.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class TrainWithCoachesSpecification {
    @Test
    public void shouldXXXXX() { //todo rename
        //GIVEN
        val trainWithCoaches = new TrainWithCoaches();

        //WHEN
        trainWithCoaches.reserve(seatCount, ticket);

        //THEN
        assertThat(1).isEqualTo(2);
    }

}