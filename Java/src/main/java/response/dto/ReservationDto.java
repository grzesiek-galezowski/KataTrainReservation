package response.dto;

import java.util.List;

public class ReservationDto {
	public final String trainId;
    public final String ticketId;
    public final List<SeatDto> seats;

    public ReservationDto(
        String trainId,
        List<response.dto.SeatDto> seats,
        String ticketId) {

		this.trainId = trainId;
        this.ticketId = ticketId;
        this.seats = seats;
    }

}
