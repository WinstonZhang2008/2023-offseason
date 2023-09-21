package frc.robot;

import edu.wpi.first.wpilibj.XboxController;
import edu.wpi.first.wpilibj2.command.Command;
import edu.wpi.first.wpilibj2.command.WaitCommand;
import frc.robot.commands.MoveArmWithJoystick;
import frc.robot.subsystems.ArmSubsystem;

public class RobotContainer {
  private final XboxController driverJoystick = new XboxController(0);
  private final XboxController operatorJoystick = new XboxController(1);

  // Subsystems
  private final ArmSubsystem armSubsystem = new ArmSubsystem();

  // Commands
  private final MoveArmWithJoystick moveArmWithJoystick = new MoveArmWithJoystick(armSubsystem, driverJoystick);

  public RobotContainer() {
    configureButtonBindings();
    setDefaultCommands();
  }

  private void configureButtonBindings() {}

  public Command getAutonomousCommand() {
    return new WaitCommand(5);
  }

  public void setDefaultCommands() {
    armSubsystem.setDefaultCommand(moveArmWithJoystick);
  }

}
