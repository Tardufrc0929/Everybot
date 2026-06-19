package frc.robot.subsystems;

import com.revrobotics.spark.SparkMax;
import com.revrobotics.spark.SparkLowLevel.MotorType;
import edu.wpi.first.wpilibj2.command.SubsystemBase;

public class IntakeSubsystem extends SubsystemBase {
  private final SparkMax intakeMotor;

  public IntakeSubsystem() {
    // Replace with your actual CAN ID
    intakeMotor = new SparkMax(14, MotorType.kBrushless); 
  }

  public void runIntake(double speed) {
    intakeMotor.set(speed);
  }

  public void stop() {
    intakeMotor.stopMotor();
  }
}
