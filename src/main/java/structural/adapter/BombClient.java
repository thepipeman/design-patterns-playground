package structural.adapter;

import lombok.NoArgsConstructor;

import java.util.ArrayList;
import java.util.List;

@NoArgsConstructor
public class BombClient {

  public List<Bomb> getBombs() {
    final List<Bomb> bombs = new ArrayList<>();
    bombs.add(
      AtomicBomb.builder()
        .name("Fat Man")
        .level(2)
        .type("Atomic")
        .build()
    );

    final NapalmBomb napalmBomb = NapalmBomb.builder()
      .name("Burn")
      .radius(5)
      .level(3)
      .build();
    bombs.add(BombAdapterNapalm.of(napalmBomb));

    return bombs;
  }
}
