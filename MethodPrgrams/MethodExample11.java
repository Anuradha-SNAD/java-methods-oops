package org.snad.methods;

import java.util.Scanner;

public class MethodExample11 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println(" 1.Team Lead ");
		System.out.println(" 2.Employee ");
		int a = sc.nextInt();
		
		switch(a) {
		case 1 : {
			teamLead();
			break;
		}
		case 2:{
			System.out.println("1.Prasad");
			System.out.println("2.Sai");
			System.out.println("3.Anu");
			int n = sc.nextInt();
			switch(n){
				case 1 : {
					prasad();
					break;
				}
				case 2 : {
					sai();
					break;
				}
				case 3 : {
					anu();
					break;
				}
				default :{
					System.out.println("No Employee Found !");
				}
			}
			break;
		}
		default :{
			System.out.println("No Member Found");
		}
		}
		
	}

	public static void teamLead() {
		System.out.println("Project Status : Completed");
	}

	public static void prasad() {
		System.out.println("I Given Task to Sai...From Prasad");
		sai();
	}

	public static void sai() {
		System.out.println("I Given Task to Anu...From Sai");
		anu();
	}

	public static void anu() {
		System.out.println("Project Status : Pending...From Anu");
	}

}
