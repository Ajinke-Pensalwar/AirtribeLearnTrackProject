package com.airtribe.learntrack;

import java.util.Scanner;
import com.airtribe.learntrack.service.StudentService;

public class Main {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        StudentService service = new StudentService();

        while (true) {
            System.out.println("\n1. Add Student");
            System.out.println("2. View Students");
            System.out.println("3. Exit");

            int choice = sc.nextInt();

            switch (choice) {

                case 1:
                    System.out.println("Enter First Name:");
                    String fname = sc.next();

                    System.out.println("Enter Last Name:");
                    String lname = sc.next();

                    System.out.println("Enter Email:");
                    String email = sc.next();

                    System.out.println("Enter Batch:");
                    String batch = sc.next();

                    service.addStudent(fname, lname, email, batch);
                    break;

                case 2:
                    service.viewStudents();
                    break;

                case 3:
                    System.exit(0);

                default:
                    System.out.println("Invalid choice");
            }
        }
    }
}