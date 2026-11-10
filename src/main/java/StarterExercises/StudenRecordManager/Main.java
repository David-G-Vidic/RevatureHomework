package StarterExercises.StudenRecordManager;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class Main {
    //declare class-wide variables
    private static Student bob = new Student("Bob", 5);
    private static Student dan = new Student("Dan", 2);
    private static Student ben = new Student("Ben", 4);
    private static Student ant = new Student("Ant", 3);
    private static Student ema = new Student("Ema", 4);
    private static Student jef = new Student("Jef", 1);
    private static ArrayList<Student> studentArrayList = new ArrayList<>();
    private static Scanner scan = new Scanner(System.in);

    public static void main(String[] args) {
        //create students

        studentArrayList.add(bob);
        studentArrayList.addAll(Arrays.asList(dan,ben,ant,ema,jef));
        System.out.println(studentArrayList);

        System.out.println("\nWelcome to the student directory. \n");

        boolean loop = true;
        while (loop){
            System.out.println("Choose your action.");
            System.out.println("options: add, remove, list, find, avg, quit");
            try {
                String input = scan.nextLine();
                switch (input.toLowerCase()) {
                    case "add":
                        add();
                        break;
                    case "remove":
                        remove();
                        break;
                    case "list":
                        list();
                        break;
                    case "find":
                        find();
                        break;
                    case "avg":
                        average();
                        break;
                    case "quit":
                        loop = false;
                        break;
                    default:
                        throw new RuntimeException("wrong input");
                }
            } catch (RuntimeException e) {
                System.out.println("Wrong input, try again. ");

            }

        }

    }

    private static void add() {
        //TODO add try catch
        System.out.println("Enter student name: ");
        String name = scan.nextLine();
        System.out.println("Enter student grade: ");
        int grade = scan.nextInt();
        scan.nextLine();
        Student student = new Student(name, grade);
        studentArrayList.add(student);
        System.out.println("Student added.");

    }

    private static void remove() {
        //TODO try catch
        System.out.println("Enter student name to remove: ");
        String name = scan.nextLine();
        studentArrayList.removeIf(
                student -> student.getName().equalsIgnoreCase(name)
        );
        System.out.printf("Removed %s. \n", name);

    }

    private static void find() {
        //TODO try catch
        System.out.println("Enter student name: ");
        String name = scan.nextLine();

        for (Student student : studentArrayList) {
            if (student.getName().equalsIgnoreCase(name)) {
                System.out.println("Student: "+ student);
            }
        }
    }

    private static void list() {
        System.out.println(studentArrayList);
    }
    private static void average() {
        double gradeAvg = 0;
        for (Student student : studentArrayList) {
            gradeAvg += student.getGrade();
        }
        gradeAvg = gradeAvg/studentArrayList.toArray().length;
        System.out.println("Average student grade is: " + gradeAvg);

    }
}