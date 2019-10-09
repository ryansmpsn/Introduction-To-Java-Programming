package chapter4;
/*
 * Find the GPS locations for Atlanta, Georgia;
 * Orlando, Florida; Savannah, Georgia; and Charlotte, North Carolina, 
 * and compute the estimated area enclosed by these four cities.
 * 
 * Created by Ryan Simpson 9/24/2019
 */

public class E4_03EstimateAreas {
	public static void main(String[] args) {
		final double RADIUS = 6371.01;

		double aY = -84.3879824;
		double aX = 33.7489954;

		double oY = -81.3792364999;
		double oX = 28.5383355;

		double sY = -81.09983419999998;
		double sX = 32.0835407;

		double cY = -80.84312669999997;
		double cX = 35.2270869;

		// Get sides for two triangles
		double t1Side1 = RADIUS * Math.acos(Math.sin(Math.toRadians(aX)) * Math.sin(Math.toRadians(sX))
				+ Math.cos(Math.toRadians(aX)) * Math.cos(Math.toRadians(sX)) * Math.cos(Math.toRadians(aY - sY)));
		double t1Side2 = RADIUS * Math.acos(Math.sin(Math.toRadians(sX)) * Math.sin(Math.toRadians(cX))
				+ Math.cos(Math.toRadians(sX)) * Math.cos(Math.toRadians(cX)) * Math.cos(Math.toRadians(sY - cY)));
		double t1Side3 = RADIUS * Math.acos(Math.sin(Math.toRadians(cX)) * Math.sin(Math.toRadians(aX))
				+ Math.cos(Math.toRadians(cX)) * Math.cos(Math.toRadians(aX)) * Math.cos(Math.toRadians(cY - aY)));

		double t2Side1 = RADIUS * Math.acos(Math.sin(Math.toRadians(aX)) * Math.sin(Math.toRadians(oX))
				+ Math.cos(Math.toRadians(aX)) * Math.cos(Math.toRadians(oX)) * Math.cos(Math.toRadians(aY - oY)));
		double t2Side2 = RADIUS * Math.acos(Math.sin(Math.toRadians(oX)) * Math.sin(Math.toRadians(sX))
				+ Math.cos(Math.toRadians(oX)) * Math.cos(Math.toRadians(sX)) * Math.cos(Math.toRadians(oY - sY)));
		double t2Side3 = RADIUS * Math.acos(Math.sin(Math.toRadians(sX)) * Math.sin(Math.toRadians(aX))
				+ Math.cos(Math.toRadians(sX)) * Math.cos(Math.toRadians(aX)) * Math.cos(Math.toRadians(sY - aY)));
		
		//get area for two triangles

		double s1 = (t1Side1 + t1Side2 + t1Side3) / 2;
		double area1 = Math.pow(s1 * (s1 - t1Side1) *(s1 - t1Side2) * (s1 - t1Side3) , .5);
		

		double s2 = (t2Side1 + t2Side2 + t2Side3) / 2;
		double area2 = Math.pow(s2 * (s2 - t2Side1) *(s2 - t2Side2) * (s2 - t2Side3) , .5);
		
		double totalArea = area1 + area2;
        System.out.println("The area of the triangle is " + totalArea);
		
		

	}
}
