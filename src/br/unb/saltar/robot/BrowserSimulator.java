package br.unb.saltar.robot;

import java.awt.Desktop;
import java.awt.Dimension;
import java.awt.Robot;
import java.awt.Toolkit;
import java.awt.event.InputEvent;
import java.io.IOException;
import java.net.URI;
import java.net.URISyntaxException;

import br.unb.saltar.robot.utils.Utils;

public class BrowserSimulator extends RobotRunnable {

	public BrowserSimulator(Robot bot) {
		super(bot);
	}

	private double width;
	private double height;

	@Override
	public void command(Robot bot) {
		Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
		this.width = screenSize.getWidth();
		this.height = screenSize.getHeight();

		openBrowser();
		try {
			Thread.sleep(5000);
			Utils.type(bot, "aids\n");
			Thread.sleep(1000);
			bot.mouseMove(1006, 161);
			Thread.sleep(1000);
			bot.mousePress(InputEvent.BUTTON1_MASK);
			Thread.sleep(500);
			bot.mouseRelease(InputEvent.BUTTON1_MASK);
			Utils.type(bot, "software\n");
			Thread.sleep(3000);
			bot.mouseMove(271, 358);
			Thread.sleep(1000);
			bot.mousePress(InputEvent.BUTTON1_MASK);
			Thread.sleep(500);
			bot.mouseRelease(InputEvent.BUTTON1_MASK);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}

	}

	private void openBrowser() {
		if (Desktop.isDesktopSupported()) {
			try {
				Desktop.getDesktop().browse(new URI("www.fga.unb.br"));

			} catch (IOException e) {
				e.printStackTrace();
			} catch (URISyntaxException e) {
				e.printStackTrace();
			}
		}
	}

}
