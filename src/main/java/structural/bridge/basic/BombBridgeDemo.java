package structural.bridge.basic;

public class BombBridgeDemo {

  public static void main(String[] args) {
    NuclearBombType hydrogenType = new HydrogenBombType();
    NuclearBomb tsarBomba = new HydrogenBomb(hydrogenType);

    NuclearBombType atomicType = new AtomicBombType();
    NuclearBomb fatMan = new AtomicBomb(atomicType);

    tsarBomba.applyType();
    fatMan.applyType();
  }
}
