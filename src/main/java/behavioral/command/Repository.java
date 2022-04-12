package behavioral.command;

import behavioral.command.bomb.Bomb;
import lombok.Getter;
import lombok.RequiredArgsConstructor;

import java.util.HashMap;
import java.util.Map;

@Getter
@RequiredArgsConstructor
public enum Repository {
  INSTANCE;

  final Map<String, Bomb> bombs = new HashMap<>();
}
