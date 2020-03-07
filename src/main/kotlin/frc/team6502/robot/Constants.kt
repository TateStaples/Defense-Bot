package frc.team6502.robot

import kotlin.math.PI

/**
 * Define any constants in this file.
 */
object Constants {
    const val FRONT_LEFT_PORT = 0
    const val BACK_LEFT_PORT = 1
    const val FRONT_RIGHT_PORT = 2
    const val BACK_RIGHT_PORT = 3

    const val JOYSTICK_PORT = 0

    const val FORWARD_DEADBAND = 0.2
    const val FORWARD_RATE = -12.0
    const val FORWARD_EXPO = 20.0

    const val TURN_DEADBAND = 0.1
    const val TURN_RATE =  -5 * PI
    const val TURN_EXPO = 73.0

}