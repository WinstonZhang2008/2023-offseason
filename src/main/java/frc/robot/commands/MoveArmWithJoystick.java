<<<<<<< Updated upstream
=======
// Copyright (c) FIRST and other WPILib contributors.
// Open Source Software; you can modify and/or share it under the terms of
// the WPILib BSD license file in the root directory of this project.

>>>>>>> Stashed changes
package frc.robot.commands;

import edu.wpi.first.wpilibj.XboxController;
import edu.wpi.first.wpilibj2.command.CommandBase;
<<<<<<< Updated upstream
import frc.robot.subsystems.ArmSubsystem;

public class MoveArmWithJoystick extends CommandBase {
  /** Creates a new MoveArmWithJoystick. */

  //initialize your subsystems, controllers
  XboxController joystick1;
  public MoveArmWithJoystick(ArmSubsystem armSubsystem, XboxController joystick1) {
    //add your parameters to the command
    // Use addRequirements() here to declare subsystem dependencies.
    this.joystick1 = joystick1;
  }

  @Override
  public void initialize() {}

  @Override
  public void execute() {
    double joystickArmPower = joystick1.getLeftY(); //use this joystick armpower to set power to your motors
  }


  @Override
  public void end(boolean interrupted) {
    
  }

=======
import frc.robot.subsystems.arm.ArmSubsystem;

public class MoveArmWithJoystick extends CommandBase {
  /** Creates a new MoveArmWithJoystick. */
  ArmSubsystem armSubsystem = new ArmSubsystem();
  XboxController driverJoyStick = new XboxController(1);
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
>>>>>>> Stashed changes
  @Override
  public boolean isFinished() {
    return false;
  }
}
