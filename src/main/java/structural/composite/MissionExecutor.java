package structural.composite;

import java.util.List;

public abstract class MissionExecutor<SOLDIER extends Soldier> implements Army {

  protected abstract List<SOLDIER> getArmy();

  @Override
  public MissionStatus execute(String mission) {
    final boolean isFailed = getArmy().stream()
      .anyMatch(soldier -> soldier.execute(mission) == MissionStatus.FAILED);
    return isFailed ? MissionStatus.FAILED : MissionStatus.SUCCESS;
  }
}
