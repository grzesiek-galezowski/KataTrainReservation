package logic;

import lombok.val;
import org.testng.annotations.Test;
import request.dto.ReservationRequestDto;

import static com.github.grzesiek_galezowski.test_environment.types.ObjectGraphContainsDependencyCondition.dependencyOn;
import static org.assertj.core.api.Assertions.assertThat;
import static org.mockito.Mockito.mock;

public class BookingCommandFactoryTest {
    @Test
    public void shouldCreateBookTicketCommand() {
        //GIVEN
        val bookingCommandFactory = new BookingCommandFactory();
        val reservation = mock(ReservationRequestDto.class);
        val ticket = mock(Ticket.class);

        //WHEN
        Command result = bookingCommandFactory
            .createBookCommand(reservation, ticket);

        //THEN
        assertThat(result).isInstanceOf(BookTicketCommand.class);
        assertThat(result).has(dependencyOn(reservation));
        assertThat(result).has(dependencyOn(ticket));
    }
}