package com.mygdx.tarea6;

import java.util.ArrayList;

import com.badlogic.gdx.graphics.Texture;
import com.badlogic.gdx.graphics.g2d.Batch;
import com.badlogic.gdx.scenes.scene2d.ui.Image;


public class Enemigo extends PersonajeAnimado{
	Jugador jugador;
	Image image;	
	boolean coli = false;
	Enemigo(Jugador jugador){
		super(loadImages());
		setX(800);
		velocidad_x=-100;
		this.jugador=jugador;
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
			image.draw(batch, parentAlpha);
		}
	}
}