package com.badogic.drop;

import com.badlogic.gdx.Game;
import com.badlogic.gdx.graphics.g2d.BitmapFont;
import com.badlogic.gdx.graphics.g2d.SpriteBatch;



public class Drop extends Game {
	public SpriteBatch batch;
	public BitmapFont font;
	public Gamesim gamesim = new Gamesim(0);
	
	
	
	@Override
	public void create() {
		batch = new SpriteBatch();
		//Use LibGDX's default Arial font.
		font = new BitmapFont();
		this.setScreen(new MainMenuScreen(this));
	}
	
	@Override
	//Update
	public void render() {
		/* if Button pressed do update*/
		
		gamesim.update();
		super.render(); //important!
	}
	
	@Override
	public void dispose() {
		batch.dispose();
		font.dispose();
	}
}
