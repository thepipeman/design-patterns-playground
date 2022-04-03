package structural.decorator.v1;

public class BombDecortorDemo {

  public static void main(String[] args) {
    Bomb simpleBomb = new SimpleBomb();
    Bomb atomicBomb = new AtomicBombDecorator(simpleBomb);
    System.out.println(atomicBomb.make());
  }
}
