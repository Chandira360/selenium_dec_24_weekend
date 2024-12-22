package week3.day2;

public class Iphone16 implements Camera, Display, Battery{

	@Override
	public void getBattery() {
		System.out.println("3700MAh");
	}

	@Override
	public void getDisplay() {
		System.out.println("Display size 6.1");
	}

	@Override
	public void frontCamera() {
		System.out.println("front facing camera 12MP");
	}

	@Override
	public void backCamera() {
		System.out.println("Back camera 48MP + 12MP");
	}

}
