package logic;

import lombok.val;
import org.testng.annotations.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class BookTicketCommandSpecification {

    @Test
    public void shouldXXXXXXXXXXXXX() {
        //GIVEN
        val bookTicketCommand
            = new BookTicketCommand(reservation, ticket, train);
        //WHEN
        bookTicketCommand.execute();

        //THEN
        assertThat(1).isEqualTo(2);
    }
}