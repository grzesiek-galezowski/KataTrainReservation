package logic;

import autofixture.publicinterface.Any;
import lombok.val;
import org.testng.annotations.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class CoachWithSeatsSpecification {

    @Test
    public void xxXXxxXX() { //todo rename
        //GIVEN
        Seat seat1 = Any.anonymous(Seat.class);
        val coachWithSeats = new CoachWithSeats(
            seat1,
            seat2,
            seat3,
            seat4,
            seat5,
            seat6,
            seat7,
            seat8,
            seat9
        );
        //WHEN
        int seatCount = Any.intValue();
        val reservationAllowed = coachWithSeats.allowsReservationOf(seatCount);

        //THEN
        assertThat(reservationAllowed).isTrue();
    }

}