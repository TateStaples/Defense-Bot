package frc.team6502.robot

import edu.wpi.first.wpilibj.Joystick
import frc.team6502.robot.subsystems.Drivetrain
import kotlin.math.abs

/**
 * Initialize devices and subsystems here
 */
object RobotContainer {
    private val controller = Joystick(Constants.JOYSTICK_PORT)

    val forward
        get() = improveJoystick(controller.x, Constants.FORWARD_RATE, Constants.FORWARD_EXPO, Constants.FORWARD_DEADBAND)

    val turn
        get() = improveJoystick(controller.y, Constants.TURN_RATE, Constants.TURN_EXPO, Constants.TURN_DEADBAND)

    init {
        // initialize subsystems here:
        Drivetrain

    }

    private fun improveJoystick(raw: Double, rate: Double, expo: Double, deadband: Double): Double {
        val superRate = 0.0

        val value: Double
        var command = raw
        // apply deadband
        command = when {
            command > deadband -> (1 / (1 - deadband)) * command - (deadband / (1 - deadband))
            command < -deadband -> (1 / (1 - deadband)) * command + (deadband / (1 - deadband))
            else -> 0.0
        }

        var retval = ((1 + 0.01 * expo * (command * command - 1.0)) * command)
        retval = (retval * (rate + (abs(retval) * rate * superRate * 0.01)))
        return retval
    }

}