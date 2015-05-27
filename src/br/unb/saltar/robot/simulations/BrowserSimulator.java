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
		addCommand(new OpenURICommand("http://192.168.40.14"), 10000);
		addCommand(new AbsoluteClickCommand(700, 320), 3000);
		addCommand(new TypeCommand("lades\t"), 3000);
		addCommand(new TypeCommand("senhadolades\n"), 10000);
		addCommand(new AbsoluteClickCommand(100, 215), 6000);
		addCommand(new AbsoluteClickCommand(660, 150), 6000);
		addCommand(new AbsoluteClickCommand(660, 210), 6000);
		addCommand(new TypeCommand("lades@crow\t\t\t"), 3000);
		addCommand(new TypeCommand("assunto do email\t\t"), 3000);
		addCommand(new TypeCommand("conteudo secreto do email. Nao leia sob nenhuma circunstancia!\t\t"), 3000);
		//addCommand(new AbsoluteClickCommand(660, 210), 10000);
		addCommand(new AbsoluteClickCommand(470, 150), 10000);

	}

	@Override
	protected void setGoBackBehavior() {
		addCommand(new AbsoluteClickCommand(1000, 5), 1000);
	}

}
