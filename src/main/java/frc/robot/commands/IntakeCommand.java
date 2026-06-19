package frc.robot.commands;

import edu.wpi.first.wpilibj2.command.Command;
import edu.wpi.first.wpilibj2.command.InstantCommand;

// Command to pull fuel inside the robot
public Command intakeCommand() {
  return new InstantCommand(() -> intakeSubsystem.runIntake(0.8), intakeSubsystem);
}

// Command to eject fuel out of the intake
public Command ejectCommand() {
  return new InstantCommand(() -> intakeSubsystem.runIntake(-0.5), intakeSubsystem);
}

// Command to stop the intake
public Command stopCommand() {
  return new InstantCommand(() -> intakeSubsystem.stop(), intakeSubsystem);
}
