package frc.team6502.robot.commands

import edu.wpi.first.wpilibj2.command.CommandBase
import frc.team6502.robot.RobotContainer
import frc.team6502.robot.subsystems.Drivetrain

class DefaultDrive : CommandBase() {
    init {
        addRequirements(Drivetrain)
    }

    override fun execute() {
        Drivetrain.drive.arcadeDrive(RobotContainer.forward, RobotContainer.turn)
    }
}