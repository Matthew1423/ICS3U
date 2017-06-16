package Summative;
import lejos.nxt.Button;
import lejos.robotics.subsumption.Arbitrator;
import lejos.robotics.subsumption.Behavior;
/**
 * TheArbitrator.java
 * @author Matthew Seftel
 * June 16,2017
 * Runs the whole task
 */
public class TheArbitrator {
	public static void main(String[] args){
	Behavior b1 = new ForwardMotion();
	Behavior b2 = new ExitButton();
	Behavior b3 = new Light();
	Behavior b4 = new Sound();
	
	
	Behavior [] behaviors = {b1,b4,b3,b2};
	
	Arbitrator arb = new Arbitrator(behaviors);
	Button.waitForAnyPress();
	arb.start();
	
	
	
	
}
}
