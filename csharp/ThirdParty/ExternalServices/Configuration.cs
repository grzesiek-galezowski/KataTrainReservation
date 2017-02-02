using ThirdParty.ConfigurationDtos;

namespace ThirdParty.ExternalServices
{
  interface Configuration
  {
    TrainEntryDto[] Load();
  }
}
