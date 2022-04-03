package structural.composite;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class Soldier implements Army {

  private MissionStatus status;

  @Override
  public MissionStatus execute(String mission) {
    return this.status;
  }
}
