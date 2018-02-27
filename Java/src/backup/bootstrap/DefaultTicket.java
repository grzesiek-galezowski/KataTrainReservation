package bootstrap;

import api.Ticket;
import javafx.util.Pair;
import response.dto.ReservationDto;
import response.dto.SeatDto;

import java.util.List;
import java.util.UUID;

import static java.util.stream.Collectors.toList;
import static org.mutabilitydetector.internal.com.google.common.collect.Lists.newArrayList;

public class DefaultTicket implements Ticket {
    private String trainId;
    private List<Pair<Integer, String>> seats = newArrayList();

    public DefaultTicket(String trainId) {
        //todo implement

        this.trainId = trainId;
    }

    //todo might apply interface segregation here
    @Override
    public ReservationDto buildDto() {
        ReservationDto dto = new ReservationDto(trainId, createSeats(), UUID.randomUUID().toString());
        return dto;
    }

    private List<SeatDto> createSeats() {
        return seats.stream()
            .map(info -> new SeatDto(info.getValue(), info.getKey()))
            .collect(toList());
    }

    public void addSeat(int seatNumber, String coachName) {
        seats.add(new Pair<>(seatNumber, coachName));
    }
}
