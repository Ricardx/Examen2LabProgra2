package com.mygdx.tarea6;

import com.badlogic.gdx.graphics.Texture;
import com.badlogic.gdx.scenes.scene2d.ui.Image;

public class Plataforma extends Image
{
	int velocidad = 70;
	public Plataforma()
	{
		super(new Texture("suelo.png"));
		this.setX(1);
		this.setY(1);
	}
	
	@Override
	public void act(float delta) {
		super.act(delta);
		this.setX(this.getX()-delta*velocidad);
	}
}
