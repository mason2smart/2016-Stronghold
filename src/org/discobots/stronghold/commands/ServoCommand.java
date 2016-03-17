package org.discobots.stronghold.commands;


import org.discobots.stronghold.Robot;
import edu.wpi.first.wpilibj.command.Command;
import edu.wpi.first.wpilibj.smartdashboard.SmartDashboard;

/**
 *
 */
public class ServoCommand extends Command {
	
	public int waitTime;
	public int endTime;
	public boolean pastTime;
	

    public ServoCommand() {
        // Use requires() here to declare subsystem dependencies
    	
    	requires(Robot.servoSub);
    //	pastTime = false;

        // eg. requires(chassis);
    }

    // Called just before this Command runs the first time
    protected void initialize() {
 //   waitTime = 1000;
//    endTime = (int)System.currentTimeMillis() + waitTime;
    
    	Robot.servoSub.run();
    	
    	
    
    	
    	
    }

    // Called repeatedly when this Command is scheduled to run
    protected void execute() { 
//    	if(endTime <= (int)System.currentTimeMillis())
//    		pastTime = true;
//   	if(!pastTime)
 //   	{
  //  		Robot.linearPunchSub.pull(1.0, false);
    //	} 
   // 	else
   // 	{Robot.linearPunchSub.pull(1.0, isFinished());}
   	
    }

    // Make this return true when this Command no longer needs to run execute()
    protected boolean isFinished() {
  //  	if(Robot.linearPunchSub.isReady())
  //  		this.end();
   return true; 	
       //return Robot.linearPunchSub.isReady();
    }

    // Called once after isFinished returns true
    protected void end() {
    	Robot.servoSub.run();
    }

    // Called when another command which requires one or more of the same
    // subsystems is scheduled to run
    protected void interrupted() {
    	this.end();
    }
}