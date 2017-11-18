package com.badogic.drop;

import com.badlogic.gdx.Game;
import com.badlogic.gdx.graphics.g2d.BitmapFont;
import com.badlogic.gdx.graphics.g2d.SpriteBatch;



public class Drop extends Game {
	public Drop drop;
	public SpriteBatch batch;
	public BitmapFont font;
	public Gamesim gamesim = new Gamesim(0);
	public MainMenuScreen mainMenuScreen;
	
	
	
	@Override
	public void create() {
		batch = new SpriteBatch();
		//Use LibGDX's default Arial font.
		font = new BitmapFont();
		
		//Neuer Code
		mainMenuScreen = new MainMenuScreen(this);
		this.setScreen(mainMenuScreen);

		/* Funktionierender Code
		this.setScreen(new MainMenuScreen(this)); */
	}
	
	@Override
	//Update
	public void render() {
		/* if Button pressed do update*/
		if (mainMenuScreen.click == true) {
			gamesim.update();
			mainMenuScreen.click = false;
		}
		
		super.render(); //important!
	}
	
	@Override
	public void dispose() {
		batch.dispose();
		font.dispose();
	}
}
