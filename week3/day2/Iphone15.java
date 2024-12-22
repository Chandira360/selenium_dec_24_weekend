package week3.day2;

public class Iphone15 implements Camera, Display, Battery{

	@Override
	public void getBattery() {
		System.out.println("3458MAh");
	}

	@Override
	public void getDisplay() {
		System.out.println("Display size 6.0");
	}

	@Override
	public void frontCamera() {
		System.out.println("front facing camera 10MP");
	}

	@Override
	public void backCamera() {
		System.out.println("Back camera 48MP + 10MP");
	}

}
