package behavioral.command;

import behavioral.command.bomb.*;

public class CommandExecutor {

  public static void main(String[] args) {
    final var executor = new CommandExecutor();
    executor.populateBombs();
    final var repo = Repository.INSTANCE;
    System.out.println(repo.getBombs());

    final var removeBombCommand = new RemoveBomb();
    removeBombCommand.execute(RemoveBomb.Input.builder().name("Little Man").build());
    System.out.println(repo.getBombs());
  }

  private void populateBombs() {
    final var createBombCommand = new CreateBomb();
    createBombCommand.execute(Bomb.of("Tsar Bomba", 8, "Hydrogen"));
    createBombCommand.execute(Bomb.of("Little Man", 5, "Atomic"));
  }

}
