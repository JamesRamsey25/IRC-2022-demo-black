package frc.robot.commands;

import frc.robot.subsystems.Arm;
import edu.wpi.first.wpilibj2.command.CommandBase;

public class Arm extends CommandBase {
  private Arm arm;
  private Direction dir;

  public Drive(Arm arm, Direction dir) {
    this.arm = arm;
    this.dir = dir;
    addRequirements(arm);
  }

  @Override
  public void execute(){
    arm.move(dir);
  }
}