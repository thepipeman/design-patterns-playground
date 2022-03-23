package structural.bridge.basic;

public class AtomicBombType implements NuclearBombType{
  @Override
  public void applyType() {
    System.out.println("Applied Atomic to nuclear bomb");
  }
}
