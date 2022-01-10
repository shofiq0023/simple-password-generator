package com.test;

import java.util.Random;
import java.util.Scanner;

public class Main {
	static Random rand = new Random();
	
	public static void main(String[] args) throws InterruptedException {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("== Password generation ==");
		Thread.sleep(1000);
		System.out.print("password length => ");
		int passlen = sc.nextInt();
		sc.close();
		
		System.out.print("==> ");
		Thread.sleep(500);
		for(int i = 0; i < passlen; i++) {
			Thread.sleep(50);
			System.out.print(passGen());
		}
	}
	
	public static String passGen() {
		String salt = "ABCDEFGHIJKLMNOPWXYZabcdefghijklmnopwxyz1234567890!@#$%^&*()_+-=";
		String[] ch = salt.split("");
		return ch[rand.nextInt(ch.length)];
	}

}
