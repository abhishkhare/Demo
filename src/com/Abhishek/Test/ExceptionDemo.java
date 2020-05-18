package com.Abhishek.Test;

public class ExceptionDemo {

	public static void main(String[] args) {

		try {
			int a[] = new int[6];
			int i = 7;
			int j = 2;
			int k = i / j;
			System.out.println("Output is " + k);
		} catch (ArithmeticException e) {
			System.out.println("Cannot divide by 0");

		}

		catch (ArrayIndexOutOfBoundsException e) {
			System.out.println("Stay in Array Limit");
		}

		finally {
			System.out.println("Bye");// Will execute irrespective of error in try block
		}

	}

}