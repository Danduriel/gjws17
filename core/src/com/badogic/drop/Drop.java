package com.badogic.drop;

import com.badlogic.gdx.ApplicationAdapter;
import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.graphics.GL20;
import com.badlogic.gdx.graphics.Texture;
import com.badlogic.gdx.graphics.g2d.SpriteBatch;
import com.badogic.drop.Game;


/*Gamestates:
 * 0 Splashscreen / Loader
 * 1 Hauptmenue
 * 2 Credits
 * 3 Hauptspiel
 * 4
 * 5
 * 6
 * 
 */


public class Drop extends ApplicationAdapter {
	SpriteBatch batch;
	Texture img;
	Game game;
	int gamestate;
	
	
	@Override
	public void create () {
		batch = new SpriteBatch();
		img = new Texture("badlogic.jpg");
		game = new Game(400.0,5000,0,0);
		//Testkommentar f�r Git
		//Test 2 von Linux 
		//Test Christina2
		//Test Kevin
	}

	@Override
	public void render () {
		Gdx.gl.glClearColor(1, 0, 0, 1);
		Gdx.gl.glClear(GL20.GL_COLOR_BUFFER_BIT);
		batch.begin();
		batch.draw(img, 0, 0);
		batch.end();
	}
	
	@Override
	public void dispose () {
		batch.dispose();
		img.dispose();
	}
}
