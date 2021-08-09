/*
Compute the volume of a cylinder #3

area = radius * radius * Pi
volume = area * length

Sample run:
in:// 5.5 12
out:// area is 95.0331
volume is 1140.4
*/

import java.util.Scanner;


public class CylinderVolume {
	public static void main (String[] args) {
		double area;
		double volume;
		
		Scanner scRadius = new Scanner(System.in);
		Scanner scLength = new Scanner(System.in);
		
		System.out.println("To compute the volume of a cylinder please input:");
		System.out.print("radius of a cylinder: ");
		double radius = scRadius.nextDouble();
		System.out.print("length of a cylinder: ");
		double length = scLength.nextDouble();
		area = radius*radius * 3.14;
		volume = area * length;
		System.out.println("The area of a cylinder is: " + area);
		System.out.println("The volume of a cylinder is: " + volume);
	}
}