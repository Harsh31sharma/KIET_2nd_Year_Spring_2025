package com.kiet;

import org.springframework.context.annotation.Lazy;
import org.springframework.stereotype.Component;

@Component
@Lazy
public class Rectangle implements Shape  {
	private int length;
	private int breath;

	public Rectangle() {
		super();
		System.out.println("Rectangle Object Created ");
		// TODO Auto-generated constructor stub
	}

	public Rectangle(int length, int breath) {
		super();
		System.out.println("Rectangle Object Created ");
		this.length = length;
		this.breath = breath;
	}

	public int getLength() {
		return length;
	}

	public void setLength(int length) {
		this.length = length;
	}

	public int getBreath() {
		return breath;
	}

	public void setBreath(int breath) {
		this.breath = breath;
	}

	@Override
	public String toString() {
		return "Rectangle [length=" + length + ", breath=" + breath + "]";
	}

}
