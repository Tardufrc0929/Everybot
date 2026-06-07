package frc.robot.subsystems;

import edu.wpi.first.wpilibj2.command.SubsystemBase;

public class ShooterSubsystem extends SubsystemBase {

    public ShooterSubsystem() {

    }

    public void shoot() {
        System.out.println("Shooter çalışıyor.");
    }

    public void stopShooter() {
        System.out.println("Shooter durdu.");
    }

    @Override
    public void periodic() {

    }
}