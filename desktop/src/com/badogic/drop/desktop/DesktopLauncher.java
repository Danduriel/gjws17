package com.badogic.drop.desktop;

import com.badlogic.gdx.backends.lwjgl.LwjglApplication;
import com.badlogic.gdx.backends.lwjgl.LwjglApplicationConfiguration;
import com.badogic.drop.Drop;

public class DesktopLauncher {
	public static void main (String[] arg) {
	      LwjglApplicationConfiguration config = new LwjglApplicationConfiguration();
	      config.title = "Monkeys Building some temple [MBST]";
	      config.width = 1280;
	      config.height = 800;
	      config.foregroundFPS = 60;
	      new LwjglApplication(new Drop(), config);
	   }
}
