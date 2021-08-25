package week3.day2.Assignment;

import week3.day1.classroom.Calculator;

public   class Desktop extends Calculator implements HardWare ,Software {
	public void desktopModel() {
		// TODO Auto-generated method stub
System.out.println("This is desktop Model:");
	}

	public void hardwareResources() {
		// TODO Auto-generated method stub
		System.out.println("This is Hardware Resources");
	}

	public void softwareResources() {
		// TODO Auto-generated method stub
		System.out.println("This is Software Resources");
	}
	public static void main(String[] args) {
		System.out.println("2 Interface and archieve multiple inheritance.");
		Desktop desktop1 = new Desktop();
		System.out.println("-----------Result through Class implements interface-------------");
		desktop1.desktopModel();
		desktop1.hardwareResources();
		desktop1.softwareResources();
		System.out.println("=====================Result through Class extends class======================");
		desktop1.add(25, 99);   
		desktop1.add(58, 96, 88);
		desktop1.divide(568.25, 58);
		desktop1.multiply(52, 859.25);
		
	}
}
//ABSTRACT CLASS
//Assignment 1:
//     Interface :HardWare
//     Methods   :hardwareResources()
//
//     Interface :Software
//     Methods   :softwareResources()
//
//     Class     :Desktop
//     Methods   :desktopModel()
//
//Description:
//create 2 Interface and archieve multiple inheritance.
