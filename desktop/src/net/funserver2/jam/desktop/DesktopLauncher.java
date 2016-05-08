package net.funserver2.jam.desktop;

import com.badlogic.gdx.backends.lwjgl.LwjglApplication;
import com.badlogic.gdx.backends.lwjgl.LwjglApplicationConfiguration;
import net.funserver2.jam.Funserver2Example;

public class DesktopLauncher
{
	public static void main(String[] arg)
	{
		LwjglApplicationConfiguration config = new LwjglApplicationConfiguration();

		config.title = "Fun server2";
		config.width = 1280;
		config.height = 720;

		new LwjglApplication(new Funserver2Example(), config);

	}
}
