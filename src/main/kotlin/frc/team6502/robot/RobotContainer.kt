package frc.team6502.robot

import edu.wpi.first.wpilibj.Joystick
import frc.team6502.robot.subsystems.Drivetrain

/**
 * Initialize devices and subsystems here
 */
object RobotContainer {
    private val controller = Joystick(Constants.JOYSTICK_PORT)

    val forward
        get() = -controller.y

    val turn
        get() = controller.x

    init {
        // initialize subsystems here:
        Drivetrain

    }

}