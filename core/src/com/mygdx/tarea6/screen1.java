package com.mygdx.tarea6;

import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.graphics.GL20;
import com.badlogic.gdx.graphics.Texture;
import com.badlogic.gdx.scenes.scene2d.Stage;

public class screen1 extends MainMenu {
	Stage stage;
	Jugador jugador;
	Plataforma plat;
	Enemigo enem1;
	Enemigo2 enem2;

	public screen1(ClasePrincipal game) {
		super(game);
		Texture asd = new Texture("instruclist.png");
		fondo.setTexture(asd);
		
		stage = new Stage();
		jugador = new Jugador();		
		plat = new Plataforma();		
		stage.addActor(jugador);
		stage.addActor(plat); 
		stage.addActor(new Enemigo(jugador));
		stage.addActor(new Enemigo2(jugador));
		stage.addActor(new Plataforma());
		
		
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
		
		stage.draw();
		stage.act();
		
//		batch.begin();		
//		if(Gdx.input.isTouched())
//			game.setScreen(game.screenMenu);
//		batch.end();
	}
}


