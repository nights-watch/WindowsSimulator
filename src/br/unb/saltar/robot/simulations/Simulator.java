package br.unb.saltar.robot.simulations;

import java.awt.Robot;

import br.unb.saltar.robot.RobotRunnable;

public abstract class Simulator {

	protected Robot bot;

	public Simulator(Robot bot) {
		this.bot = bot;
	}

	protected abstract RobotRunnable getRunnable(Robot bot);
	
	public Thread simulate() {
		Thread thread = new Thread(getRunnable(bot));
		thread.run();
		return thread;
	}

}
