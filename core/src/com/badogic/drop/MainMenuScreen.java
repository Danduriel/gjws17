package com.badogic.drop;

import com.badlogic.gdx.Gdx;

import com.badlogic.gdx.Screen;
import com.badlogic.gdx.graphics.Color;
import com.badlogic.gdx.graphics.GL20;
import com.badlogic.gdx.graphics.Pixmap;
import com.badlogic.gdx.graphics.Texture;
import com.badlogic.gdx.graphics.g2d.BitmapFont;
import com.badlogic.gdx.graphics.g2d.SpriteBatch;
import com.badlogic.gdx.scenes.scene2d.Stage;
import com.badlogic.gdx.scenes.scene2d.InputEvent;
import com.badlogic.gdx.scenes.scene2d.ui.Skin;
import com.badlogic.gdx.scenes.scene2d.ui.TextButton;
import com.badlogic.gdx.scenes.scene2d.utils.ClickListener;

public class MainMenuScreen implements Screen {

	final Drop game;
    private SpriteBatch batch;
    private Skin skin;
    Stage stage;
    public boolean click = false;
    
	public MainMenuScreen(final Drop game) {
		this.game = game;  
		
		stage = new Stage();
	    Gdx.input.setInputProcessor(stage);// Make the stage consume events

	    createBasicSkin();
	    
	    TextButton newGameButton = new TextButton("Neues Spiel", skin); // Use the initialized skin
	    newGameButton.setPosition(Gdx.graphics.getWidth()/2 - Gdx.graphics.getWidth()/8 , Gdx.graphics.getHeight()/2);
	    stage.addActor(newGameButton);
	    newGameButton.addListener(new ClickListener() {
	    	@Override
	    	public void clicked (InputEvent event, float x, float y) {
	    		System.out.println("CLICK NEW GAME!");
	    		game.gamesim.setNextAction("beer");
	    		//ScreenManager.setGameScreen();
	    		//click = true;
	    	}
	    });
	    
	    
	    TextButton creditsButton = new TextButton("Credits", skin); // Use the initialized skin
	    creditsButton.setPosition(Gdx.graphics.getWidth()/2 - Gdx.graphics.getWidth()/8 , Gdx.graphics.getHeight()/4);
	    stage.addActor(creditsButton);
	    creditsButton.addListener(new ClickListener() {
	    	@Override
	    	public void clicked (InputEvent event, float x, float y) {
	    		System.out.println("CLICK CREDITS!");
	    		click = true;
	    	}
	    });
	    
	    
	    TextButton exitButton = new TextButton("Beenden", skin); // Use the initialized skin
	    exitButton.setPosition(Gdx.graphics.getWidth()/2 - Gdx.graphics.getWidth()/8 , Gdx.graphics.getHeight()/8);
	    stage.addActor(exitButton);
	    exitButton.addListener(new ClickListener() {
	    	@Override
	    	public void clicked (InputEvent event, float x, float y) {
	    		System.out.println("CLICK EXIT GAME!");
	    		click = true;
	    	}
	    });
             
	}
	
	public void createBasicSkin() {
		//Create a font
		BitmapFont font = new BitmapFont();
		skin = new Skin();
		skin.add("default", font);
		 
		//Create a texture
		Pixmap pixmap = new Pixmap((int)Gdx.graphics.getWidth()/4,(int)Gdx.graphics.getHeight()/10, Pixmap.Format.RGB888);
		pixmap.setColor(Color.WHITE);
		pixmap.fill();
		skin.add("background",new Texture(pixmap));
		
		//Create a button style
		TextButton.TextButtonStyle textButtonStyle = new TextButton.TextButtonStyle();
		textButtonStyle.up = skin.newDrawable("background", Color.GRAY);
		textButtonStyle.down = skin.newDrawable("background", Color.DARK_GRAY);
		textButtonStyle.checked = skin.newDrawable("background", Color.DARK_GRAY);
		textButtonStyle.over = skin.newDrawable("background", Color.LIGHT_GRAY);
		textButtonStyle.font = skin.getFont("default");
		skin.add("default", textButtonStyle);
	}
	
	public void render(float delta) {
        Gdx.gl.glClearColor(1, 1, 1, 1);
        Gdx.gl.glClear(GL20.GL_COLOR_BUFFER_BIT);
 
        stage.act();
        stage.draw();
    }
    
	
    @Override
    public void dispose() {
        batch.dispose();
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





}