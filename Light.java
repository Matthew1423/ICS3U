package Summative;
import lejos.nxt.Motor;
import lejos.robotics.subsumption.Behavior;
import lejos.nxt.LightSensor;
import lejos.nxt.SensorPort;
/**
 * Light.java
 * @author Matthew Seftel
 * June 16,2017
 * The robot stops at the black line
 */
	public class Light implements Behavior {
	LightSensor light = new LightSensor(SensorPort.S2);
	private boolean suppressed = false;
		@Override
		/**
		 * The robot takes control when the light sensor senses darkness
		 */
		public boolean takeControl() {
			light.getLightValue();
			if (light.getLightValue() <= 38){
		return true;
			
		}
			return false;
		}

		@Override
		/**
		 * The robot stops
		 */
		public void action() {
			suppressed = false;	
			Motor.A.stop();
			Motor.B.stop();
			while(!suppressed){
				Thread.yield();
			}
		
		}
		

		@Override
		/**
		 * The action is suppressed
		 */
		public void suppress() {
			suppressed = true;
			
		}

	}