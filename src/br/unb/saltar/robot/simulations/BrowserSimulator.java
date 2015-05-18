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
		addCommand(new OpenURICommand("www.outlook.com"), 15000);
		addCommand(new TypeCommand("lades.fga@outlook.com\n"), 3000);
		addCommand(new TypeCommand("L@desFG@\n"), 15000);
		addCommand(new AbsoluteClickCommand(300, 100), 15000);
		addCommand(new TypeCommand("lades.fga@outlook.com\t"), 3000);
		addCommand(new TypeCommand("\tEmail novo de Lades!!"), 3000);
		addCommand(new TypeCommand("\tSegredo do Lades!"), 3000);
		addCommand(new AbsoluteClickCommand(300, 100), 10000);
	}

	@Override
	protected void setGoBackBehavior() {
		addCommand(new AbsoluteClickCommand(950, 100), 3000);
		addCommand(new AbsoluteClickCommand(950, 300), 15000);
		addCommand(new AbsoluteClickCommand(1000, 5), 100);

	}

}
