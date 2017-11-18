package com.badogic.drop;

import com.badlogic.gdx.Gdx;


import com.badlogic.gdx.Screen;
import com.badlogic.gdx.graphics.Color;
import com.badlogic.gdx.graphics.GL20;
import com.badlogic.gdx.graphics.Pixmap;
import com.badlogic.gdx.graphics.Texture;
import com.badlogic.gdx.graphics.g2d.BitmapFont;
import com.badlogic.gdx.graphics.g2d.SpriteBatch;
import com.badlogic.gdx.graphics.g2d.TextureAtlas;
import com.badlogic.gdx.scenes.scene2d.Stage;
import com.badlogic.gdx.scenes.scene2d.InputEvent;
import com.badlogic.gdx.scenes.scene2d.ui.Label;
import com.badlogic.gdx.scenes.scene2d.ui.Skin;
import com.badlogic.gdx.scenes.scene2d.ui.Table;
import com.badlogic.gdx.scenes.scene2d.ui.TextButton;
import com.badlogic.gdx.scenes.scene2d.ui.TextButton.TextButtonStyle;
import com.badlogic.gdx.scenes.scene2d.ui.TextField;
import com.badlogic.gdx.scenes.scene2d.utils.ClickListener;




public class GameMenuScreen implements Screen {
	final Drop game;
    private SpriteBatch batch;
    private Skin skin;
    private Stage stage;
    private Table table; 
    public boolean click = false;
    
	private TextureAtlas textureAtlas;
    
	public GameMenuScreen(final Drop game) {
		this.game = game;  
		
		stage = new Stage();
		textureAtlas = new TextureAtlas("comic-ui.atlas");
		skin = new Skin();
		skin.addRegions(textureAtlas);


		TextButtonStyle buttonStyle = skin.get("bigButton", TextButtonStyle.class);
		
		TextButton button = new TextButton("Click me!", buttonStyle);

	    
	    //createBasicSkin();
	    
	    TextButton turnOverButton = new TextButton("Turn Over", skin); // Use the initialized skin
	    turnOverButton.setPosition(Gdx.graphics.getWidth()/2 - Gdx.graphics.getWidth()/8 , Gdx.graphics.getHeight()/2);
	    stage.addActor(turnOverButton);
	    turnOverButton.addListener(new ClickListener() {
	    	@Override
	    	public void clicked (InputEvent event, float x, float y) {
	    		System.out.println("Click Turn Over!");
	    		click = true;
	    	}
	    });  
	
	    
	}
	/*
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
	}*/
	
	public void render(float delta) {
        Gdx.gl.glClearColor(1, 1, 1, 1);
        Gdx.gl.glClear(GL20.GL_COLOR_BUFFER_BIT);
 
        stage.act();
        stage.draw();
    }
    
	
    @Override
    public void dispose() {
        batch.dispose();
        skin.dispose();
        stage.dispose();
    }
	@Override
	public void resize(int width, int height) {
	}

	@Override
	public void show() {
		
		table = new Table();
		table.setFillParent(true);
        	table.setDebug(true);
        	stage.addActor(table);
        
        	// temporary until we have asset manager in
        	 skin = new Skin(Gdx.files.internal("comic-ui.json"));
        
        	//create buttons
        	TextButton newGame = new TextButton("New Game", skin);
        	TextButton preferences = new TextButton("Preferences", skin);
        	TextButton exit = new TextButton("Exit", skin);
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