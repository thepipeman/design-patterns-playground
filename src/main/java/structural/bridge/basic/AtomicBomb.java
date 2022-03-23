package structural.bridge.basic;

public class AtomicBomb extends NuclearBomb {
  public AtomicBomb(NuclearBombType type) {
    super(type);
  }
  @Override
  protected void applyType() {
    type.applyType();
  }
}
