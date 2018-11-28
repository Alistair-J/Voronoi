package com.gdxtemplate.game;

import java.util.Random;

import com.badlogic.gdx.*;
import com.badlogic.gdx.graphics.glutils.ShapeRenderer;

/*
 ------Initialising-Pseudocode------
 1) Check number of points to be created
 2) Generate a random x and y co-ordinate 0<=n<=400
 3) Assign to a point
 4) Repeat 2,3 until desired number of points
 
 ------Event-Queue-High-Level-Pseudocode------
 1) Scan for next focus
 2) Update Directrix with y = focus y
 3) Update Parabola to current Directrix
 4) Check for current meetings of parabola
 5) Draw (optional)
*/


public class Voronoi extends ApplicationAdapter {
	ShapeRenderer sr;
	Foci Foci = new Foci();
	Directrix Directrix = new Directrix();
	private Random generate = new Random();
	
	@Override
	public void create () {
		sr = new ShapeRenderer();
		int max = generate.nextInt(20);
		Foci.CreateArray(max);
		for (int i = 0; i < max-1; i++) {
			Foci.Generate(i, generate);
		}
		
	}

	@Override
	public void render() { 
		
		
	}
	
	
	@Override
	public void dispose () {
		
	}
	

}