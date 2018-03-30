package com.ips.corejava.stream;

public class Employee {
	
	private int age;
	private String name;
	private Double salary;
	private boolean highSal;
	
	public Employee(int age, String name, Double salary) {
		super();
		this.age = age;
		this.name = name;
		this.salary = salary;
	}
	
	public boolean isHighSal() {
		return highSal;
	}

	public void setHighSal(boolean highSal) {
		this.highSal = highSal;
	}

	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public Double getSalary() {
		return salary;
	}
	public void setSalary(Double salary) {
		this.salary = salary;
	}

	@Override
	public String toString() {
		return "Employee [age=" + age + ", name=" + name + ", salary=" + salary + ", highSal=" + highSal + "]";
	}
	
	

}
