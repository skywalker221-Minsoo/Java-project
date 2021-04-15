package com.mega.mvc37.test;

public class TV {
	int size;
	String color;
	
	public TV(int size, String color) {
		super();
		this.size = size;
		this.color = color;
	}

	@Override
	public String toString() {
		return "TV [size=" + size + ", color=" + color + "]";
	}
	
}
