package logic;

import request.dto.ReservationRequestDto;

public interface CommandFactory {
    Command createBookCommand(ReservationRequestDto reservation);
}
