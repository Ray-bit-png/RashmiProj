package com.rr.Service;

import com.rr.entity.Student;

public class Example extends Student {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("hiiiii");
		System.out.println("run");
		Student s=new Student();
		s.setId(123);
		s.setName("rashmi");
		s.setGmail("rashmi@gmail.com");
		s.setAccount("123445353");
		s.setFatherName("pravakar");
		System.out.println(s.getId());
		System.out.println(s.getName());
		System.out.println(s.getAccount());
		System.out.println(s.getFatherName());
		System.out.println(s.getGmail());
		

	}

}
