package com.java;

import java.util.Arrays;

public class TwoArraySpiral {

	public static void main(String[] args) {
		int[][] arr = {{1,2,3,4},{5,6,7,8},{9,10,11,12},{13,14,15,16}};
		//1. 1st row all the elements should be displayed (i = 0 )
		//
		/*for(int i=0; i < arr.length; i++) {
			for(int j=0;j < arr[i].length;j++) {
				if(i==0) {
					System.out.println(arr[i][j]);
				}
				else {
					if(i > 0 && i < (arr.length ) ){
						System.out.println(arr[i][arr[i].length - 1]);
					}
				}
				
			}
		}*/
		
		/*int a = 00;
		int count = 0;
		if(a==0) {
			count++;
		}
		while(a != 0 ) {
			System.out.println(a);
			if(a%10 == 0) {
				count++;
			}
			a=a/10;
			
		}
		System.out.println(count);*/
		
		/*int[] arr1 = {1,2,3,4,5};
		int numOfTriplets= 0;
		for (int i = 0; i < arr1.length-2; i++)
		{
		    for (int j = i+1; j < arr1.length-1; j++)
		    {
		        for (int k = j+1; k < arr1.length; k++)
		        {
		            // output the triplet arr[i], arr[j], arr[k]
		            System.out.println(arr1[i] + " " + arr1[j] + " " + arr1[k]);
		            ++numOfTriplets;
		        }
		    }
		}
		System.out.println(numOfTriplets);*/
		
		int[] arr2 = {2,10,3,4};
		Arrays.sort(arr2);
		int sum = 0 ;
		for(int i = arr2[0] ; i <= arr2[arr2.length - 1]; i++) {
			sum = sum + i;
		}
		System.out.println(sum);

	}

}
