package com.sam;
/*
        Calculate Circle Area using Java Example
        This Calculate Circle Area using Java Example shows how to calculate
        area of circle using it's radius.
*/ 
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class CalculateAreaOfCircle 
{
	public static void main(String [] args) 
	{
		int radius = 0;
		System.out.println("Please enter radius of a circle");
		try
		{
			BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
			radius = Integer.parseInt(br.readLine());
		}		
		catch(NumberFormatException ex)
		{
			System.out.println("Invalid radius value" + ex);
			System.exit(0);
		}
		catch(IOException ioe)
		{
			System.out.println("IO Error :" + ioe);
			System.exit(0);
		}		
		double area = Math.PI * radius * radius;
		System.out.println("Area of a circle is " + area);
	 }
}