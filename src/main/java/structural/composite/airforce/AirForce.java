package structural.composite.airforce;

import lombok.EqualsAndHashCode;
import lombok.Value;
import structural.composite.MissionExecutor;

import java.util.List;

@EqualsAndHashCode(callSuper = true)
@Value
public class AirForce extends MissionExecutor<Pilot> {

  List<Pilot> pilots;

  @Override
  protected List<Pilot> getArmy() {
    return this.pilots;
  }
}
