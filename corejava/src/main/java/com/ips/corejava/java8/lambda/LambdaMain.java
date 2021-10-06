package com.ips.corejava.java8.lambda;

public class LambdaMain {
	
	private int number;

	public static void main(String[] args) {
		LambdaMain main = new LambdaMain();

		// main.simpleLambda();

		// main.usingLambda();

		main.usageOfMethodReference();
	}

	public void usageOfMethodReference() {
		
		UsingLambda1 usingLambda1 = new UsingLambda1();
		System.out.println(usingLambda1.startTheEngine(4, 16, Integer::sum));
	} 
	
	public void usingLambda() {
		int k = 10;

		UsingLambda1 usingLambda1 = new UsingLambda1();
		System.out.println(usingLambda1.startTheEngine(5, 7, (a, b) -> a + b)); 
		
		System.out.println(usingLambda1.startTheEngine(5, 7, (a, b) -> {System.out.println(k); return a + k;}));
		
				
		
		System.out.println(usingLambda1.startTheEngine(5, 7, (a, b) -> a + number));

	}
	
	public void simpleLambda() {

		Engine1 engine1 = () -> System.out.println("Simple lambda");
		Engine2 engine2 = a -> System.out.println("Simple lambda with parameter " + a);
		/*
		 * Engine3 engine3 = (a, b) -> {
		 * System.out.println("Simpe lambda with return type"); return a + b; };
		 */

		Engine3 engine3 = (a, b) -> a+b;
		
		Engine4 eng4 = a -> a > 10;

		engine1.start();
		engine2.start(5);
		System.out.println(engine3.start(9, 6));
		System.out.println(eng4.start(5));

	}

	
}
