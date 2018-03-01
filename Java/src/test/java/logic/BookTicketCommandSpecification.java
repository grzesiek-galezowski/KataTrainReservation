package logic;

import autofixture.publicinterface.Any;
import lombok.val;
import org.testng.annotations.Test;
import request.dto.ReservationRequestDto;

import static org.mockito.BDDMockito.then;
import static org.mockito.Mockito.mock;

public class BookTicketCommandSpecification {

    @Test
    public void shouldXXXXXXXXXXXXX() {
        //GIVEN
        val reservation = Any.anonymous(ReservationRequestDto.class);
        val ticket = Any.anonymous(Ticket.class);
        val train = mock(Train.class);
        val bookTicketCommand
            = new BookTicketCommand(reservation, ticket, train);
        //WHEN
        bookTicketCommand.execute();

        //THEN
        then(train).should().reserve(reservation.seatCount, ticket);
    }
}