package Summative;


import lejos.nxt.Motor;
import lejos.robotics.subsumption.Behavior;
/**
 * ForwardMotion.java
 * @author Matthew Seftel
 * June 16, 2017
 * The Robot moves forward until is suppressed
 */
public class ForwardMotion implements Behavior {
private boolean suppressed = false;
	@Override
	/**
	 * Takes control when the button is pressed
	 */
	public boolean takeControl()
{
		return true;
}
	@Override
	/**
	 * The robot drives forward at a speed of 340 until it is told further instructions
	 */
	public void action() {
		
		suppressed = false;
		Motor.A.setSpeed(240);
		Motor.B.setSpeed(240);
		Motor.A.forward();
		Motor.B.forward();
		while(!suppressed){
			Thread.yield();
		}
		Motor.A.stop();
		Motor.B.stop();
	}

	@Override
	/**
	 * The action is suppressed 
	 */
	public void suppress() {
		suppressed = true;
		
	}

}