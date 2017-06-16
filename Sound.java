package Summative;

import lejos.nxt.Motor;
import lejos.nxt.SoundSensor;
import lejos.nxt.SensorPort;
import lejos.robotics.subsumption.Behavior;
/**
 * Sound.java
 * @author Matthew Seftel
 *June 16, 2017
 *The Robot shoots a ball at the sound of my voice
 */
public class Sound implements Behavior {
	 SoundSensor sound = new SoundSensor(SensorPort.S3);
	private boolean suppressed = false;
		@Override
		/**
		 * The robot takes control when the sensor senses a loud sound
		 */
		public boolean takeControl() {
			sound.readValue();
			if (sound.readValue() >30){
		return true;
			
		}
			return false;
		}

		@Override
		/**
		 * The robot shoots the ball at a speed of 720 
		 * If suppressed the motor stops
		 */
		public void action() {
			suppressed = false;
			
			Motor.C.setSpeed(720);
			Motor.C.backward();
			
		
		while(!suppressed){
			Thread.yield();
		}
		Motor.A.stop();
	}

		@Override
		/**
		 * The action is suppressed
		 */
		public void suppress() {
			suppressed = true;
			
		}

	}


