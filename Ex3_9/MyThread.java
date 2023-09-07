package com.bptn.course.week3.Ex3_9;

import java.util.ArrayList;
import java.util.List;

public class MyThread extends Thread {

	// Declare an instance variable of type List<Integer>
	String name;
	List<Integer> list;

// Create a parameterized constructor.

	public MyThread(String name, List<Integer> list) {
		super(name);
//		this.name = name;
		this.list = new ArrayList<Integer>(list);
	}

	@Override
	public void run() {
		// TODO Auto-generated method stub
		super.run();
		ListUtils.insertNextId(list);

	}

	// Override the run() method here.

}
