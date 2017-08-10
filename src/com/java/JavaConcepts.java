package com.java;

import java.util.Arrays;
import java.util.List;

public class JavaConcepts extends Thread implements Runnable{
	public static void main(String[] args) throws InterruptedException, CloneNotSupportedException, ClassNotFoundException {/*
	
		Map<Integer, Integer> map = new HashMap<>();
		try {
			int a=10;
			//System.out.println(a/0);
		}
		finally {
			System.out.println("finally!!!!    ");
		}
		ExecutorService executorService = Executors.newFixedThreadPool(10);
		executorService.submit(new Runnable() {
			
			@Override
			public void run() {
				System.out.println("Hello!!");// TODO Auto-generated method stub
			}
		});
	*/
		/*String str = new String("Test");
		String str1 = "Test";
		System.out.println(str == str1);
		System.out.println(str.equals(str1));
		JavaConcepts javaConcepts  = new JavaConcepts();*/
		/*int i = javaConcepts.check();
		System.out.println(i);*/
		
		/*StringBuffer sb = new StringBuffer("a");
		sb.append("1234567891234567");
		System.out.println(sb.length());
		System.out.println(sb.capacity());*/
		
		/*Parent parent = new Child();
		
		System.out.println(10 ^ 4);
		
		int [] array1 = {1,3,5,7,9};
		int [] array2 = new int[5];
		int j=0;
		for(int i = array1.length -1; i>= 0; i--) {
			array2[j]=array1[i];
			j++;
		}
		for(int k = 0 ; k < array2.length;k++) {
			System.out.print(array2[k]);
		}*/
		/*int searchItem = 3;
		int [] arr1 = {1,2,3,4,5,6,7,8,9};
		int low = 0 ;
		int high = arr1.length -1;
		int mid =( high - low )/2;
		if(searchItem < arr1[mid]) {
			high = mid -1;
			mid = (high - low)/2; 
			
		}*/
		/*String searchIt = "WTG";
		String str11 = "WelcomeGeek WelcomeToGeeksForGeeks GeeksForGeeks";
		String [] strArray = str11.split(" ");
		for(int i = 0 ; i < strArray.length ; i++) {
			String s = "";
			for(int j = 0; j < strArray[i].length(); j++) {
				if(Character.isUpperCase(strArray[i].charAt(j))) {
					s = s + strArray[i].charAt(j);
				}
			}
			System.out.println(" caps string " + s);
			if(s.contains(searchIt)) {
				System.out.println("present!!!" + strArray[i]);
				break;
			}
		}*/
		/*System.out.println(JavaConcepts.class.getClassLoader());
		
		int[] ints = {-9, 14, 37, 102};
		
		for(int i = 0 ; i < ints.length; i++){
		    if(ints[i] == 102){
		        System.out.println(true);
		    }
		    else{
		        System.out.println(false);
		    }
		}	*/
		int[] grades = {73,67, 38, 33};
		int[] result = solve(grades);
		for(int grade : grades) {
			System.out.println(grade);
		}
		Class.forName("String1");
		Employee employee = new Employee();
		System.out.println(employee.getName());
		//System.out.println(employee.clone());
	}
	int check() throws InterruptedException {
		wait();
		try {
			//throw new IOException();
			System.out.println("try block");
			return 1;
		}
		catch(Exception ex) {
			System.out.println("catch");
			return 2;
		}
		finally {
			System.exit(0);
			System.out.println("finally returning");
			return 3;
		}
	}
	
	static int[] solve(int[] grades){
        int i = 0;
        int[] result1 = new int[grades.length];
        for(int grade : grades){
            if(grade < 40){
                result1[i] = grade;
            }
            else{
                int tens = grade/10;
                int units = grade%10;
                if(units < 5){
                    if(((tens*10+5) - grade) < 3){
                        result1[i] = tens*10+5;
                    }
                    else{
                        result1[i] = grade;
                    }
                }
                else{
                    if(((tens*10+10) - grade) < 3){
                        result1[i] = tens*10+10;
                        System.out.println("result " + result1[i]);
                    }
                    else{
                        result1[i] = grade;
                    }
                }
                
            }
            i++;
        }
        return result1;
    }
}
