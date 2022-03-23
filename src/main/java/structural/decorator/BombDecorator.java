package structural.decorator;

abstract class BombDecorator implements Bomb {

  Bomb customBomb;

  BombDecorator(Bomb customBomb) {
    this.customBomb = customBomb;
  }

  public String make() {
    return customBomb.make();
  }
}
