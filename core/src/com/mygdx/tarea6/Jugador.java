package com.mygdx.tarea6;

import java.util.ArrayList;

import com.badlogic.gdx.graphics.Texture;
import com.badlogic.gdx.scenes.scene2d.ui.Image;


public class Jugador extends PersonajeAnimado{
	
	float gravedad;
	float velocidad_x=1f;
	float velocidad_y = 1f;
	float aceleracion_x;
	float aceleracion_y=1f;
	
	public Jugador() {
		super(loadImages());
//		Gdx.input.setInputProcessor((InputProcessor) this);
	}
	
	static ArrayList<Image> loadImages()
	{
		ArrayList<Image> images;
		images = new ArrayList<Image>();
		images.add(new Image(new Texture("run01.png")));
		images.add(new Image(new Texture("run02.png")));
		images.add(new Image(new Texture("run03.png")));
		images.add(new Image(new Texture("run04.png")));
		return images;
	}
	
	@Override
	public void act(float delta) {
		super.act(delta);
		aceleracion_y*=velocidad_x;
		if(getY()<=piso){
			velocidad_y=0;
			aceleracion_y=0;
	}
	
	
}

	void saltar1(){
		if(this.getY() == 70 || this.getY() <300){
			System.out.println("salto");
			aceleracion_y = 1.5f;
		}
		
	}
	
}