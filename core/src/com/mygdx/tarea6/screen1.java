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
	int frame;
	int frame1;

	public screen1(ClasePrincipal game) {
		super(game);
		Texture asd = new Texture("instruclist.png");
		fondo.setTexture(asd);
		
		stage = new Stage();
		jugador = new Jugador();		
		plat = new Plataforma();		
		stage.addActor(jugador);
		stage.addActor(plat);
		stage.addActor(new Plataforma());
		
		
	}
	
	@Override
	public void show() {
		// TODO Auto-generated method stub
		super.show();
	}
	

	void nuevoenemigo(){
		Enemigo enem = new Enemigo(jugador);
		Enemigo2 fant = new Enemigo2(jugador);
		stage.addActor(enem);
		enem.setX(630);
		stage.addActor(fant);
		fant.setX(630);
	    
					

	}
	void nuevaplat(){
		Plataforma scr = new Plataforma();
		stage.addActor(scr);
		scr.setX(100);
	}
	
	@Override
	public void render(float delta) {
		Gdx.gl.glClearColor(1, 1, 1, 1);
		Gdx.gl.glClear(GL20.GL_COLOR_BUFFER_BIT);
		
		stage.draw();
		stage.act();
		
		if(frame %150 ==0)
			nuevoenemigo();
		frame++;
		
		
		if(frame1%400==0)
			nuevaplat();
		 frame1++;
		
		
//		batch.begin();		
//		if(Gdx.input.isTouched())
//			game.setScreen(game.screenMenu);
//		batch.end();
	}
}


