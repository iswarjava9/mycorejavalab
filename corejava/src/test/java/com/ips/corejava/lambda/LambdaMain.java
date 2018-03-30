package com.ips.corejava.lambda;

public class LambdaMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		lambdaWithArgs();
		//lamdaWithReturn();
		//lambdaExpressionAsObject();
	}
	
	public static void lambdaWithArgs(){
		CommandExecutor ex = new CommandExecutor();
		Order order1 = new Order(1,"Grocery items");
		ex.executeCommand(order1,(t) -> {
			System.out.println(" Order id is :-  "+ t.getOrderId());
			System.out.println(" Order desc is :- "+t.getDesc());
			doPrint();
		});
	}
	
	public static void lamdaWithReturn(){
		CommandExecutor ex = new CommandExecutor();
		System.out.println(ex.executeCommand("Create Order", (t) -> {return t+" command executed";}));
	}
	
	public static void lambdaExpressionAsObject(){
		CommandService_1 commandServ1 =(t) -> {return t+" command executed ";};
		System.out.println(commandServ1.execute("Payment Received "));
	}
	
	private static void doPrint(){
		System.out.println("Printing is done ---------");
	}

}
