package br.unb.saltar.robot.simulations;

//import java.awt.Dimension;
import java.awt.Robot;
//import java.awt.Toolkit;

import br.unb.saltar.robot.RobotRunnable;
import br.unb.saltar.robot.commands.AbsoluteClickCommand;
import br.unb.saltar.robot.commands.OpenURICommand;
import br.unb.saltar.robot.commands.TypeCommand;

public class BrowserSimulator extends Simulator{

	public BrowserSimulator(Robot bot) {
		super(bot);
	}

//	private double width;
//	private double height;

	@Override
	public RobotRunnable getRunnable(Robot bot) {
//		Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
//		this.width = screenSize.getWidth();
//		this.height = screenSize.getHeight();

		RobotRunnable robot = new RobotRunnable(bot);
		robot.addCommand(new OpenURICommand("www.fga.unb.br"), 15000);
		robot.addCommand(new TypeCommand("aids\n"), 1000);
		robot.addCommand(new AbsoluteClickCommand(1006, 161), 500);
		robot.addCommand(new TypeCommand("software\n"), 1000);
		robot.addCommand(new AbsoluteClickCommand(271, 358), 500);
		
		return robot;
	}

}
