package com.example.javaSample.misc;

public class CallByValueExample {

	int data = 50;

	void change(int data) {
		data = data + 50;
	}
	
	
	void change(CallByValueExample c) {
		c.data = c.data+40;
	}

	public static void main(String[] args) {
		CallByValueExample cbv = new CallByValueExample();

		System.out.println(cbv.data);

		System.out.println("After");

		cbv.change(500);

		System.out.println(cbv.data);
		
		cbv.change(cbv);
		
		System.out.println(cbv.data);
	}

}
