package com.ips.corejava.lambda;

public class CommandExecutor {
	
	public void executeCommand(Order order,CommandService commandService){
		commandService.execute(order);
	}
	
	public String executeCommand(String command,CommandService_1 commandServ1){
		return commandServ1.execute(command);
	}

}
