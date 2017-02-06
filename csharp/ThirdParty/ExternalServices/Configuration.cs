using ThirdParty.ConfigurationDtos;

namespace ThirdParty.ExternalServices
{
  public interface IConfiguration
  {
    TrainEntryDto[] Load();
  }
}
