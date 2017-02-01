using ThirdParty.Dto;

namespace ThirdParty.ExternalServices
{
  interface Configuration
  {
    TrainEntryDto[] Load();
  }
}
