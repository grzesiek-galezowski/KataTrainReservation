namespace ThirdParty
{
  public class ReservationRequestDto
  {
    public ReservationRequestDto(string trainId, int seatCount)
    {
      TrainId = trainId;
      SeatCount = seatCount;
    }

    public string TrainId { get; }
    public int SeatCount { get; }
  }
}