﻿using System.Collections.Generic;

namespace ThirdParty.ApiDtos
{
  public class ReservationResponseDto
  {
    public ReservationResponseDto(string trainId, string bookingId, List<SeatDto> seats)
    {
      TrainId = trainId;
      BookingId = bookingId;
      Seats = seats;
    }

    public string TrainId { get; }
    public string BookingId { get; }
    public List<SeatDto> Seats { get; }
  }
}