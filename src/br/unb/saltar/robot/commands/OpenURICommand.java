package br.unb.saltar.robot.commands;

import java.awt.Desktop;
import java.awt.Robot;
import java.io.IOException;
import java.net.URI;
import java.net.URISyntaxException;

public class OpenURICommand implements Command {

	String uri;
	
	public OpenURICommand(String uri){
		this.uri=uri;
	}
	
	@Override
	public void execute(Robot bot) {
		if (Desktop.isDesktopSupported()) {
			try {
				Desktop.getDesktop().browse(new URI(uri));
			} catch (IOException e) {
				e.printStackTrace();
			} catch (URISyntaxException e) {
				e.printStackTrace();
			}
		}
	}

}
