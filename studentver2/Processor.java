package studentver2;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

public class Processor {
    public static void main(String[] args) throws ParseException {
        Scanner sc = new Scanner(System.in);
        StudentList studentList = new StudentList();
        boolean exit = false;
        while(!exit){
            System.out.println("1.Add new student");
            System.out.println("2.Update student");
            System.out.println("3.Delete student");
            System.out.println("4.Display all students");
            System.out.println("5.Find top student");
            System.out.println("6.Display schoolarship students");
            System.out.println("7.Caculate tuition of all students");
            System.out.println("8.Exit");
            System.out.print("Choose an option: ");
            int choice = sc.nextInt();
            sc.nextLine();
            switch(choice){
                case 1:
                    System.out.print("Enter id student: ");
                    String id = sc.nextLine();
                    System.out.print("Enter full name: ");
                    String fullName = sc.nextLine();
                    System.out.print("Enter date of birth(dd/MM/yyyy): ");
                    String dob = sc.nextLine();
                    SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
                    Date dateOfBirth = sdf.parse(dob);
                    System.out.print("Enter GPA: ");
                    float gpa = sc.nextFloat();
                    sc.nextLine();
                    System.out.print("Enter major: ");
                    String major = sc.nextLine();
                    studentList.addStudent(new Student(gpa, major, exit, id, fullName, dateOfBirth));
                    System.out.println("--------------");
                    break;
                case 2 :
                    System.out.print("Enter id of the student to update: ");
                    String idUpDate = sc.nextLine();
                    Student studentUpDate = studentList.findStudentById(idUpDate);
                    if(studentUpDate!=null){
                        System.out.print("Enter new full name: ");
                        String newName = sc.nextLine();
                        studentUpDate.setFullName(newName);
                        System.out.print("Enter new date of birth(dd/MM/yyyy): ");
                        String date = sc.nextLine();
                        SimpleDateFormat sd = new SimpleDateFormat("dd/MM/yyyy");
                        Date newDateOfBirth = sd.parse(date);
                        studentUpDate.setDateOfBirth(newDateOfBirth);
                        System.out.print("Enter new GPA: ");
                        float newGPA = sc.nextFloat();
                        sc.nextLine();
                        studentUpDate.setGpa(newGPA);
                        System.out.print("Enter new major: ");
                        String newMajor = sc.nextLine();
                        studentUpDate.setMajor(newMajor);
                        System.out.println("Student update succesfully");
                        System.out.println("--------------");
                 
                    }
                    else{
                        System.out.println("Student not found");
                        System.out.println("-------------");
                    }
                    break;
                case 3:
                    System.out.println("Enter ID of student to delete: ");
                    String deletedID= sc.nextLine();
                    studentList.deleteStudentById(deletedID);
                    System.out.println("Student deleted successfully");
                    System.out.println("---------------");
                    break;
                case 4:
                    studentList.displayAllStudents();
                    break;
                case 5:
                    Student topStudent = studentList.findTopStudent();
                    if(topStudent !=null){
                        System.out.println("Student with the highest GPA: ");
                        topStudent.displayInfo();
                    }
                    else{
                        System.out.println("No student in the list");
                        System.out.println("-----------");
                    }
                    break;
                case 6:
                    studentList.findScholarshipStudent();
                    System.out.println("-------------");
                    break;
                case 7:
                    System.out.println("Caculate tuition of all students: "+studentList.calculateTuitionOfAllStudents());
                    System.out.println("----------");
                    break;
                case 8:
                    exit = true;
                    break;
                default:
                    System.out.println("Invalid choice. Please choose again");
                    System.out.println("------------");
                    break;
            }
        }
        sc.close();
    }
}
