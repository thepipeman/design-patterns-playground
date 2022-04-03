package structural.composite.ground;

import structural.composite.MissionStatus;
import structural.composite.Soldier;

public class Infantry extends Soldier {

  public Infantry(MissionStatus status) {
    super(status);
  }

  public static Infantry of(MissionStatus status) {
    return new Infantry(status);
  }
}
