package logic;

import autofixture.publicinterface.Any;
import lombok.val;
import org.testng.annotations.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class CoachWithSeatsSpecification {

    @Test
    public void xxXXxxXX() { //todo rename
        //GIVEN
        val coachWithSeats = new CoachWithSeats();
        //WHEN
        int seatCount = Any.intValue();
        val reservationAllowed = coachWithSeats.allowsReservationOf(seatCount);

        //THEN
        assertThat(reservationAllowed).isTrue();
    }

}