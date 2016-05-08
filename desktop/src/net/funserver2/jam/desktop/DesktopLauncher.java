package net.funserver2.jam.desktop;

import com.badlogic.gdx.backends.lwjgl.LwjglApplication;
import com.badlogic.gdx.backends.lwjgl.LwjglApplicationConfiguration;
import net.funserver2.jam.Funserver2Example;

import java.awt.*;

public class DesktopLauncher
{
	public static void main(String[] arg)
	{
		Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();

		LwjglApplicationConfiguration config = new LwjglApplicationConfiguration();

		config.fullscreen = false;
		config.width = screenSize.width * 7 / 8;
		config.height = config.width * 9 / 16;

		new LwjglApplication(new Funserver2Example(), config);
	}
}
