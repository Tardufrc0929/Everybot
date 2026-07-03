package frc.robot.commands;

import edu.wpi.first.wpilibj2.command.Command;
import frc.robot.subsystems.ClimberSubsystem;

public class ClimberCommand extends Command {

    private final ClimberSubsystem climber;

    public ClimberCommand(ClimberSubsystem climber) {
        this.climber = climber;
        addRequirements(climber);
    }

    @Override
    public void initialize() {
        climber.climbup();
    }

    @Override
    public void execute() {

    }

    @Override
    public void end(boolean interrupted) {
        climber.stopClimb();
    }

    @Override
    public boolean isFinished() {
        return climber.isTopLimitPressed();;
    }

     @Override
    public void initialize() {
        climber.climbdown();
    }

    @Override
    public boolean isFinished() {
        return climber.isBottomLimitPressed();;
    }