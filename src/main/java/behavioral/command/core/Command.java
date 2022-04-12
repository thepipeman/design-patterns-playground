package behavioral.command.core;

public interface Command<INPUT extends CommandInput, OUTPUT> {

  OUTPUT execute(INPUT input);
}
