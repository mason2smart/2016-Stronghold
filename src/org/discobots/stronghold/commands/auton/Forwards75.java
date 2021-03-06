package org.discobots.stronghold.commands.auton;

import org.discobots.stronghold.commands.auton.subcommands.AutonomousArcadeDrive;
import org.discobots.stronghold.commands.auton.subcommands.AutonomousConstantIntake;
import org.discobots.stronghold.commands.auton.subcommands.AutonomousSetIntake;
import org.discobots.stronghold.commands.auton.subcommands.AutonomousTankDrive;
import org.discobots.stronghold.commands.auton.subcommands.WaitCommand;

import edu.wpi.first.wpilibj.command.CommandGroup;

/**
 *
 */
public class Forwards75 extends CommandGroup {
    
    public  Forwards75() {
    		addParallel(new AutonomousConstantIntake(-1,1000));
    		addSequential(new AutonomousArcadeDrive(0.75,0,5000));
    		//addSequential(new WaitCommand(500));
    		//addSequential(new AutonomousSetIntake(-1,500));
    		
    		
    	// Add Commands here:
        // e.g. addSequential(new Command1());
        //      addSequential(new Command2());
        // these will run in order.

        // To run multiple commands at the same time,
        // use addParallel()
        // e.g. addParallel(new Command1());
        //      addSequential(new Command2());
        // Command1 and Command2 will run in parallel.

        // A command group will require all of the subsystems that each member
        // would require.
        // e.g. if Command1 requires chassis, and Command2 requires arm,
        // a CommandGroup containing them would require both the chassis and the
        // arm.
    }
}
