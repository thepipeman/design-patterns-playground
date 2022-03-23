package structural.decorator;

class AtomicBombDecorator extends BombDecorator {

  AtomicBombDecorator(Bomb customBomb) {
    super(customBomb);
  }

  public String make() {
    return customBomb.make() + "Atomic";
  }
}
