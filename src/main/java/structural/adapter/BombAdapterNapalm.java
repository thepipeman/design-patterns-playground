package structural.adapter;

import lombok.Builder;
import lombok.Value;

@Value
@Builder
public class BombAdapterNapalm implements Bomb {
  String name;
  int level;
  String type;
  NapalmBomb napalmInstance;

  public static BombAdapterNapalm of(NapalmBomb napalmBomb) {
    return BombAdapterNapalm.builder()
      .napalmInstance(napalmBomb)
      .name(napalmBomb.getName())
      .level(napalmBomb.getLevel())
      .type("Burning Type")
      .build();
  }
}
