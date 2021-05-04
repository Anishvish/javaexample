package com.example.javaSample.oops;

public class ThisKeywordExample2 {
	public static void main(String... args) {
		Student st = new Student(1, "Anish", "java");
		Student st2 = new Student(1, "Anish", "java", 1600f);

		st.display();
		st2.display();
		
		st.m();

	}
}

class Student {
	int rollNo;
	String name, course;
	float fee;

	public Student(int rollNo, String name, String course) {
		this.rollNo = rollNo;
		this.name = name;
		this.course = course;

	}

	public Student(int rollNo, String name, String course, float fee) {
		this(rollNo, name, course); // reusing constructor
		this.fee = fee;

//		this(rollNo, name, course); // C T Error

	}

	void display() {
		System.out.println(rollNo + " " + name + " " + course + " " + fee);
	}

	void p(Object p) {
		System.out.println("Object is printed = " + p.toString());
	}

	// 4) this: to pass as an argument in the method
	void m() {
		p(this);
	}
}
