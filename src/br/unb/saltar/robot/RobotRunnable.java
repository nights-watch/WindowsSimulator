package br.unb.saltar.robot;

import java.awt.Robot;
import java.util.ArrayList;

import br.unb.saltar.robot.commands.Command;

public class RobotRunnable implements Runnable {

	private ArrayList<Pair<Command, Long>> commands = new ArrayList<Pair<Command, Long>>();

	protected Robot bot;

	public RobotRunnable(Robot bot) {
		this.bot = bot;
	}

	@Override
	public void run() {
		for (Pair<Command, Long> pair : commands) {
			try {
				pair.getFirst().execute(bot);
				Thread.sleep(pair.getSecond());
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
	}

	public void addCommand(Command command, long delay) {
		commands.add(new Pair<Command, Long>(command, delay));
	}

	public void removeCommandPair(Pair<Command, Long> pair) {
		commands.remove(pair);
	}

	public void removeCommand(Command command){
		Pair<Command, Long> toDelete=null;
		for (Pair<Command, Long> pair2 : commands) {
			if(command.equals(pair2.getFirst())){
				toDelete=pair2;
				break;
			}
		}
		commands.remove(toDelete);
	}

	public ArrayList<Pair<Command, Long>> getCommands() {
		return commands;
	}

}
