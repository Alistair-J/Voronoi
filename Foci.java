package com.gdxtemplate.game;

import java.util.Random;

public class Foci {
	
	private int x = 0;
	private int y = 0;
	private int i = 1;
	private int j = 1;
	private int temp1, temp2;
	private static int max = 0;
	private static int[][] Foci;
	
	public void CreateArray(int i) { ///Changes the maximum number of Foci to a random number <20 
		max = i;
		Foci = new int[i][3];
	}
	
	public void Generate(int i, Random generate) { /// Creates all points and puts them in the array
		x = generate.nextInt(400);
		y = generate.nextInt(400);
		Foci[i][0] = x;
		Foci[i][1] = y;
		System.out.println(Foci[i][0]);
		System.out.println(Foci[i][1]);
	}
	
	public int GetX(int i) { ///Returns FociX; used for Parabola drawing
		return (Foci[i][0]);
	}
	
	public int GetY(int i) { ///Returns FociY; used for Parabola drawing; the next DirectrixY; and sorting the array 
		return (Foci[i][1]);
	}
	
	public int GetMax() { ///Returns the number of points that exist
		return (max);
	}
	public int[][] FociSort(){ ///Insertion Sort algorithm
		while (i < max) {
		j = i;
			while(j>0 && Foci[j-1][1] > Foci[j][1]) { ///Depends on the y element of the array
			temp1 = Foci[j][1]; ///Swaps the elements
			temp2 = Foci[j][0];
			Foci[j][1] = Foci[j-1][1];
			Foci[j][0] = Foci[j-1][0];
			Foci[j-1][1] = temp1;
			Foci[j-1][0] = temp2;
			j--;
			}
		i++;
		}
		return (Foci);
	}

}
