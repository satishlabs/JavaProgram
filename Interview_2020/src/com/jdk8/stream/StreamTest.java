package com.jdk8.stream;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import java.util.stream.Collectors;
import java.util.stream.Stream;

/*
1.Get student with exact match name "jayesh"
2.Get student with matching address "1235"
3.Get all student having mobile numbers 3333.
4.Get all student having mobile number 1233 and 1234
5.Create a List<Student> from the List<TempStudent>
6.Convert List<Student> to List<String> of student name
7.Convert List<students> to String
8.Change the case of List<String>
9.Sort List<String>
10.Conditionally apply Filter condition, say if flag is enabled then.
 */

//                      String result1 = stud2.stream().map(std -> std.getName()).collect(Collectors.joining(",", "[", "]"));



public class StreamTest {
	public static void main(String[] args) {
		Student student1 = new Student("jayesh", 20, new Address("1235"), Arrays.asList(new MobileNumber("1234"),new MobileNumber("1234")));
		Student student2 = new Student("Satish", 33, new Address("1235"), Arrays.asList(new MobileNumber("1111"),new MobileNumber("3333"),new MobileNumber("1233")));
		Student student3 = new Student("MsDhoni", 37, new Address("835103"), Arrays.asList(new MobileNumber("3333"),new MobileNumber("4444")));

		List<Student> students = Arrays.asList(student1,student2,student3);

		/*****************************************************
        1. Get student with exact match name "jayesh"
		 *****************************************************/
		Optional<Student> stud = students.stream().filter(name ->name.getName().equals("jayesh")).findFirst();
		System.out.println(stud.isPresent() ? stud.get().getName() : "No Student Found");
		System.out.println("--------------------");

		/*****************************************************
        Get student with matching address "1235"
		 *****************************************************/
		Optional<Student> stud1 = students.stream().filter(address -> address.getAddress().getZipcode().equals("1235")).findFirst();
		System.out.println(stud1.isPresent() ? stud1.get().getAddress() : "No address found!");
		System.out.println("--------------------");


		//            .filter(student111 -> student111.getMobileNumbers().stream().anyMatch(x -> Objects.equals(x.getNumber(), "3333")))

		/*****************************************************
        Get all student having mobile numbers 3333.
		 *****************************************************/

		List<Student> stud2 = students.stream()
				.filter(student111 -> student111.getMobileNumbers().stream().anyMatch(x -> Objects.equals(x.getNumber(), "3333")))
				.collect(Collectors.toList());

		String result1 = stud2.stream().map(std -> std.getName()).collect(Collectors.joining(",", "[", "]"));
		System.out.println(result1);
		System.out.println("--------------------");

		/*****************************************************
        Get all student having mobile number 1233 and 1234
		 *****************************************************/
		List<Student> stud3 = students.stream()
				.filter(student -> student.getMobileNumbers().stream().allMatch(x -> Objects.equals(x.getNumber(), "1233") || Objects.equals(x.getNumber(), "1234")))
				.collect(Collectors.toList());

		String result4 = stud3.stream().map(std -> std.getName()).collect(Collectors.joining(",", "[", "]"));
		System.out.println(result4);
		System.out.println("--------------------");
		/*****************************************************
        Create a List<Student> from the List<TempStudent>
		 *****************************************************/

		TempStudent tmpStud1 = new TempStudent("Virat", 33, new Address("12331"), Arrays.asList(new MobileNumber("12341")));
		TempStudent tmpStud2 = new TempStudent("Sachin", 30, new Address("12351"), Arrays.asList(new MobileNumber("11111"),new MobileNumber("33331"),new MobileNumber("12331")));

		List<TempStudent> tmpStudents = Arrays.asList(tmpStud1,tmpStud2);
		List<Student> studentList = tmpStudents.stream()
				.map(tmpStud -> new Student(tmpStud.name, tmpStud.age, tmpStud.address, tmpStud.mobileNumbers))
				.collect(Collectors.toList());
		System.out.println(studentList);
		System.out.println("--------------------");


		/*****************************************************
        Convert List<Student> to List<String> of student name
		 *****************************************************/
		List<String> studentsName = studentList.stream().map(Student :: getName).collect(Collectors.toList());
		System.out.println(studentsName.stream().collect(Collectors.joining(",")));
		System.out.println(studentsName.stream().collect(Collectors.joining(",","[","]")));
		System.out.println("--------------------");

		/*****************************************************
	         Convert List<students> to String
		 *****************************************************/
		List<String> nameList = Arrays.asList("Jayesh","Satish","MsDhoni","Sachin","Rohit");
		nameList.stream().map(String :: toUpperCase).forEach(System.out::println);
		System.out.println("--------------------");

		/*****************************************************
        Sort List<String>
		 *****************************************************/
		List<String> namesList = Arrays.asList("Jayesh","Satish","MsDhoni","Sachin","Rohit");
		namesList.stream().sorted().forEach(System.out::println);
		System.out.println("--------------------");

		/*****************************************************
         Conditionally apply Filter condition, say if flag is enabled then
		 *****************************************************/
		//            conditionalFilterResult = conditionalFilterResult.sorted(Comparator.comparing(Student::getName));

		boolean sortConditionFlag = true;
		Stream<Student> conditionalFilterResult = students.stream().filter(std -> std.getName().startsWith("s"));
		if(sortConditionFlag) {
			conditionalFilterResult = conditionalFilterResult.sorted(Comparator.comparing(Student::getName));
		}
		System.out.println("Before sorting :");
		students.forEach(s -> System.out.println(s.getName()));


		List<Student> list = conditionalFilterResult.collect(Collectors.toList());
		System.out.println("After filter and conditional sorting :");
		list.forEach(s -> System.out.println(s.getName()));
















	}
}
