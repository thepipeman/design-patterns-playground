package structural.composite;


import structural.composite.airforce.AirForce;
import structural.composite.airforce.Pilot;
import structural.composite.ground.GroundForce;
import structural.composite.ground.Infantry;
import structural.composite.navy.Marine;
import structural.composite.navy.Navy;

import java.util.ArrayList;
import java.util.List;

public class WarDrill {

  public static void main(String[] args) {
    final List<Marine> marines = new ArrayList<>();
    marines.add(Marine.of(MissionStatus.SUCCESS));
    marines.add(Marine.of(MissionStatus.SUCCESS));
    final Army navy = new Navy(marines);
    final MissionStatus navyStatus = navy.execute("Cripple Russian Black Fleet");
    System.out.printf("Navy mission status %s", navyStatus);
    System.out.println("\n");

    final List<Pilot> pilots = new ArrayList<>();
    pilots.add(Pilot.of(MissionStatus.FAILED));
    pilots.add(Pilot.of(MissionStatus.SUCCESS));
    final Army airForce = new AirForce(pilots);
    final MissionStatus airForceStatus = airForce.execute("Bomb Kremlin");
    System.out.printf("Airforce mission status %s", airForceStatus);
    System.out.println("\n");

    final List<Infantry> groundForces = new ArrayList<>();
    groundForces.add(Infantry.of(MissionStatus.SUCCESS));
    groundForces.add(Infantry.of(MissionStatus.SUCCESS));
    final Army groundForce = new GroundForce(groundForces);
    final MissionStatus groundForceStatus = groundForce.execute("Invade Western Russia");
    System.out.printf("GroundForce mission status %s", groundForceStatus);
    System.out.println("\n");
  }
}
