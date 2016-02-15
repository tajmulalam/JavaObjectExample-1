package com.sumon.javapractice;

import java.util.ArrayList;
import java.util.Scanner;

public class MainStudent {

	public static void main(String[] args)  {
	
	
	Student aStudent=new Student();
	aStudent.Name="Rony";
	aStudent.Roll=101;
	aStudent.HasActive=true;
	
	ArrayList<Student> arrayList=new ArrayList<Student>();
	arrayList.add(aStudent);
	for (Student student : arrayList) {
		System.out.println(student.Name);
	}
	}

}
