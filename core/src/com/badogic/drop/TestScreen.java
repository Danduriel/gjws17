package com.badogic.drop;

import com.badlogic.gdx.Gdx;

import com.badlogic.gdx.Screen;
import com.badlogic.gdx.graphics.GL20;
import com.badlogic.gdx.graphics.g2d.SpriteBatch;
import com.badlogic.gdx.graphics.g2d.TextureAtlas;
import com.badlogic.gdx.scenes.scene2d.InputEvent;
import com.badlogic.gdx.scenes.scene2d.Stage;
import com.badlogic.gdx.scenes.scene2d.ui.Label;
import com.badlogic.gdx.scenes.scene2d.ui.Skin;
import com.badlogic.gdx.scenes.scene2d.ui.Table;
import com.badlogic.gdx.scenes.scene2d.ui.TextButton;
import com.badlogic.gdx.scenes.scene2d.ui.TextField;
import com.badlogic.gdx.scenes.scene2d.utils.ClickListener;

public class TestScreen implements Screen {

	final Drop game;
	private SpriteBatch batch;
    private Skin skin;
    private Stage stage;
    private Table table;
    private TextureAtlas atlas;
    
    public TestScreen(final Drop game) {
		this.game = game;  
		create();
    }
 
    public void create () {
    	stage = new Stage();
    	//skin = new Skin("comic-ui.json","comic-ui.atlas");
    	
    	atlas = new TextureAtlas(Gdx.files.internal("comic-ui.atlas"));
    	skin = new Skin(atlas);
    	
    	
    	/*
    	 *  skin.addRegions(AssetsManager.getTextureAtlas());
    	 *  
    	 *  
    	 * 
    	 * */
    	
    	
    			
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

    public void resize (int width, int height) {
    	stage.getViewport().update(width, height, true);
    }

    public void render () {
    	Gdx.gl.glClear(GL20.GL_COLOR_BUFFER_BIT);
    	stage.act(Gdx.graphics.getDeltaTime());
    	stage.draw();
    }

    public void dispose() {
    	batch.dispose();
    	stage.dispose();
    }

	public void render(float delta) {
        Gdx.gl.glClearColor(1, 1, 1, 1);
        Gdx.gl.glClear(GL20.GL_COLOR_BUFFER_BIT);
 
        batch.begin();
        stage.draw();
        batch.end();
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