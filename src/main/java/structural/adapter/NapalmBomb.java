package structural.adapter;

import lombok.Builder;
import lombok.Value;

@Value
@Builder
public class NapalmBomb  {
  String name;
  int level;
  int radius;
}
