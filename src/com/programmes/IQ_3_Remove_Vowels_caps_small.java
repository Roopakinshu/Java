package com.programmes;

public class IQ_3_Remove_Vowels_caps_small {
	
	    public static void main(String[] args) {
	        String input = "This is a Sample String with Vowels like AEIOU and more!";
	        String result = removeVowels(input);
	        System.out.println("String after removing vowels: " + result);
	    }

	    public static String removeVowels(String input) {
	        // Use regular expression to remove both uppercase and lowercase vowels
	        String result = input.replaceAll("[aeiouAEIOU]", "");
	        return result;
	    }
	}


