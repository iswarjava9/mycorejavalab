package com.ips.corejava.lambda;

@FunctionalInterface
public interface CommandService {

	public void execute(Order order);
	
}
