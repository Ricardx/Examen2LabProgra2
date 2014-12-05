package com.mygdx.tarea6;

import java.util.ArrayList;

import com.badlogic.gdx.graphics.Texture;
import com.badlogic.gdx.scenes.scene2d.ui.Image;


public class Jugador extends PersonajeAnimado{
	
	float gravedad;
	public Jugador() {
		super(loadImages());
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
		aceleracion_y*=delta;
		if(getY()<=piso){
			velocidad_y=0;
			aceleracion_y=0;
	}
	
	
}

	void saltar1(){
		
			aceleracion_y=0;
			System.out.println("salta");
		
	}
	
	}