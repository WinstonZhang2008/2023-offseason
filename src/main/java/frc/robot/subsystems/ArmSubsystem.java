package frc.robot.subsystems;

import com.ctre.phoenix.motorcontrol.ControlMode;
import com.ctre.phoenix.motorcontrol.NeutralMode;
import com.ctre.phoenix.motorcontrol.can.TalonFX;

import edu.wpi.first.wpilibj2.command.SubsystemBase;

public class ArmSubsystem extends SubsystemBase {
  private TalonFX armMotor;

  //add motors here
  public ArmSubsystem() {
    //make proper initializations
    armMotor = new TalonFX(50);
  }

  //consider what methods are necessary for the motor to run effectively
  
  
  public void setPower(double power) {
    armMotor.set(ControlMode.PercentOutput,power);
  }

  public void brake(){
    armMotor.setNeutralMode(NeutralMode.Brake);
  }
  public void coast(){
    armMotor.setNeutralMode(NeutralMode.Coast);
  }
}
