package StarterExercises.FileGradebookIO;

import java.io.*;
import java.util.ArrayList;
import java.util.Comparator;

public class Main
    {
        public static void main(String[] args) throws IOException {
            double avgGrade = 0;
            ArrayList<Student> studentArrayList = new ArrayList<>();

            //read file
            try (BufferedReader r = new BufferedReader(
                    new FileReader("src/main/java/StarterExercises/FileGradebookIO/student_grades.csv"))){

                String line;
                r.readLine(); // Skip first CSV line

                while ((line = r.readLine()) != null ){
                    String[] str = line.split(",");

                    int grade = Integer.parseInt(str[1]);
                    Student student = new Student(str[0], grade);
                    studentArrayList.add(student);
                    avgGrade += grade;
                    System.out.println(str[0]+" - grade: "+grade);

                }


            }catch (IOException e){
                System.out.println("Error reading csv file: "+e.getMessage());
            }

            System.out.println("\n");
            //sort by grade - high to low
            studentArrayList.sort(Comparator.comparingInt(Student::getGrade).reversed());
            System.out.println(studentArrayList);

            //print grade info
            System.out.println("number of students: "+studentArrayList.size());
            System.out.println("class average: "+avgGrade/studentArrayList.size());

            //write to a file
            String fileLocation = "src/main/java/StarterExercises/FileGradebookIO/";
            String fileName = "sorted_student_grades.csv";
            try(FileWriter w = new FileWriter(fileLocation + fileName)){
                w.write("student,grade");
                w.write(System.lineSeparator());

                for (Student s: studentArrayList){
                    w.write(s.getName()+","+s.getGrade());
                    w.write(System.lineSeparator());
                    //System.out.println(s.getName()+","+s.getGrade());
                }
            }catch (IOException e){
                System.out.println("Write Error: " + e.getMessage());
            }

        }
}
