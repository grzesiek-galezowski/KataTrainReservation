package dto;

import java.util.List;

public class ReservationDto {
	public final String trainId;
    public final String bookingId;
    public final List<SeatDto> seats;

    public ReservationDto(
        String trainId,
        List<SeatDto> seats,
        String bookingId) {

		this.trainId = trainId;
        this.bookingId = bookingId;
        this.seats = seats;
    }

}
