using System.Collections.Generic;
using ThirdParty.ApiDtos;

namespace ThirdParty.ConfigurationDtos
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