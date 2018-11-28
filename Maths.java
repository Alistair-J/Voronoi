package com.gdxtemplate.game;

public class Maths {
	private int dX;
	private int dY;
	private int TotalX;
	private int ParabolaY;
	private int i;

	public void Parabola(Directrix Directrix, Foci Foci) {
		///Get Directrix. Get Foci
		
		dX = Directrix.GetX() - Foci.GetX(i);
		TotalX = Directrix.GetX() + Foci.GetX(i);
		dY = Foci.GetY(i) - Directrix.GetY();
		
		ParabolaY = (dX*dX) / (2*dY) + (TotalX / 2);
	}
	
	
}
