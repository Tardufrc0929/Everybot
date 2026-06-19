package frc.robot.commands;

import edu.wpi.first.wpilibj2.command.Command;
import frc.robot.subsystems.IntakeSubsystem;

public class IntakeCommand extends Command {

    private final IntakeSubsystem intaker;

    public ShootCommand(IntakeSubsystem intaker) {
        this.intaker = intaker;
        addRequirements(intaker);
    }

    @Override
    public void initialize() {
        intaker.intake();
    }

    @Override
    public void execute() {

    }

    @Override
    public void end(boolean interrupted) {
        intaker.stopIntake();
    }

    @Override
    public boolean isFinished() {
        return false;
    }