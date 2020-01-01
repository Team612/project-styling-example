/*----------------------------------------------------------------------------*/
/* Copyright (c) 2017-2018 FIRST. All Rights Reserved.                        */
/* Open Source Software - may be modified and shared by FRC teams. The code   */
/* must be accompanied by the FIRST BSD license file in the root directory of */
/* the project.                                                               */
/*----------------------------------------------------------------------------*/

package frc.robot.commands.drivetrain;

import edu.wpi.first.wpilibj.command.Command;
import frc.robot.ControllerMap;
import frc.robot.OI;
import frc.robot.Robot;


public class DefaultDrive extends Command {

  public DefaultDrive() {
    requires(Robot.m_drivetrain);  // Remember this for all default commands!
  }

  // Called just before this Command runs the first time
  @Override
  protected void initialize() {
  }

  // Called repeatedly when this Command is scheduled to run
  @Override
  protected void execute() {
    // Note: by writing core functionality within the subsystem, it makes it easier to debug and greatly reduces the footprint of the command's code
    Robot.m_drivetrain.tankDrive(OI.driver.getRawAxis(ControllerMap.LEFT_Y_STICK), OI.driver.getRawAxis(ControllerMap.RIGHT_Y_STICK), 0.1);
  }

  // Make this return true when this Command no longer needs to run execute()
  @Override
  protected boolean isFinished() {
    return false;
  }

  // Called once after isFinished returns true
  @Override
  protected void end() {
  }

  // Called when another command which requires one or more of the same
  // subsystems is scheduled to run
  @Override
  protected void interrupted() {
  }
}
