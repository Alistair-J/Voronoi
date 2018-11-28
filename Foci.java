package com.gdxtemplate.game;

import java.util.Random;

public class Foci {
	
	private int x = 0;
	private int y = 0;
	private static int[][] Foci;
	
	public void CreateArray(int max) {
		Foci = new int[max][3];
	}
	
	public void Generate(int i, Random generate) {
		x = generate.nextInt(400);
		y = generate.nextInt(400);
		Foci[i][0] = x;
		Foci[i][1] = y;
		System.out.println(Foci[i][0]);
		System.out.println(Foci[i][1]);
	}
	
	public int GetX(int i) {
		return (Foci[i][0]);
	}
	
	public int GetY(int i) {
		return (Foci[i][1]);
	}

}
