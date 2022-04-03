package structural.composite.airforce;

import structural.composite.MissionStatus;
import structural.composite.Soldier;

public class Pilot extends Soldier {

  public Pilot(MissionStatus status) {
    super(status);
  }

  public static Pilot of(MissionStatus status) {
    return new Pilot(status);
  }
}
