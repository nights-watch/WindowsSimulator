package br.unb.saltar.robot;

import java.awt.Robot;

public abstract class RobotRunnable implements Runnable {

	protected Robot bot;

	public RobotRunnable(Robot bot) {
		this.bot = bot;
	}

	@Override
	public void run() {
		RobotRunnable.this.command(bot);
	}

	protected abstract void command(Robot bot);

}
