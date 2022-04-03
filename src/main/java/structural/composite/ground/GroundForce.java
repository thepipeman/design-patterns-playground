package structural.composite.ground;

import lombok.EqualsAndHashCode;
import lombok.Value;
import structural.composite.MissionExecutor;

import java.util.List;

@EqualsAndHashCode(callSuper = true)
@Value
public class GroundForce extends MissionExecutor<Infantry> {

  List<Infantry> infantries;

  @Override
  protected List<Infantry> getArmy() {
    return this.infantries;
  }
}
