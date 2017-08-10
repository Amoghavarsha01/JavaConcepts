package com.java;

import java.lang.reflect.Method;
import java.lang.reflect.Parameter;

public class Reflections {

	public static void main(String[] args) {
		Class<String> clz = String.class;
		for (Method m : clz.getDeclaredMethods()) {
		   System.out.println(m.getName());
		   for (Parameter p : m.getParameters()) {
		      System.out.println("  " + p.getName());
		   }
		}

	}

}
