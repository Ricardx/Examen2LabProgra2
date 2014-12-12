package com.mygdx.tarea6;

import java.util.ArrayList;

import com.badlogic.gdx.graphics.Texture;
import com.badlogic.gdx.graphics.g2d.Batch;
import com.badlogic.gdx.scenes.scene2d.Actor;
import com.badlogic.gdx.scenes.scene2d.ui.Image;

public class Nombre extends Actor {
	ArrayList<Image>images;
	int dibujo_actual=0;
	float tiempo_act=0;
	
	
	public Nombre(){
		super();
		images = new ArrayList<Image>();
		images.add(new Image(new Texture("Name1.png")));
		images.add(new Image(new Texture("Name2.png")));
		images.add(new Image(new Texture("Name3.png")));
		images.add(new Image(new Texture("Name4.png")));
		images.add(new Image(new Texture("Name5.png")));
		this.setX(400);
		this.setY(400);
		
	}
	
	@Override
	public void act(float delta) {
		super.act(delta);
//		System.out.println(delta);
		tiempo_act+=delta;
		if(tiempo_act>0.1f){
			dibujo_actual++;
			tiempo_act=0;
		}
		if(dibujo_actual >= images.size()){
			dibujo_actual=0;
		}
		//this.setX(400);
		//this.setY(this.getX()+5);
		
		
	}
	
	@Override
	public void draw(Batch batch, float parentAlpha) {
		super.draw(batch, parentAlpha);
		images.get(dibujo_actual).setX(450);
		images.get(dibujo_actual).setY(450);
		images.get(dibujo_actual).draw(batch, parentAlpha);
	}
	
	

}