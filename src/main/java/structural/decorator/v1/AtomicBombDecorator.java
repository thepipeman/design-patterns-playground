package structural.decorator.v1;

class AtomicBombDecorator extends BombDecorator {

  AtomicBombDecorator(Bomb customBomb) {
    super(customBomb);
  }

  public String make() {
    return customBomb.make() + "Atomic";
  }
}
