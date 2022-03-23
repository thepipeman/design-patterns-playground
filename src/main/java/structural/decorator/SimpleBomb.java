package structural.decorator;

class SimpleBomb implements Bomb {
  @Override
  public String make() {
    return "Explosive";
  }
}
