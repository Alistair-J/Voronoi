package com.gdxtemplate.game;

import com.badlogic.gdx.graphics.glutils.ShapeRenderer;
import com.badlogic.gdx.graphics.glutils.ShapeRenderer.ShapeType;

public class Render {
	
	public void Cycle(ShapeRenderer sr, Foci Foci, Directrix Directrix, Maths Maths) {
		sr.begin(ShapeType.Filled); //Opens (and closes) outside of the for loop to increase efficiency
		for(int i = 0; i < Foci.GetMax(); i++) { ///Draws all points
			sr.setColor(225/225f, 0/225f, 0/225f, 0);
			sr.rect(Foci.GetX(i), Foci.GetY(i), 5, 5);
			
		}
		
		sr.setColor(0/255f, 0/225f, 225/225f, 0);
		sr.rect(Directrix.GetX(), Directrix.GetY(), 400, 1); ///Draws Directrix
		
		sr.setColor(0/225f,0/225f,225/225f,0);
		
		sr.end();
	}

}
