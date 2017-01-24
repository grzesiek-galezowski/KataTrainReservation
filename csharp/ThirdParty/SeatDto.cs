namespace ThirdParty
{
  public class SeatDto
  {
    public SeatDto(string coach, int seatNumber)
    {
      Coach = coach;
      SeatNumber = seatNumber;
    }

    public string Coach { get; }
    public int SeatNumber { get; }

    public override int GetHashCode()
    {
      return base.GetHashCode();
    }

    /// <summary>
    ///   N.B. this is not how you would override equals in a production environment. :)
    /// </summary>
    public override bool Equals(object obj)
    {
      var other = obj as SeatDto;

      return Coach == other.Coach && SeatNumber == other.SeatNumber;
    }
  }
}