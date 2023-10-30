
package com.programmes;

public class IQ_1_CI_SecondLargestOddInString {
	
	    public static void main(String[] args) {
	        String input = "(532),(g38@);";
	        int largestOdd = Integer.MIN_VALUE;
	        int secondLargestOdd = Integer.MIN_VALUE;

	        for (int i = 0; i < input.length(); i++) {
	            char currentChar = input.charAt(i);
	            if (isDigit(currentChar)) {
	                int currentNumber = charToInt(currentChar);
	                if (currentNumber % 2 != 0) {
	                    if (currentNumber > largestOdd) {
	                        secondLargestOdd = largestOdd;
	                        largestOdd = currentNumber;
	                    } else if (currentNumber > secondLargestOdd && currentNumber < largestOdd) {
	                        secondLargestOdd = currentNumber;
	                    }
	                }
	            }
	        }

	        if (secondLargestOdd == Integer.MIN_VALUE) {
	            System.out.println("No second largest odd number found.");
	        } else {
	            System.out.println("The second largest odd number is: " + secondLargestOdd);
	        }
	    }

	    // Custom method to check if a character is a digit
	    public static boolean isDigit(char c) {
	        return c >= '0' && c <= '9';
	    }

	    // Custom method to convert a character to an integer
	    public static int charToInt(char c) {
	        return c - '0';
	    }
	}
