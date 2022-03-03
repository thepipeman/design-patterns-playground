package creational.prototype;

public class BombDemo {

  public static void main(String[] args) {
    BombCache.loadCache();

    NuclearBomb atomic = BombCache.getBomb("Atomic");
    System.out.println(atomic);

    NuclearBomb hydrogen = BombCache.getBomb("Hydrogen");
    System.out.println(hydrogen);
  }
}
