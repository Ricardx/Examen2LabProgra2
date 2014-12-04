package com.mygdx.tarea6;

import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.graphics.GL20;
import com.badlogic.gdx.graphics.Texture;

public class screen2 extends MainMenu {

	public screen2(ClasePrincipal game) {
		super(game);
		Texture asd = new Texture("instruclist.png");
		fondo.setTexture(asd);
	}
	
	@Override
	public void show() {
		// TODO Auto-generated method stub
		super.show();
	}
	
	@Override
	public void render(float delta) {
		Gdx.gl.glClearColor(1, 1, 1, 1);
		Gdx.gl.glClear(GL20.GL_COLOR_BUFFER_BIT);
		
		batch.begin();
		fondo.draw(batch);
		
		if(Gdx.input.isTouched())
			game.setScreen(game.screenMenu);
		batch.end();
	}
	
}
