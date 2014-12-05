package com.mygdx.tarea6;



import com.badlogic.gdx.Game;
import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.InputProcessor;
import com.badlogic.gdx.graphics.Texture;
import com.badlogic.gdx.graphics.g2d.SpriteBatch;
import com.badlogic.gdx.scenes.scene2d.Stage;

public class ClasePrincipal extends Game implements InputProcessor{
	SpriteBatch batch;
	Texture img, jug, instru, Salir;
	Stage stage;
	Jugador jugador;
	Plataforma plat;
	Enemigo enem1;
	boolean activado = true;	
	MainMenu screenMenu;
	screen2 screendos;
	screen1 screenuno;
	
	@Override
	public void create () {		
		stage=new Stage();
		Gdx.input.setInputProcessor(this);

		batch = new SpriteBatch();
//		img = new Texture("FondoMenu.png");
		jugador = new Jugador();		
		plat = new Plataforma();		
//		stage.addActor(jugador);
//		stage.addActor(plat); 
//		stage.addActor(new Enemigo(jugador));
//		stage.addActor(new Plataforma());

		screenMenu = new MainMenu(this);
		screendos = new screen2(this);
		screenuno = new screen1(this);
		setScreen(screenMenu);
		
	}
	

	void nuevoenemigo(){
		Enemigo enem = new Enemigo(jugador);
		Enemigo2 fant = new Enemigo2(jugador);
		stage.addActor(enem);
		enem.setX(500);
		stage.addActor(fant);
		fant.setX(500);
				
	}


	@Override
	public boolean keyDown(int keycode) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean keyUp(int keycode) {
		
		return false;
	}

	@Override
	public boolean keyTyped(char character) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean touchDown(int screenX, int screenY, int pointer, int button) {
		jugador.saltar1();
		return false;
	}

	@Override
	public boolean touchUp(int screenX, int screenY, int pointer, int button) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean touchDragged(int screenX, int screenY, int pointer) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean mouseMoved(int screenX, int screenY) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean scrolled(int amount) {
		// TODO Auto-generated method stub
		return false;
	}
}
