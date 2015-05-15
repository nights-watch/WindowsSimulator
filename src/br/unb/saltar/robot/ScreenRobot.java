package br.unb.saltar.robot;

import java.awt.AWTException;
import java.awt.Robot;

import br.unb.saltar.robot.simulations.BrowserSimulator;

public class ScreenRobot {

	public static void main(String[] args) {
		Robot bot;
		try {
			bot = new Robot();
			Thread browserSimulator = new BrowserSimulator(bot).simulate();
			browserSimulator.join();
			
		} catch (AWTException e) {
			e.printStackTrace();
		} catch (InterruptedException e) {
			// cant join
			e.printStackTrace();
		}
	}

}
