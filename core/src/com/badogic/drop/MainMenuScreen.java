package com.badogic.drop;

import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.Screen;
import com.badlogic.gdx.graphics.GL20;
import com.badlogic.gdx.graphics.OrthographicCamera;
import com.badlogic.gdx.graphics.Texture;
import com.badlogic.gdx.graphics.g2d.BitmapFont;
import com.badlogic.gdx.graphics.g2d.TextureAtlas;
import com.badlogic.gdx.graphics.g2d.TextureRegion;
import com.badlogic.gdx.scenes.scene2d.Stage;
import com.badlogic.gdx.scenes.scene2d.ui.Skin;
import com.badlogic.gdx.scenes.scene2d.ui.Table;
import com.badlogic.gdx.scenes.scene2d.ui.TextButton;
import com.badlogic.gdx.scenes.scene2d.ui.TextButton.TextButtonStyle;
import com.badlogic.gdx.scenes.scene2d.utils.TextureRegionDrawable;
import com.badlogic.gdx.utils.viewport.ScreenViewport;

public class MainMenuScreen implements Screen {

	final Drop game;

	OrthographicCamera camera;
	
	private Stage stage;
    private Texture myTexture;
    private TextureRegion upRegion;
    private TextureRegion downRegion;
    private TextureRegionDrawable myTexRegionDrawable;
   
    private Table table;

	public MainMenuScreen(final Drop game) {
		this.game = game;
		
		stage = new Stage(new ScreenViewport()); 
		
		table = new Table();
		table.setFillParent(true);
		stage.addActor(table);

		Skin skin = new Skin();
		BitmapFont font = new BitmapFont();
        TextButtonStyle style= new TextButtonStyle();
        style.font = font;
      
	
        upRegion = new TextureRegion(myTexture);
        downRegion = new TextureRegion(myTexture);
        //style.up = new style.getDrawable(upRegion);
        //style.down = new style.getDrawable(downRegion);
        
        
        //Erstelle die Buttons
        TextButton button1 = new TextButton("Start new game", style); 
        table.add(button1);
        stage.addActor(button1);
        
        TextButton button2 = new TextButton("Load game",style);
        table.add(button2);
        stage.addActor(button2);
        
        TextButton button3 = new TextButton("Save game", style);
        table.add(button3);
        stage.addActor(button3);
        
        TextButton button4 = new TextButton("Credits", style);
        table.add(button4);
        stage.addActor(button4);
        
        TextButton button5 = new TextButton("Quit", style);
        table.add(button5);
        stage.addActor(button5);
        
        stage.draw();

       

        
       
        


		
		
		

	}
	@Override
	public void render(float delta) {
		Gdx.gl.glClearColor(0, 0, 0.2f, 1);
		Gdx.gl.glClear(GL20.GL_COLOR_BUFFER_BIT);

		camera.update();
		game.batch.setProjectionMatrix(camera.combined);

		game.batch.begin();
		game.font.draw(game.batch, "Welcome to Drop!!! ", 100, 150);
		game.font.draw(game.batch, "Tap anywhere to begin!", 100, 100);
		game.batch.end();

		/*
		if (Gdx.input.isTouched()) {
			game.setScreen(new GameScreen(game));
			dispose();
		}
		*/
	}

	@Override
	public void resize(int width, int height) {
	}

	@Override
	public void show() {
	}

	@Override
	public void hide() {
	}

	@Override
	public void pause() {
	}

	@Override
	public void resume() {
	}

	@Override
	public void dispose() {

	}

}