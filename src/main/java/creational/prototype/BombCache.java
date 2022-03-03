package creational.prototype;

import java.util.HashMap;
import java.util.Map;

public class BombCache {

  private static final Map<String, NuclearBomb> bombCache = new HashMap<>();

  public static NuclearBomb getBomb(String name) {
    NuclearBomb cachedBomb = bombCache.get(name);
    return (NuclearBomb) cachedBomb.clone();
  }

  public static void loadCache() {
    AtomicBomb atomicBomb = new AtomicBomb();
    bombCache.put(atomicBomb.getName(), atomicBomb);

    HydrogenBomb hydroBomb = new HydrogenBomb();
    bombCache.put(hydroBomb.getName(), hydroBomb);
  }

}
