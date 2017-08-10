package com.java;

public class Employee {
	int id;
	String name;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	
	@Override
	protected Object clone() throws CloneNotSupportedException {
		System.out.println("Inside clone method");
		return super.clone();
	}
	@Override
	public int hashCode() {
		// TODO Auto-generated method stub
		return id * 100 * name.hashCode() * 101;
	}
	
	@Override
	public boolean equals(Object obj) {
		System.out.println("Inside equals");
		Employee emp = (Employee) obj;
		if(emp.getName().equals(this.getName())) {
			System.out.println("true!!!");
			return true;
		}
		return false;
	}
}
