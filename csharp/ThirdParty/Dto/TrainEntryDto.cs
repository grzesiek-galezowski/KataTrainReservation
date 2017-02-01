using System.Collections.Generic;

namespace ThirdParty.Dto
{
  public class TrainEntryDto
  {
    public TrainEntryDto(string trainId, List<SeatDto> seats)
    {
      TrainId = trainId;
      Seats = seats;
    }

    public string TrainId { get; }
    public List<SeatDto> Seats { get; }
  }
}