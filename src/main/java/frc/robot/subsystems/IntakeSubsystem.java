package frc.robot.subsystems;


import edu.wpi.first.wpilibj2.command.SubsystemBase;

public class IntakeSubsystem extends SubsystemBase {
    public IntakeSubsystem() {

    }

    public void intake() {
        System.out.println("Intake çalışıyor.");
    }

    public void stopIntake() {
        System.out.println("Intake durdu.");
    }

    @Override
    public void periodic() {

    }
}
