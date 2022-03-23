package structural.bridge.basic;

public class HydrogenBomb extends NuclearBomb {

  public HydrogenBomb(NuclearBombType type) {
    super(type);
  }
  @Override
  protected void applyType() {
    type.applyType();
  }
}
