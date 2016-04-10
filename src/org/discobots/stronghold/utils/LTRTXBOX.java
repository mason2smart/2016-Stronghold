package org.discobots.stronghold.utils;


import org.discobots.stronghold.Robot;
import org.discobots.stronghold.commands.arm.BrakeCommand;

import edu.wpi.first.wpilibj.command.Command;

/**
 *
 */
public class LTRTXBOX extends Command {
	
	double liftSpeed;
	

    public LTRTXBOX() {
        // Use requires() here to declare subsystem dependencies
        // eg. requires(chassis);
    	requires(Robot.armSub);
    	
    }

    // Called just before this Command runs the first time
    protected void initialize() {
    		
    }

    // Called repeatedly when this Command is scheduled to run
    protected void execute() {
    		double rightT = Robot.oi.getRT();
    		double leftT = Robot.oi.getLT();
    	   liftSpeed = leftT-rightT;//constantly updates every 20 miliseconds
    	  // if(Math.abs(liftSpeed)<.15)
    		//   liftSpeed=0;
    	   Robot.armSub.setSpeed(liftSpeed);
    	   
    	   /*if(Liftspeed<0)
    	   {
    		   if(Robot.armSub.potentiometer.getAverageVoltage()< Robot.armSub.upperArmLim)
    			   Robot.armSub.setSpeed(Liftspeed);
    	   } else{
    		   if(Robot.armSub.potentiometer.getAverageVoltage()> Robot.armSub.lowerArmLim)
    			   Robot.armSub.setSpeed(Liftspeed);
    	   }*/
    }

    // Make this return true when this Command no longer needs to run execute()
    protected boolean isFinished() {
        return false;
    }

    // Called once after isFinished returns true
    protected void end() {
    	liftSpeed=0;//always set speeds to zero in end
    }

    // Called when another command which requires one or more of the same
    // subsystems is scheduled to run
    protected void interrupted() {
    	end();
    }
}
