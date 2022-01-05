package org.sample;

public class Sample {

	public static void main(String[] args) {

		int a = 3098;
		int b = 4099;

		a = a + b;
		b = a - b;
		a = a - b;

		System.out.println(a);
		System.out.println(b);

	}
}
