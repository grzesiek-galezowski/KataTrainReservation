package api;

import response.dto.ReservationDto;

public interface Ticket {
    ReservationDto buildDto();

    void addSeat(int seatNumber, String coachName);
}

