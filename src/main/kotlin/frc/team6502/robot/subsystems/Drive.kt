package frc.team6502.robot.subsystems

import edu.wpi.first.wpilibj.Spark
import edu.wpi.first.wpilibj.SpeedControllerGroup
import frc.team6502.robot.Constants
import edu.wpi.first.wpilibj.drive.DifferentialDrive
import edu.wpi.first.wpilibj2.command.SubsystemBase
import frc.team6502.robot.commands.DefaultDrive

object Drivetrain : SubsystemBase() {

    val frontLeft = Spark(Constants.FRONT_LEFT_PORT)
    val frontRight = Spark(Constants.FRONT_RIGHT_PORT)
    val backLeft = Spark(Constants.BACK_LEFT_PORT)
    val backRight = Spark(Constants.BACK_RIGHT_PORT)

    val leftSide = SpeedControllerGroup(frontLeft, backLeft)
    val rightSide = SpeedControllerGroup(frontRight, backRight)

    val drive = DifferentialDrive(leftSide, rightSide)

    init {
        defaultCommand = DefaultDrive()
    }


}