using System;

namespace ThirdParty.ExternalServices
{
  public interface IBookingIdService
  {
    Guid GenerateId();
  }
}
