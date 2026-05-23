package org.snad.oops;

public class StudentDriver {
	public static void main(String[] args) {
		Student student1 = new Student(2,"Radha","Python-FullStack",20500); //using constructor
		Student student2 = new Student(1,"Anu","Java-FullStack",20000);
		Student student3 = new Student(3,"Ram","Devops",25000);
		//using getter and setter
//		student.setId(1);
//		student.setName("Ram");
//		student.setCourse("Java-FullStack");
//		student.setFee(20000);
//		
//		System.out.println("Id : "+student.getId());
//		System.out.println("Name : "+student.getName());
//		System.out.println("Course : "+student.getCourse());
//		System.out.println("Fee : "+student.getFee());
		
		System.out.println(student1);
		System.out.println(student2);
		System.out.println(student3);
	}

}
