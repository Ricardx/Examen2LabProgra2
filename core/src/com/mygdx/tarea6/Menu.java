package com.mygdx.tarea6;

import java.util.ArrayList;

import com.badlogic.gdx.graphics.Texture;
import com.badlogic.gdx.scenes.scene2d.ui.Image;

public class Menu extends PersonajeAnimado{
	static ArrayList<Image> images;
	
	public Menu(){
		super(loadImages());
		setX(0);
		setY(0);
		velocidad_animacion = 0.5f;
	}
	
	
	static ArrayList<Image> loadImages(){
		images = new ArrayList<Image>();
		images.add(new Image(new Texture("FondoMenu.png")));
		images.add(new Image(new Texture("FondoMen1.png")));
		images.add(new Image(new Texture("FondoMen2.png")));
		images.add(new Image(new Texture("FondoMen3.png")));
		images.add(new Image(new Texture("FondoMen4.png")));
		images.add(new Image(new Texture("FondoMen5.png")));
//		images.add(new Image(new Texture("jugar.png")));
//		images.add(new Image(new Texture("instrucciones.png")));
//		images.add(new Image(new Texture("salir.png")));
		
		return images;
	}
	
}

