package com.java;

import java.util.ArrayList;
import java.util.List;

public class InnerClassConcept {
	private int a = 10;
	private int b =20;
	
	public class InnerClass {
		int c = 30;
		int d = 40;
		public void printValues() {
			System.out.println("a: " + a + " b: " + b + " c: " + c + " d: " + d);
		}
	}
	
	public static class StaticInnerClass {
		int c = 30;
		int d = 40;
		public void printValues() {
			System.out.println(" c: " + c + " d: " + d);
		}
	}
	
	public void outerClassMethod() {
		InnerClass innerClass = new InnerClass();
		innerClass.printValues();
		System.out.println("a : " + a + " b: " + b + " c: " + innerClass.c + " d: " + innerClass.d);
	}
	public static void main(String[] args) {
		/*InnerClassConcept parentClass = new InnerClassConcept();
		parentClass.outerClassMethod();
		
		InnerClass innerClass1 =  parentClass.new InnerClass();
		new InnerClassConcept.StaticInnerClass();
		
		List list = new ArrayList<String>();*/
		Employee emp1 = new Employee();
		emp1.setId(1);
		emp1.setName("Amogh");
		Employee emp2 = new Employee();
		emp2.setId(1);
		emp2.setName("Amogh");
		List<Employee> emplist = new ArrayList<Employee>();
		emplist.add(emp1);
		emplist.add(emp2);
		emplist.contains(emp1);
		
		
		System.out.println("Size of list " + emplist.size());
		
		
	}

}
