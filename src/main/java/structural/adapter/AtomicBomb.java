package structural.adapter;

import lombok.Builder;
import lombok.Value;

@Value
@Builder
public class AtomicBomb implements Bomb {
  String name;
  int level;
  String type;
}
