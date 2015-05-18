package br.unb.saltar.robot.commands;

import java.awt.Robot;
import java.awt.event.InputEvent;

public class AbsoluteClickCommand implements Command {

	int x, y;

	public AbsoluteClickCommand(int x, int y) {
		this.x = x;
		this.y = y;
	}

	@Override
	public void execute(Robot bot) {
		try {
			bot.mouseMove(x, y);
			Thread.sleep(1000);
			bot.mousePress(InputEvent.BUTTON1_MASK);
			Thread.sleep(200);
			bot.mouseRelease(InputEvent.BUTTON1_MASK);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}
}
