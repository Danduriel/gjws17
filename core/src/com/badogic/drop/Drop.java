package com.badogic.drop;

import com.badlogic.gdx.Game;
import com.badlogic.gdx.graphics.g2d.BitmapFont;
import com.badlogic.gdx.graphics.g2d.SpriteBatch;



public class Drop extends Game {
	
	public SpriteBatch batch;
	public BitmapFont font;
	public Gamesim gamesim = new Gamesim(0);
	
	
	public MainMenuScreen mainMenuScreen;	
	public GameMenuScreen gameMenuScreen;
	
	
	
	@Override
	public void create() {
		batch = new SpriteBatch();
		//Use LibGDX's default Arial font.
		font = new BitmapFont();
		

		
		//mainMenuScreen = new MainMenuScreen(this);
		//this.setScreen(mainMenuScreen);
		
		gameMenuScreen = new GameMenuScreen(this);
		this.setScreen(new GameMenuScreen(this));
		
		//this.setScreen(new TestScreen(this));

	}
	
	@Override
	//Update
	public void render() {
		/* if Button pressed do update*/
		
		if (mainMenuScreen.click == true) {
			gamesim.update();
			mainMenuScreen.click = false;
		}
		/*
		if (gameMenuScreen.click == true) {
			gamesim.update();
			gameMenuScreen.click = false;
		}*/
		
		super.render(); //important!
	}
	
	@Override
	public void dispose() {
		batch.dispose();
		font.dispose();
	}
}
