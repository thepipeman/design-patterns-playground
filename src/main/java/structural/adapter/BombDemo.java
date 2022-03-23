package structural.adapter;

import java.util.List;

public class BombDemo {

  public static void main(String[] args) {
    final BombClient bombClient = new BombClient();
    final List<Bomb> bombs = bombClient.getBombs();
    System.out.println(bombs);
  }

}
