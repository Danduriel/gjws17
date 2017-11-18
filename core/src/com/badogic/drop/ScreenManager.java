package com.badogic.drop;

import com.badlogic.gdx.Gdx;

public class ScreenManager {
	   static Drop game = null;
	   static MainMenuScreen mainMenuScreen;
	   static GameMenuScreen gameScreen;
	   static Testscreen testScreen;

	   
	   private ScreenManager() {}
	   
	   //This is called by Game from inside the "create()" method.
	   public static void initialize(Drop game) {
	      ScreenManager.game = game;

	      //ScreenManager.mainMenuScreen = new MainMenuScreen(game);
	      //ScreenManager.gameScreen = new GameMenuScreen(game);
	      ScreenManager.testScreen = new Testscreen(game);
	   }
	   
	   public static void setMainMenuScreen() {
	      game.setScreen(testScreen);
	   }
/*
	   public static void setGameScreen() {
	      game.setScreen(gameScreen);
	   }
*/
}
