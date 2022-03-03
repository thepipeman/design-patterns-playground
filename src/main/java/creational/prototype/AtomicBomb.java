package creational.prototype;

public class AtomicBomb extends NuclearBomb {

  public AtomicBomb() {
    this.disasterLevel = 5;
    this.radius = 1500;
    this.name = "Atomic";
  }

  @Override
  public void assemble() {
    System.out.println("Assembled atomic bomb");
  }
}
