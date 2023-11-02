package com.camerarental.main;

import java.util.ArrayList;
import java.util.Scanner;

import com.camerarental.entity.Camera;
import com.camerarental.menu.Menu;
import com.camerarental.validate.Validate;

public class Main {
	
	public static ArrayList<Camera> cameras = new ArrayList<>();


	public static void main(String[] args) {	

		Scanner sc = new Scanner(System.in);
		Validate validate = new Validate();
		Menu menu = new Menu();
		
		cameras.add(new Camera(1, "Canon", "5518", 10000.0f, "Available"));
		cameras.add(new Camera(2, "Nikon", "D7500", 15000.0f, "Available"));
		cameras.add(new Camera(3, "Sony", "DSLR12", 20000.0f, "Available"));
		cameras.add(new Camera(4, "LG", "L123", 25000.0f, "Available"));

		
		System.out.println("+--------------------------------+");
		System.out.println("|  WELCOME TO CAMERA RENTAL APP  |");
		System.out.println("+--------------------------------+");

		while(true) {
			System.out.println("PLEASE LOGIN TO CONTINUE -");
			System.out.println("USERNAME - ");
			String username = sc.next();
			System.out.println("PASSWORD - ");
			String password = sc.next();
			boolean isValidUser = validate.validateUser(username, password);

			if(isValidUser) {
				menu.menu();
				break;
			}
			else { 
				System.out.println("YOU HAVE ENTERED WRONG CREDENTIALS!!");

			}
		}
	}
}
