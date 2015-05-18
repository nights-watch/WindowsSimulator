package br.unb.saltar.robot.simulations;

import java.awt.Robot;

import br.unb.saltar.robot.commands.AbsoluteClickCommand;
import br.unb.saltar.robot.commands.OpenURICommand;
import br.unb.saltar.robot.commands.TypeCommand;

public class FlashSimulator extends Simulator {

	public FlashSimulator(Robot bot) {
		super(bot);
	}

	@Override
	protected void setRobotBehavior() {
		addCommand(
				new OpenURICommand(
						"http://jogosonline.uol.com.br/scooter-man-hd_61681.html#rmcl"),
				10000);
		addMultipleCommands(new TypeCommand("down", TypeCommand.FULL_STRING),
				1000, 12);
		addMultipleCommands(new AbsoluteClickCommand(512, 500), 1000, 4);
		addMultipleCommands(new TypeCommand(" "), 500, 10);
	}

	@Override
	protected void setGoBackBehavior() {
		addCommand(new AbsoluteClickCommand(1000, 5), 100);
	}

}
