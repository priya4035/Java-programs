package com.xworkz.methodcalling;

public class FindperimeterofaEllipse {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		FindperimeterofaEllipse ref = new FindperimeterofaEllipse();
		double result = ref.findperimeterofaEllipse(5,3);
		System.out.println("the perimeter of a square of a radius 5 is: " + result);
	}

	double findperimeterofaEllipse(int radius1, int radius2) {
		double perimter;
		double pi = findpi();
		perimter =  pi * radius1 *radius2;
		System.out.println("perimeter of a square is: " + perimter);
		return perimter;
	}

	double findpi() {
		double pi = 22.00 / 7.00;
		return pi;

	}

}
