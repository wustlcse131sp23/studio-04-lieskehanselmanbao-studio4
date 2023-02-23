package studio4;

import java.awt.Color;
import java.util.Scanner;

import edu.princeton.cs.introcs.StdDraw;

public class Flag {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		
		
		StdDraw.rectangle(.5, 0.5, 0.4, 0.8/3);
		StdDraw.setPenColor(255,100,100);
		StdDraw.filledRectangle(0.5, 0.55, 0.4, 0.025);
		StdDraw.filledRectangle(0.5, 0.45, 0.4, 0.025);
		StdDraw.filledRectangle(0.45, 0.5, 0.025, 0.8/3);
		StdDraw.filledRectangle(0.55, 0.5, 0.025, 0.8/3);
		StdDraw.setPenColor(Color.YELLOW);
		StdDraw.filledRectangle(0.5, 0.5, 0.025, 0.025);
		
	}
}