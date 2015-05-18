package br.unb.saltar.robot.simulations;

import java.awt.Robot;

import br.unb.saltar.robot.commands.AbsoluteClickCommand;
import br.unb.saltar.robot.commands.OpenURICommand;
import br.unb.saltar.robot.commands.TypeCommand;

public class BrowserSimulator extends Simulator {

	public BrowserSimulator(Robot bot) {
		super(bot);
	}

	@Override
	protected void setRobotBehavior() {
		addCommand(new OpenURICommand("www.outlook.com"), 5000);
		addCommand(new TypeCommand("lades.fga@outlook.com\n"), 1000);
		addCommand(new TypeCommand("L@desFG@\n"), 4000);
		addCommand(new AbsoluteClickCommand(300, 100), 10000);
		addCommand(new TypeCommand("lades.fga@outlook.com\t"), 1000);
		addCommand(new TypeCommand("\tEmail novo de Lades!!"), 1000);
		addCommand(new TypeCommand("\tSegredo do Lades!"), 2000);
		addCommand(new AbsoluteClickCommand(300, 100), 2000);
	}

	@Override
	protected void setGoBackBehavior() {
		addCommand(new AbsoluteClickCommand(1250, 100), 2000);
		addCommand(new AbsoluteClickCommand(1250, 300), 10000);
		addCommand(new AbsoluteClickCommand(1360, 5), 2000);

	}

}
