package br.unb.saltar.robot;

import java.awt.AWTException;
import java.awt.Robot;

public class ScreenRobot {

	public static void main(String[] args) {
		Robot bot;
		try {
			bot = new Robot();
			new Thread(new BrowserSimulator(bot)).run();
		} catch (AWTException e) {
			e.printStackTrace();
		}
				
	}

}
