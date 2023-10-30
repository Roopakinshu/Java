package com.programmes;

	import java.util.Scanner;
	public class IQ_1_Second_Largest_no_string {
	    public static void secondlarge(char[] arr,int arr_size) {
	        int i,first,second;
	        first = second = Integer.MIN_VALUE;
	        for(i = 0 ; i < arr_size ; i++) {
	            if (arr[i] > first) {
	                second =first;
	                first= arr[i];
	            }
	            else if (arr[i] > second && arr[i] != first)
	                second = arr[i];
	        }
	        if (second == Integer.MIN_VALUE)    
	            System.out.println("There is no second largest element\n"); 
	        else
	            System.out.println("The second largest element is "+second); 
	    }
	    public static void main(String[] args)  { 

	        Scanner scan = new Scanner(System.in);
	        System.out.print("Enter the String ");
	        String userString = scan.nextLine();
	        char[] stringToCharArray = userString.toCharArray();

	        int n = stringToCharArray.length;
	        secondlarge(stringToCharArray, n);
	    }           
	}



