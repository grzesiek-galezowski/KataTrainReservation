import api.TicketOffice;
import autofixture.publicinterface.Any;
import lombok.val;
import org.testng.annotations.Test;
import request.dto.ReservationRequestDto;

import static org.assertj.core.api.Assertions.assertThat;

public class TicketOfficeSpecification {
    
    @Test
    public void shouldCreateAndExecuteCommandWithTicketAndTrain() {
        //WHEN
        val ticketOffice = new TicketOffice();
        val reservation = Any.anonymous(ReservationRequestDto.class);
        //WHEN
        val ticketDto = ticketOffice.makeReservation(reservation);

        //THEN
        assertThat(ticketDto).isEqualTo(resultDto);
    }
}
