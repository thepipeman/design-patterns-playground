package behavioral.command.bomb;

import behavioral.command.Repository;
import behavioral.command.core.Command;
import behavioral.command.core.CommandInput;
import lombok.Builder;
import lombok.Value;

public class RemoveBomb implements Command<RemoveBomb.Input, Void> {

  @Value
  @Builder
  public static class Input implements CommandInput {
    String name;
  }

  @Override
  public Void execute(Input input) {
    final var repo = Repository.INSTANCE;
    if (repo.getBombs().get(input.getName()) != null) {
      repo.getBombs().remove(input.getName());
    }
    return null;
  }
}
