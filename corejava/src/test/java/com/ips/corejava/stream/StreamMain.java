package com.ips.corejava.stream;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class StreamMain {
	public static void main(String[] args){
		//applyStreamOnList(buildIntegerListt());
		//applyPredicateOnStream(buildIntegerListt());
		//getEmployeeAgeLessThan_35_AND_SalaryGreaterThan8600(buildEmployeeList());
		//updateListIfSalaryIsGreaterThan_8900(buildEmployeeList());
	}
	
	public static List<Integer> buildIntegerListt(){
		List<Integer> idList = new ArrayList<>();
		for(int i=0;i<20;i++){
			idList.add(i);
		}
		return idList;
	}
	public static List<Employee> buildEmployeeList(){
		List<Employee> empList = new ArrayList<>();
		int age = 25;
		double salary = 8500.00;
		for(int i=0;i<10;i++){
			Employee emp= new Employee(age+(i+5),"Mr X-"+i,salary+(i*100));
			empList.add(emp);
			System.out.println(emp);
		}
		
		return empList;
	}
	
	public static void updateListIfSalaryIsGreaterThan_8900(List<Employee> empList){ 
		System.out.println("Before applying map()...");
		System.out.println(empList.stream().filter(t->t.getSalary()>8900).collect(Collectors.toList()));
		System.out.println("After applying map()...");
		System.out.println(empList.stream().filter(t->t.getSalary()>8900).map(t->{t.setHighSal(true);return t;}).collect(Collectors.toList()));
	}
	
	public static void getEmployeeAgeLessThan_35_AND_SalaryGreaterThan8600(List<Employee> empList){
		System.out.println("All employees age<35 and salary>8600");
		//System.out.println(empList.stream().filter(t->t.getAge()<35).filter(t->t.getSalary()>8600).collect(Collectors.toList()));
		empList.stream().filter(t->t.getAge()<35).filter(t->t.getSalary()>8600).collect(Collectors.toList())
		.forEach(t->{System.out.print(t.getAge()+","+t.getSalary());
		System.out.println();});
	}
	
	public static void applyStreamOnList(List<Integer> ids){
		Stream<Integer> streamOfIdList = ids.stream();
		System.out.println(streamOfIdList.filter(t->t<5).collect(Collectors.toList()));
		//System.out.println(streamOfIdList.count()); // This statement will throw RuntimeException: 
		//java.lang.IllegalStateException : stream has already been operated upon or closed
		
	}
	public static void applyPredicateOnStream(List<Integer> ids){
	
		System.out.println(ids.stream().allMatch(t -> t < 19));
	}

}
