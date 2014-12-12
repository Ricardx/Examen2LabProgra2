package com.mygdx.tarea6;

import java.util.ArrayList;

import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.graphics.Texture;
import com.badlogic.gdx.graphics.g2d.Batch;
import com.badlogic.gdx.graphics.g2d.Sprite;
import com.badlogic.gdx.graphics.g2d.SpriteBatch;
import com.badlogic.gdx.scenes.scene2d.ui.Image;


public class Enemigo extends PersonajeAnimado{
	Jugador jugador;
	Image image;	
	boolean coli = false;
	Sprite fondo1;
	SpriteBatch batch;
	ClasePrincipal game;
	boolean lock;
	
	Enemigo(Jugador jugador, ClasePrincipal game){
		super(loadImages());
		this.game = game;
		this.jugador=jugador;
		setX(800);
		fondo1 = new Sprite(new Texture("GameOver.png"));
		velocidad_x=-100;		
		image = new Image(new Texture("GameOver.png"));
	}
	
	static ArrayList<Image> loadImages()
	{
		ArrayList<Image> images;
		images = new ArrayList<Image>();
		images.add(new Image(new Texture("croc01.png")));
		images.add(new Image(new Texture("croc02.png")));
		images.add(new Image(new Texture("croc03.png")));
		images.add(new Image(new Texture("croc04.png")));
		images.add(new Image(new Texture("croc05.png")));
		images.add(new Image(new Texture("croc06.png")));
		return images;
	}
	
	@Override
	public void act(float delta) {
		super.act(delta);
		if(colision(jugador)){
			System.out.println("Colision!");
			coli = true;
			}else{
			coli=false;
		}
	}
	
	@Override
	public void draw(Batch batch, float parentAlpha) {
		super.draw(batch, parentAlpha);
		if(coli == true){
			fondo1.draw(batch);
			
			if (Gdx.input.isTouched()) {
				if (!lock) {
					
					lock = true;
					float x = Gdx.input.getX();
					float y = -1 * Gdx.input.getY() + (Gdx.graphics.getHeight());
					boolean area_x_fondo1 = x > fondo1.getX()
							&& x < fondo1.getX() + fondo1.getWidth();
					boolean area_y_instrucciones = y > fondo1.getY()
							&& y < fondo1.getY() + fondo1.getHeight();
					boolean area_fondo1 = area_x_fondo1
							&& area_y_instrucciones;
					System.out.println("Coordenada Y del click " + y);
					System.out.println("Coordenada Y de instrucciones "
							+ fondo1.getY());
					System.out.println();
					if (area_fondo1){					
						game.setScreen(game.screenMenu);
					}
				}else{
					lock = false;
				}
			}
		}
	}
	

	}
