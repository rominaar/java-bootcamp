package com.mycompany.app;

import java.util.Scanner;


public class App 
{
	public static void main(String[] args) {
		String username;
		Scanner in = new Scanner(System.in);
		
	   
		 System.out.print("Enter your name: ");
		 username = in.nextLine(); 
		 System.out.println("Hello "+ username + "!!");
	}
}
