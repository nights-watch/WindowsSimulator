package br.unb.saltar.robot;

import java.awt.AWTException;
import java.awt.Robot;

import br.unb.saltar.robot.simulations.BrowserSimulator;
import br.unb.saltar.robot.simulations.FlashSimulator;

public class ScreenRobot {

	public static void main(String[] args) {
		Robot bot;
		try {
			Thread.sleep(30000);
			bot = new Robot();
			new BrowserSimulator(bot).simulate().join();
			new  FlashSimulator(bot).simulate().join();
		} catch (AWTException e) {
			// TODO handle robot exception
			e.printStackTrace();
		} catch (InterruptedException e) {
			// TODO handle interruptedException
			e.printStackTrace();
		}
	}

}
