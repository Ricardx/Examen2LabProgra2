package com.mygdx.tarea6;

import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.audio.Music;
import com.badlogic.gdx.graphics.GL20;
import com.badlogic.gdx.graphics.Texture;
import com.badlogic.gdx.scenes.scene2d.Stage;


public class medio extends MainMenu {
	Stage stage, stage2;
	Jugador jugador;
	Plataforma plat;
	Enemigo enem1;
	Enemigo2 enem2;
	int frame;
	int frame1;
	Music music;

	public medio(ClasePrincipal game) {
		super(game);
		Gdx.input.setInputProcessor(this);
		stage = new Stage();
		stage2 = new Stage();
		jugador = new Jugador();		
		plat = new Plataforma();
		stage2.addActor(jugador);
		stage.addActor(plat);
		stage.addActor(new Plataforma());
		Nombre nom = new Nombre();
		stage.addActor(nom);
		music = Gdx.audio.newMusic(Gdx.files.internal("06 Searching.mp3"));
		
		
	}
	
	@Override
	public void show() {
		// TODO Auto-generated method stub
		super.show();
	}
	

	void nuevoenemigo(){
		Enemigo enem = new Enemigo(jugador, game);
		Enemigo2 fant = new Enemigo2(jugador);
		stage.addActor(enem);
		enem.setX(730);
		stage.addActor(fant);
		fant.setX(730);
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
		stage2.draw();
		stage2.act();
		music.play();
//		Music by erik Stiff
		
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


