package com.mygdx.tarea6;

import java.util.ArrayList;

import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.InputProcessor;
import com.badlogic.gdx.Screen;
import com.badlogic.gdx.audio.Music;
import com.badlogic.gdx.graphics.GL20;
import com.badlogic.gdx.graphics.Texture;
import com.badlogic.gdx.graphics.g2d.Sprite;
import com.badlogic.gdx.graphics.g2d.SpriteBatch;
import com.badlogic.gdx.scenes.scene2d.Stage;
import com.badlogic.gdx.scenes.scene2d.ui.Image;

public class MainMenu implements Screen{
	Stage stage;
	Sprite fondo;
	Sprite instrucciones;
	Sprite salir;
	Sprite jugar;
	ClasePrincipal game;
	SpriteBatch batch;
	Jugador jugador;
	Plataforma plat;
	boolean lock = false;
	ArrayList<Image> images;
	int frame = 0;
	int dibujo_actual=0;
	float tiempo_act=0;
	Music music;
	Music music2;

	public MainMenu(ClasePrincipal game) {
		stage = new Stage();
		this.game = game;
		batch = game.batch;
		jugador = new Jugador();
		plat = new Plataforma();
		stage.addActor(jugador);
		stage.addActor(plat);
		fondo = new Sprite(new Texture("FondoMenu.png"));
		instrucciones = new Sprite(new Texture("instrucciones.png"));
		jugar = new Sprite(new Texture("jugar.png"));
		salir = new Sprite(new Texture("salir.png"));
		music = Gdx.audio.newMusic(Gdx.files.internal("Button1.mp3"));
		music2 = Gdx.audio.newMusic(Gdx.files.internal("Button3.mp3"));

		images = new ArrayList<Image>();
		images.add(new Image(new Texture("FondoMenu.png")));
		images.add(new Image(new Texture("FondoMen1.png")));
		images.add(new Image(new Texture("FondoMen2.png")));
		images.add(new Image(new Texture("FondoMen3.png")));
		images.add(new Image(new Texture("FondoMen4.png")));
		images.add(new Image(new Texture("FondoMen5.png")));
		
		instrucciones.setX(180);
		instrucciones.setY(150);
		jugar.setX(260);
		jugar.setY(220);
		salir.setX(170);
		salir.setY(80);

	}

	@Override
	public void render(float delta) {
		Gdx.gl.glClearColor(1, 0, 0, 1);
		Gdx.gl.glClear(GL20.GL_COLOR_BUFFER_BIT);

		batch.begin();
		
		// dibujar la pos animacion size del arraylist
		
		tiempo_act+=delta;
		if(tiempo_act>0.4f){
			dibujo_actual++;
			tiempo_act=0;
		}
		if(dibujo_actual >= images.size()){
			dibujo_actual=0;
//			images.get(dibujo_actual).draw(batch, dibujo_actual);
		}
		images.get(dibujo_actual).draw(batch, dibujo_actual);
//		fondo.draw(batch);
		instrucciones.draw(batch);
		jugar.draw(batch);
		salir.draw(batch);

		
		if (Gdx.input.isTouched()) {
//			if (!lock) {
				
//				lock = true;
				float x = Gdx.input.getX();
				float y = -1 * Gdx.input.getY() + (Gdx.graphics.getHeight());
				boolean area_x_instrucciones = x > instrucciones.getX()
						&& x < instrucciones.getX() + instrucciones.getWidth();
				boolean area_y_instrucciones = y > instrucciones.getY()
						&& y < instrucciones.getY() + instrucciones.getHeight();
				boolean area_instrucciones = area_x_instrucciones
						&& area_y_instrucciones;
				System.out.println("Coordenada Y del click " + y);
				System.out.println("Coordenada Y de instrucciones "
						+ instrucciones.getY());
				System.out.println();
				if (area_instrucciones){					
					game.setScreen(game.screendos);
					music.play();
				}

			}
//		} else{
//			lock = false;
//		}
		
		if (Gdx.input.isTouched()) {
//			if (!lock) {
//				
//				lock = true;
				float x = Gdx.input.getX();
				float y = -1 * Gdx.input.getY() + (Gdx.graphics.getHeight());
				boolean area_x_jugar = x > jugar.getX()
						&& x < jugar.getX() + jugar.getWidth();
				boolean area_y_jugar = y > jugar.getY()
						&& y < jugar.getY() + jugar.getHeight();
				boolean area_jugar = area_x_jugar && area_y_jugar;
				System.out.println("Coordenada Y del click " + y);
				System.out.println("Coordenada Y de jugar "	+ jugar.getY());
				System.out.println();
				if (area_jugar){
					game.setScreen(game.screenuno);
					music2.play();
				}
//			}
//		} else{
//			lock = false;
		}
		
		if (Gdx.input.isTouched()) {
			if (!lock) {
				
				lock = true;
				float x = Gdx.input.getX();
				float y = -1 * Gdx.input.getY() + (Gdx.graphics.getHeight());
				boolean area_x_salir = x > salir.getX()
						&& x < salir.getX() + salir.getWidth();
				boolean area_y_salir = y > salir.getY()
						&& y < salir.getY() + salir.getHeight();
				boolean area_salir = area_x_salir && area_y_salir;
				System.out.println("Coordenada Y del click " + y);
				System.out.println("Coordenada Y de salir "	+ jugar.getY());
				System.out.println();
				if (area_salir){
					System.exit(0);
				}
			}
		} else{
			lock = false;
		}
		
		
		
		batch.end();
//		stage.draw();
//		stage.act();

		// System.exit(0);

}


	@Override
	public void resize(int width, int height) {
		// TODO Auto-generated method stub

	}

	@Override
	public void show() {
		// TODO Auto-generated method stub

	}

	@Override
	public void hide() {
		// TODO Auto-generated method stub

	}

	@Override
	public void pause() {
		// TODO Auto-generated method stub

	}

	@Override
	public void resume() {
		// TODO Auto-generated method stub

	}

	@Override
	public void dispose() {
		// TODO Auto-generated method stub

	}
}

	