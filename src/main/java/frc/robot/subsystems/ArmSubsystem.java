package frc.robot.subsystems;

import edu.wpi.first.wpilibj2.command.SubsystemBase;

import com.ctre.phoenix.motorcontrol.ControlMode;
import com.ctre.phoenix.motorcontrol.DemandType;
import com.ctre.phoenix.motorcontrol.NeutralMode;
import com.ctre.phoenix.motorcontrol.TalonFXControlMode;
import com.ctre.phoenix.motorcontrol.TalonFXFeedbackDevice;
import com.ctre.phoenix.motorcontrol.can.TalonFX;
import com.ctre.phoenix.motorcontrol.can.TalonFXConfiguration;

import edu.wpi.first.math.controller.ArmFeedforward;
import edu.wpi.first.math.trajectory.TrapezoidProfile;
import edu.wpi.first.math.util.Units;
import edu.wpi.first.wpilibj.DutyCycleEncoder;
import edu.wpi.first.wpilibj.Encoder;
import edu.wpi.first.wpilibj.smartdashboard.SmartDashboard;

public class ArmSubsystem extends SubsystemBase {
  private TalonFX armMotor;

  //add motors here
  public ArmSubsystem() {
    //make proper initializations
    armMotor = new TalonFX(50);
  }

  //consider what methods are necessary for the motor to run effectively
  
  @Override
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
