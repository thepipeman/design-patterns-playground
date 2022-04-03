package structural.decorator.v1;

abstract class BombDecorator implements Bomb {

  Bomb customBomb;

  BombDecorator(Bomb customBomb) {
    this.customBomb = customBomb;
  }

  public String make() {
    return customBomb.make();
  }
}
