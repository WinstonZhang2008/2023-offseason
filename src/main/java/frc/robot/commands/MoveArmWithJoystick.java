package frc.robot.commands;

import edu.wpi.first.wpilibj.XboxController;
import edu.wpi.first.wpilibj2.command.CommandBase;
import frc.robot.subsystems.ArmSubsystem;


public class MoveArmWithJoystick extends CommandBase {
  private ArmSubsystem armSubsystem;
  private XboxController driverJoyStick;
  
  public MoveArmWithJoystick(ArmSubsystem armSubsystem, XboxController driverJoystick) {
    this.armSubsystem = armSubsystem;
    this.driverJoyStick = driverJoystick;
    addRequirements(armSubsystem);
    // Use addRequirements() here to declare subsystem dependencies.
  }

  // Called when the command is initially scheduled.    
  @Override
  public void initialize() {
    armSubsystem.coast();
  }

  // Called every time the scheduler runs while the command is scheduled.
  @Override
  public void execute() {
    armSubsystem.setPower(driverJoyStick.getLeftY());
  }

  // Called once the command ends or is interrupted.
  @Override
  public void end(boolean interrupted) {
    armSubsystem.setPower(0);
  }

  // Returns true when the command should end.
  @Override
  public boolean isFinished() {
    return false;
  }
}
