package com.vn.main;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

import com.vn.model.Course;
import com.vn.model.Student;
import com.vn.utils.FileUtils;

public class CourseManagement {

	static final String COURSE_FILE = "course.dat";
	static List<Course> listCourse = (List<Course>) FileUtils.readFile(COURSE_FILE);

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		while (true) {
			menu();
			System.out.println("Please enter your's choose: ");

			int chooise = scanner.nextInt();
			switch (chooise) {
			case 1:
				inputData();
				displayCourse();
				break;
			case 2:
				saveToFile();
				break;
			case 3:
				sortData();
				break;
			case 4:
				searhCourseByStudentId();
				break;
			case 5:
				removeCourseById();
				break;
			case 6:
				getRankCourse();
				break;
			case 7:
				System.out.println("System exit");
				System.exit(0);
				break;
			default:
				break;
			}
		}
	}

	private static void displayCourse() {
		for (Course course : listCourse) {
			System.out.print(course);
		}
	}

	private static void getRankCourse() {
		// TODO Auto-generated method stub

	}

	private static void removeCourseById() {
		Scanner scanner = new Scanner(System.in);

		System.out.println("Enter course id: ");
		String courseId = scanner.nextLine();

		listCourse.removeIf(c -> {
			return c.getId().equals(courseId);
		});

//		for (Course course : listCourse) {
//			if(course.getId().equals(courseId)) {
//				listCourse.remove(course);
//			}
//		}

	}

	private static void searhCourseByStudentId() {
		Scanner scanner = new Scanner(System.in);

		System.out.println("Enter student id: ");
		String studentId = scanner.nextLine();

		List<Course> ofStudemt = listCourse.stream().filter(c -> {

			for (Student s : c.getStudents()) {
				return s.getId().equals(studentId);
			}
			return false;

		}).collect(Collectors.toList());

		System.out.println(ofStudemt);
	}

	private static void sortData() {
		// TODO Auto-generated method stub

	}

	private static void saveToFile() {
		try {
			FileUtils.writeFile(COURSE_FILE, listCourse);
		} catch (IOException e) {
			System.err.println(e.getMessage());
			e.printStackTrace();
		}
	}

	private static void inputData() {
		Scanner scanner = new Scanner(System.in);
		Course course = new Course();

		System.out.println("Enter couse id: ");
		course.setId(scanner.nextLine());

		System.out.println("Enter couse title: ");
		course.setTitle(scanner.nextLine());

		System.out.println("Enter couse credit: ");
		course.setCredit(scanner.nextDouble());

		System.out.println("Enter couse enrollment: ");
		course.setEnrollment(scanner.nextInt());

		String anw = null;
		do {
			Student student = new Student();
			scanner = new Scanner(System.in);
			System.out.println("Enter student id: ");
			student.setId(scanner.nextLine());

			System.out.println("Enter student name: ");
			student.setName(scanner.nextLine());

			System.out.println("Enter student phone: ");
			student.setPhone(scanner.nextLine());

			System.out.println("Enter student gender: ");
			student.setGender(scanner.nextLine());

			System.out.println("Enter student gpa: ");
			student.setGpa(scanner.nextDouble());

			course.getStudents().add(student);

			System.out.println("Do u want continue Y/N");
			scanner = new Scanner(System.in);
			anw = scanner.nextLine();
		} while (anw.equalsIgnoreCase("y"));

		listCourse.add(course);
	}

	public static void menu() {
		System.out.println("1. Write a method to enter Course data");
		System.out.println("2. Save file course.dat");
		System.out.println("3 sort course by id ");
		System.out.println("4. search for courses by student id.");
		System.out.println("5. remove a course byu id");
		System.out.println("6. get the ranking of all the courses");
		System.out.println("7. Exit");

	}

}
