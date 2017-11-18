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
import com.badlogic.gdx.scenes.scene2d.ui.Label;
import com.badlogic.gdx.scenes.scene2d.ui.Skin;
import com.badlogic.gdx.scenes.scene2d.ui.Table;
import com.badlogic.gdx.scenes.scene2d.ui.TextButton;
import com.badlogic.gdx.scenes.scene2d.ui.TextField;
import com.badlogic.gdx.scenes.scene2d.utils.ClickListener;


public class GameMenuScreen implements Screen {
	final Drop game;
    private SpriteBatch batch;
    private Skin skin;
    private Stage stage;
    private Table table; 
    public boolean click = false;
    
	public GameMenuScreen(final Drop game) {
		this.game = game;  
		
		stage = new Stage();
	    Gdx.input.setInputProcessor(stage);// Make the stage consume events

	    createBasicSkin();
	    
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
	    
	    
    	table = new Table();
    	table.setFillParent(true);
    	stage.addActor(table);

    	table.setDebug(true); // This is optional, but enables debug lines for tables.

        Label nameLabel = new Label("Name:", skin);
        TextField nameText = new TextField("", skin);
        Label addressLabel = new Label("Address:", skin);
        TextField addressText = new TextField("", skin);
        
        table.add(nameLabel);
        table.add(nameText).width(100);
        table.row();
        table.add(addressLabel);
        table.add(addressText).width(100);
	    
	    
	    
	    
	    
	    
	    
	    
	    
	    
	    
	    
	    
	    
	    
	    
	    
	    
	    
	    
	    
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
        skin.dispose();
        stage.dispose();
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