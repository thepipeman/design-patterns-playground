package behavioral.command.bomb;

import behavioral.command.Repository;
import behavioral.command.core.Command;

public class CreateBomb implements Command<Bomb, Void> {

  @Override
  public Void execute(Bomb input) {
    final var repo = Repository.INSTANCE;
    repo.getBombs().put(input.getName(), input);
    return null;
  }
}
