package com.gdxtemplate.game;

import com.badlogic.gdx.graphics.glutils.ShapeRenderer;
import com.badlogic.gdx.graphics.glutils.ShapeRenderer.ShapeType;

public class Render {
	
	public void Cycle(ShapeRenderer sr, Foci Foci) {
		sr.begin(ShapeType.Filled); //Opens (and closes) outside of the for loop to increase efficiency
		for(int i = 0; i < Foci.GetMax(); i++) {
			sr.setColor(225/225f, 0/225f, 0/225f, 0);
			sr.rect(Foci.GetX(i), Foci.GetY(i), 5, 5);
		}
		sr.end();
	}

}
