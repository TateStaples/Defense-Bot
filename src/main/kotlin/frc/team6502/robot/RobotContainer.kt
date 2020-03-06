package frc.team6502.robot

import edu.wpi.first.wpilibj.Joystick
import frc.team6502.robot.subsystems.Drivetrain

/**
 * Initialize devices and subsystems here
 */
object RobotContainer {
    private val controller = Joystick(Constants.XBOX_PORT).apply {

    }

    val forward
        get() = controller.x

    val turn
        get() = controller.y

    init {
        // initialize subsystems here:
        Drivetrain

    }

}