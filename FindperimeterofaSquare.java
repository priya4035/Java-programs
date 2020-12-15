package com.xworkz.methodcalling;

public class FindperimeterofaSquare {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		FindperimeterofaSquare ref = new FindperimeterofaSquare();
		double result = ref.findperimeterofaSquare(5);
		System.out.println("the perimeter of a square of a radius 5 is: " + result);
	}

	double findperimeterofaSquare(int radius) {
		double perimter;
		double pi = findpi();
		perimter = 2 * pi * radius * radius;
		System.out.println("perimeter of a square is: " + perimter);
		return perimter;
	}

	double findpi() {
		double pi = 22.00 / 7.00;
		return pi;
	}
}