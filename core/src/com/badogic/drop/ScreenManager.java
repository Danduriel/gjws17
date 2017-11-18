package com.badogic.drop;


public class ScreenManager {
	   static Drop game = null;
	   static MainMenuScreen mainMenuScreen;
	   static GameMenuScreen gameScreen;

	   
	   private ScreenManager() {}
	   
	   //This is called by Game from inside the "create()" method.
	   public static void initialize(Drop game) {
	      ScreenManager.game = game;

	      ScreenManager.mainMenuScreen = new MainMenuScreen(game);
	      //ScreenManager.gameScreen = new GameMenuScreen(game);
	   }
	   
	   public static void setMainMenuScreen() {
	      game.setScreen(mainMenuScreen);
	   }
/*
	   public static void setGameScreen() {
	      game.setScreen(gameScreen);
	   }
*/
}
