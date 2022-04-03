package structural.decorator.v1;

class SimpleBomb implements Bomb {
  @Override
  public String make() {
    return "Explosive";
  }
}
