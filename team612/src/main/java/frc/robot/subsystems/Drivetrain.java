/*----------------------------------------------------------------------------*/
/* Copyright (c) 2017-2018 FIRST. All Rights Reserved.                        */
/* Open Source Software - may be modified and shared by FRC teams. The code   */
/* must be accompanied by the FIRST BSD license file in the root directory of */
/* the project.                                                               */
/*----------------------------------------------------------------------------*/

package frc.robot.subsystems;

import com.ctre.phoenix.motorcontrol.ControlMode;
import com.ctre.phoenix.motorcontrol.NeutralMode;
import com.ctre.phoenix.motorcontrol.can.TalonSRX;

import edu.wpi.first.wpilibj.command.Subsystem;
import frc.robot.RobotMap;
import frc.robot.commands.drivetrain.DefaultDrive;


public class Drivetrain extends Subsystem {
  

  // Note: when creating motors make it public follow this format {name of sensor}_{location}_{subsystem}
  private TalonSRX talon_fr_drive = new TalonSRX(RobotMap.TALON_FR_DRIVE_PORT);
  private TalonSRX talon_fl_drive = new TalonSRX(RobotMap.TALON_FL_DRIVE_PORT);
  private TalonSRX talon_br_drive = new TalonSRX(RobotMap.TALON_BR_DRIVE_PORT);
  private TalonSRX talon_bl_drive = new TalonSRX(RobotMap.TALON_BL_DRIVE_PORT);


  private void setBrakeMode(NeutralMode neutralMode) {
    talon_fr_drive.setNeutralMode(neutralMode);
    talon_fl_drive.setNeutralMode(neutralMode);
    talon_br_drive.setNeutralMode(neutralMode);
    talon_bl_drive.setNeutralMode(neutralMode);
  }


  public void tankDrive(double left_joy, double right_joy, double deadzone) {
      // Filter out controller deadzones
      left_joy = left_joy < deadzone ? 0.0 : left_joy;
      right_joy = right_joy < deadzone ? 0.0 : right_joy;

      // Left side drive motors
      talon_fr_drive.set(ControlMode.PercentOutput, right_joy);
      talon_br_drive.set(ControlMode.PercentOutput, right_joy);
      // Right side drive motors
      talon_fl_drive.set(ControlMode.PercentOutput, left_joy);
      talon_bl_drive.set(ControlMode.PercentOutput, left_joy);
  }


  @Override
  public void initDefaultCommand() {
    // Only create default commands for commands you want to run when the robot boots up.
    setBrakeMode(NeutralMode.Brake);
    setDefaultCommand(new DefaultDrive());
  }

  
}
