package com.mygdx.tarea6;

import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.InputProcessor;
import com.badlogic.gdx.Screen;
import com.badlogic.gdx.graphics.GL20;
import com.badlogic.gdx.graphics.Texture;
import com.badlogic.gdx.graphics.g2d.Sprite;
import com.badlogic.gdx.scenes.scene2d.Stage;

public class screen3 extends MainMenu implements Screen,InputProcessor {
	Stage stage, stage2;
	Jugador jugador;
	Plataforma plat;
	Enemigo enem1;
	Enemigo2 enem2;
	Sprite facil;
	Sprite medio;
	Sprite dificil;
	int frame;
	int frame1;
	boolean lock = false;

	public screen3(ClasePrincipal game) {
		super(game);
		Gdx.input.setInputProcessor(this);
		
		facil = new Sprite(new Texture("facil.png"));
		medio = new Sprite(new Texture("medio.png"));
		dificil = new Sprite(new Texture("dificil.png"));	
		
		facil.setX(210);
		facil.setY(350);
		medio.setY(150);
		medio.setX(50);
		dificil.setX(380);
		dificil.setY(150);
		
	}
	
	@Override
	public void render(float delta) {
		Gdx.gl.glClearColor(0, 1, 1, 1);
		Gdx.gl.glClear(GL20.GL_COLOR_BUFFER_BIT);
		
		batch.begin();
		
		facil.draw(batch);
		medio.draw(batch);
		dificil.draw(batch);
		
		if (Gdx.input.isTouched()) {
//			if (!lock) {
				
				lock = true;
				float x = Gdx.input.getX();
				float y = -1 * Gdx.input.getY() + (Gdx.graphics.getHeight());
				boolean area_x_facil = x > facil.getX()
						&& x < facil.getX() + facil.getWidth();
				boolean area_y_facil = y > facil.getY()
						&& y < facil.getY() + facil.getHeight();
				boolean area_facil = area_x_facil && area_y_facil;
				System.out.println("Coordenada Y del click " + y);
				System.out.println("Coordenada Y de facil "	+ facil.getY());
				System.out.println();
				if (area_facil){
					game.setScreen(game.fa);
					music.play();
					// Audio "FREE" Sacado de esta pagina: http://www.flashkit.com/soundfx/
				}
			}
//		}else{
//			lock=false;
	
		
			
			if (Gdx.input.isTouched()) {
//				if (!lock) {
					
					lock = true;
					float x = Gdx.input.getX();
					float y = -1 * Gdx.input.getY() + (Gdx.graphics.getHeight());
					boolean area_x_medio = x > medio.getX()
							&& x < medio.getX() + medio.getWidth();
					boolean area_y_medio = y > medio.getY()
							&& y < medio.getY() + medio.getHeight();
					boolean area_medio = area_x_medio && area_y_medio;
					System.out.println("Coordenada Y del click " + y);
					System.out.println("Coordenada Y de medio "	+medio.getY());
					System.out.println();
					if (area_medio){
						game.setScreen(game.med);
						music.play();
						// Audio "FREE" Sacado de esta pagina: http://www.flashkit.com/soundfx/
					}
				}
//			}else{
//				lock = false;
//			}

			if (Gdx.input.isTouched()) {
//				if (!lock) {
					
					lock = true;
					float x = Gdx.input.getX();
					float y = -1 * Gdx.input.getY() + (Gdx.graphics.getHeight());
					boolean area_x_dificil = x > dificil.getX()
							&& x < dificil.getX() + dificil.getWidth();
					boolean area_y_dificil = y > dificil.getY()
							&& y < dificil.getY() + dificil.getHeight();
					boolean area_dificil = area_x_dificil && area_y_dificil;
					System.out.println("Coordenada Y del click " + y);
					System.out.println("Coordenada Y de dificil "	+ dificil.getY());
					System.out.println();
					if (area_dificil){
						game.setScreen(game.dif);
						music.play();
						// Audio "FREE" Sacado de esta pagina: http://www.flashkit.com/soundfx/
					}
				}
//			}else{
//				lock = false;
//			}
			

			batch.end();
		 }
}
