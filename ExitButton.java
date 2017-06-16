package Summative;
import lejos.nxt.Button;
import lejos.robotics.subsumption.Behavior;
/**
 * ExitButton.java
 * @author Matthew Seftel
 * June 16,2017
 * The program ends when the button is pressed
 */
public class ExitButton implements Behavior{


	@Override
	/**
	 * Takes controls when the escape button is down
	 */
	public boolean takeControl() {
		if(Button.ESCAPE.isDown()){
			return true;
		}
		return false;
	}

	@Override
	/**
	 * The program ends
	 */
	public void action() {
		 System.exit(0);
		
	}

	@Override
	
	public void suppress() {
		
		
	}

}
