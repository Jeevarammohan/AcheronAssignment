package com.shrishti.interface1;

public class Main {

	public static void main(String[] args) {
		Training t1=new Employee("Jeeva","CBE");
		t1.joinCourse();
		Sports sp1=(Sports)t1;
		sp1.showSports();
		sp1.printName();
		Details d=(Details)sp1;
		d.printDetails();
		System.out.println();
		Training t2=new Student("Jaya","POY");
		t2.joinCourse();
		Hobbies h=(Hobbies)t2;
		h.showHobbies();
		Sports sp2=(Sports)t2;
		sp2.showSports();
		sp2.printName();
		Details d2=(Details)sp2;
		d2.printDetails();
		Student s2=(Student)d2;
		s2.check();
		s2.printName();
		
		
		
//		
	}

}
