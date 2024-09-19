package studentver2;

import java.util.ArrayList;

public class StudentList {
    private ArrayList<Student> studentList ;

    public StudentList() {
        this.studentList = new ArrayList<>();
    }
    public void addStudent(Student student){
        studentList.add(student);
    }
    public void deleteStudentById(String id){
        studentList.removeIf(Student->Student.getId().equals(id));
    }
    public Student findStudentById(String id){
        for (Student student : studentList) {
            if(student.getId().equals(id))
                return student;
        }
        return null;
    }
    public void displayAllStudents(){
        for (Student student : studentList) {
            student.displayInfo();
            System.out.println("------------");
        }
    }
    public Student findTopStudent(){
        if(studentList.isEmpty())
            return null;
        Student topStudent = studentList.get(0);
        for (Student student : studentList) {
            if(student.getGpa()>topStudent.getGpa())
                topStudent = student;
        }
        return topStudent;
    }
    public void findScholarshipStudent(){
        for (Student student : studentList) {
            if(student.getGpa()>=9){
                System.out.println("Student Have Scholarship : ");
                student.displayInfo();
            }
            else System.out.println("No ScholarshipStudent!");
        }
        System.out.println("------------");
    }
    public double calculateTuitionOfAllStudents(){
        float totalcalculateTuition = 0;
        for (Student student : studentList) {
            totalcalculateTuition+=student.caculateTuition();
        }
        return totalcalculateTuition;
    }
}
