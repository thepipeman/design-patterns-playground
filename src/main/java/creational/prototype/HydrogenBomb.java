package creational.prototype;

public class HydrogenBomb extends NuclearBomb {

  public HydrogenBomb() {
    this.disasterLevel = 5;
    this.radius = 1500;
    this.name = "Hydrogen";
  }

  @Override
  public void assemble() {
    System.out.println("Hydrogen Bomb created");
  }
}
