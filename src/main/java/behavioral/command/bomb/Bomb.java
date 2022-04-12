package behavioral.command.bomb;

import behavioral.command.core.CommandInput;
import lombok.Builder;
import lombok.Value;

@Value
@Builder
public class Bomb implements CommandInput {
  String name;
  int level;
  String type;

  public static Bomb of(String name, int level, String type) {
    return Bomb.builder()
      .name(name)
      .level(level)
      .type(type)
      .build();
  }
}
