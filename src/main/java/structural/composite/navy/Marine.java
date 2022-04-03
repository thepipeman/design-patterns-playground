package structural.composite.navy;

import structural.composite.MissionStatus;
import structural.composite.Soldier;

public class Marine extends Soldier {
  public Marine(MissionStatus status) {
    super(status);
  }

  public static Marine of(MissionStatus status) {
    return new Marine(status);
  }
}
