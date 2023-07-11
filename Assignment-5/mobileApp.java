package practice;

import java.util.Scanner;

public class MobileApp {
	public static void main(String[] args)
	{
	Scanner scan=new Scanner(System.in);
	
	   System.out.println("enter cost");
	    int cost=scan.nextInt();
	    System.out.println("enter storage");
		int storage=scan.nextInt();
		System.out.println("enter ram");
		int ram=scan.nextInt();
		System.out.println("enter camera size");
		float camera=scan.nextFloat();
		
		System.out.println("enter buttons");
		int buttons=scan.nextInt();
		System.out.println("enter brand name");
		String brand=scan.next();
		System.out.println("enter colour");
		String  colour=scan.next();
		System.out.println("enter os");
		String os=scan.next();
		System.out.println("enter sim");
		String  sim=scan.next();
		System.out.println("enter sensor");
		String sensor=scan.next();
		
		Mobile m=new Mobile(cost,storage,ram,camera,buttons,brand,colour,os,sim,sensor);
		System.out.println(m.cost+" "+storage+" "+ram+" "+camera+" "+buttons+" "+brand+" "+colour+" "+os+" "+sim+" "+sensor+" ");
		m.call();
		m.whatsApp();
		
	}
}

