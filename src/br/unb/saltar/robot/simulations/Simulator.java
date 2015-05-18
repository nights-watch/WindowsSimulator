package br.unb.saltar.robot.simulations;

import java.awt.Robot;

import br.unb.saltar.robot.RobotRunnable;
import br.unb.saltar.robot.commands.Command;

public abstract class Simulator{

	private Robot bot;
	private RobotRunnable robot = new RobotRunnable(bot);

	public Simulator(Robot bot) {
		this.bot = bot;
		robot = new RobotRunnable(bot);
	}
	
	public Thread simulate() {
		setRobotBehavior();
		setGoBackBehavior();
		Thread thread = new Thread(robot);
		thread.run();
		return thread;
	}
	
	protected abstract void setRobotBehavior();
	protected abstract void setGoBackBehavior();
	
	protected void addCommand(Command command, long delay) {
		robot.addCommand(command, delay);
	}
}
