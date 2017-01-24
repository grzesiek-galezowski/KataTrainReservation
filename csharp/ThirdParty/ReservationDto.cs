using System.Collections.Generic;

namespace ThirdParty
{
  public class ReservationDto
  {
    public ReservationDto(string trainId, string bookingId, List<Seat> seats)
    {
      TrainId = trainId;
      BookingId = bookingId;
      Seats = seats;
    }

    public string TrainId { get; }
    public string BookingId { get; }
    public List<Seat> Seats { get; }
  }
}