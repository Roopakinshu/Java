package com.programmes;

import java.util.Scanner;

public class IQ_3_withoutinbuilt {

	public static void main(String[] args) {

		int vowels = 0, consonants = 0;
		Scanner sc = new Scanner(System.in);
		System.out.println("enter any string");
		String str = sc.nextLine();
		String str1="";

		for (int i = 0; i < str.length(); i++)

		{
			char ch = str.charAt(i);

			if(!(ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u' || ch == 'A' || ch == 'E' || ch == 'I' || ch == 'O' || ch == 'U'))
			{
				str1=str1+ch;
			}
		}
		System.out.println(str1);
	}
}
