package com.gdxtemplate.game;

public class Maths { ///Operations done here are called by the Main Event Queue
	private int dX;
	private int dY;
	private int TotalX;
	private int ParabolaY;
	private int i;

	public int Parabola(Directrix Directrix, Foci Foci) { /// Calculates the set of points used to draw diagram
		dX = Directrix.GetX() - Foci.GetX(i);
		TotalX = Directrix.GetX() + Foci.GetX(i);
		dY = Foci.GetY(i) - Directrix.GetY();
		
		ParabolaY = (dX*dX) / (2*dY) + (TotalX / 2);
		return(ParabolaY);
	}
	
}
