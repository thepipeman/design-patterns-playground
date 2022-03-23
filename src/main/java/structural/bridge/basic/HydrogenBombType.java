package structural.bridge.basic;

public class HydrogenBombType implements NuclearBombType{
  @Override
  public void applyType() {
    System.out.println("Applied Hydrogen to nuclear bomb");
  }
}
