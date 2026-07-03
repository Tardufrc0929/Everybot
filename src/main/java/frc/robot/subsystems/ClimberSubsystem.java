package frc.robot.subsystems;


import edu.wpi.first.wpilibj2.command.SubsystemBase;
import edu.wpi.first.wpilibj.DigitalInput;

public class ClimberSubsystem extends SubsystemBase {

    private final DigitalInput topLimitSwitch = new DigitalInput(0);
    private final DigitalInput bottomLimitSwitch = new DigitalInput(1);

    public ClimberSubsystem() {
        
    }
    
    public void climbup() {
        System.out.println("Climber çıkıyor.");
        motor.set(0.8);
    }
    public void climbdown() {
        System.out.println("Climber iniyor.");
        motor.set(-0.8);
    }


    public void stopClimb() {
        System.out.println("Climber durdu.");
    }

    public boolean isTopLimitPressed() {
        return topLimitSwitch.get();
    }

    public boolean isBottomLimitPressed() {
        return bottomLimitSwitch.get();
    }

    @Override
    public void periodic() {

    }
}