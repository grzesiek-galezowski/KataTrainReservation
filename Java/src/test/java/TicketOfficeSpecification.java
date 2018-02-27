import api.TicketOffice;
import autofixture.publicinterface.Any;
import logic.Ticket;
import lombok.val;
import org.testng.annotations.Test;
import request.dto.ReservationRequestDto;
import response.dto.TicketDto;

import static org.assertj.core.api.Assertions.assertThat;
import static org.mockito.BDDMockito.given;
import static org.mockito.Mockito.mock;

public class TicketOfficeSpecification {
    
    @Test
    public void shouldCreateAndExecuteCommandWithTicketAndTrain() {
        //WHEN
        val ticketOffice = new TicketOffice();
        val reservation = Any.anonymous(ReservationRequestDto.class);
        val resultDto = Any.anonymous(TicketDto.class);
        Ticket ticket = mock(Ticket.class);

        given(ticket.toDto()).willReturn(resultDto);

        //WHEN
        val ticketDto = ticketOffice.makeReservation(reservation);

        //THEN
        assertThat(ticketDto).isEqualTo(resultDto);
    }
}
