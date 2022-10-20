package oop.basic;

import java.util.Scanner;

public class ForExamGugu {
	public static void main(String[] args) {
		MyMethod gugu = new MyMethod();
		Scanner scan = new Scanner(System.in);
		System.out.print("단:");
		int dan = scan.nextInt();
		gugu.printGuGu(dan);
		scan.close();
	}
 }
