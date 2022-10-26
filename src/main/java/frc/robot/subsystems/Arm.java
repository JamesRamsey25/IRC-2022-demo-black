package frc.robot.subsystems;

import edu.wpi.first.wpilibj2.command.SubsystemBase;
import edu.wpi.first.wpilibj.motorcontrol.VictorSP

public class Arm extends SubsystemBase {
  private VictorSP armVictor;
  private static enum Direction {
    FORWARDS, BACKWARDS
  }
  private Direction dir;

  public Arm() {
    armVictor = new VictorSP(2);
  }

  public void move(double dir){
    this.dir = dir;
    if (dir == Direction.FORWARDS){
        arm.set(0.5);
    } else {
        arm.set(-0.5;)
    }
  }
}