package com.mygdx.tarea6;

import java.util.ArrayList;

import com.badlogic.gdx.graphics.Texture;
import com.badlogic.gdx.graphics.g2d.Batch;
import com.badlogic.gdx.scenes.scene2d.ui.Image;

public class Estrellita extends Image {
	ArrayList<Image>images;
	int dibujo_actual=0;
	float tiempo_act=0;
	int velocidad=10;
	Jugador pj ;
	
	
	public Estrellita(Jugador pj){
		super();
		this.pj=pj;
		images = new ArrayList<Image>();
		images.add(new Image(new Texture("sola1.png")));
		images.add(new Image(new Texture("sola2.png")));
		images.add(new Image(new Texture("sola4.png")));
		images.add(new Image(new Texture("sola5.png")));
		this.setX(300);
		this.setY(350);
	}
	
	@Override
	public void act(float delta) {
		super.act(delta);
		this.setX(this.getX()-delta*100);
//		System.out.println(delta);
		tiempo_act+=delta;
		if(tiempo_act>0.1f){
			dibujo_actual++;
			tiempo_act=0;
		}
		if(dibujo_actual >= images.size()){
			dibujo_actual=0;
		}
		
		this.setX(this.getX()-3);
		}		
		
	
	
	
	
	@Override
	public void draw(Batch batch, float parentAlpha) {
		super.draw(batch, parentAlpha);
		images.get(dibujo_actual).setX(450);	
		images.get(dibujo_actual).setY(this.getY());
		images.get(dibujo_actual).setX(this.getX());
		images.get(dibujo_actual).draw(batch, parentAlpha);
	}
}
	
	
