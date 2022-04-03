package structural.composite.navy;

import lombok.EqualsAndHashCode;
import lombok.Value;
import structural.composite.MissionExecutor;

import java.util.List;

@EqualsAndHashCode(callSuper = true)
@Value
public class Navy extends MissionExecutor<Marine> {

  List<Marine> marines;

  @Override
  protected List<Marine> getArmy() {
    return this.marines;
  }
}
