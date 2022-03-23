package structural.bridge.basic;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public abstract class NuclearBomb {

  protected NuclearBombType type;

  abstract protected void applyType();
}
