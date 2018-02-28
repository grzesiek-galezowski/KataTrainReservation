import api.TicketOffice;
import autofixture.publicinterface.Any;
import logic.Command;
import logic.CommandFactory;
import logic.Ticket;
import logic.TicketFactory;
import lombok.val;
import org.testng.annotations.Test;
import request.dto.ReservationRequestDto;
import response.dto.TicketDto;

import static org.assertj.core.api.Assertions.assertThat;
import static org.mockito.BDDMockito.given;
import static org.mockito.BDDMockito.then;
import static org.mockito.Mockito.mock;

public class TicketOfficeSpecification {
    
    @Test
    public void shouldCreateAndExecuteCommandWithTicketAndTrain() {
        //WHEN
        val commandFactory = mock(CommandFactory.class);
        val ticketOffice = new TicketOffice(commandFactory);
        val reservation = Any.anonymous(ReservationRequestDto.class);
        val resultDto = Any.anonymous(TicketDto.class);
        val ticket = mock(Ticket.class);
        val bookCommand = mock(Command.class);
        val ticketFactory = mock(TicketFactory.class);

        given(ticketFactory.createBlankTicket()).willReturn(ticket);
        given(ticket.toDto()).willReturn(resultDto);
        given(commandFactory.createBookCommand(reservation, ticket))
            .willReturn(bookCommand);

        //WHEN
        val ticketDto = ticketOffice.makeReservation(reservation);

        //THEN
        then(bookCommand).should().execute();
        assertThat(ticketDto).isEqualTo(resultDto);
    }
}
