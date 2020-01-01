/*----------------------------------------------------------------------------*/
/* Copyright (c) 2017-2018 FIRST. All Rights Reserved.                        */
/* Open Source Software - may be modified and shared by FRC teams. The code   */
/* must be accompanied by the FIRST BSD license file in the root directory of */
/* the project.                                                               */
/*----------------------------------------------------------------------------*/

package frc.robot;

/**
 * The RobotMap is a mapping from the ports sensors and actuators are wired into
 * to a variable name. This provides flexibility changing wiring, makes checking
 * the wiring easier and significantly reduces the number of magic numbers
 * floating around.
 */
public class RobotMap {
  
  // Drivetrain ports
  public static final int TALON_FR_DRIVE_PORT = 1;
  public static final int TALON_FL_DRIVE_PORT = 2;
  public static final int TALON_BR_DRIVE_PORT = 3;
  public static final int TALON_BL_DRIVE_PORT = 4;

  // Hatch ports
  public static final int SERVO_HATCH_PORT = 1;
  public static final int TALON_HATCH_PORT = 2;


}
