package studentver2;

import java.text.SimpleDateFormat;
import java.util.Date;

public class Student extends Person{
    private float gpa;
    private String major;
    private boolean schoolarship;
    private final float tuition=10000000;
    
    public double caculateTuition(){
        if(gpa >=9 )
            return tuition*0.5f;
        else return tuition;
    }
    @Override
    public void displayInfo() {
        SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
        String fomatDate = sdf.format(dateOfBirth);
        System.out.println("ID: "+id);
        System.out.println("Full Name: "+fullName);
        System.out.println("Date Of Birth: "+fomatDate);
        System.out.println("GPA: "+gpa);
        System.out.println("Major: "+major);
        if(gpa >= 9)
            System.out.println("Co hoc bong");
        else System.out.println("Khong co hoc bong");
        System.out.println("Tuition Fee: "+caculateTuition()+" VND");
        System.out.println("-------------");
        
    }
    public Student(float gpa, String major, boolean schoolarship, String id, String fullName, Date dateOfBirth) {
        super(id, fullName, dateOfBirth);
        this.gpa = gpa;
        this.major = major;
        this.schoolarship = schoolarship;
    }
    

    public Student() {
    }

    public float getGpa() {
        return gpa;
    }

    public void setGpa(float gpa) {
        this.gpa = gpa;
    }

    public String getMajor() {
        return major;
    }

    public void setMajor(String major) {
        this.major = major;
    }

    public double getTuition() {
        return tuition;
    }


    public boolean isSchoolarship() {
        return schoolarship;
    }

    public void setSchoolarship(boolean schoolarship) {
        this.schoolarship = schoolarship;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getFullName() {
        return fullName;
    }

    public void setFullName(String fullName) {
        this.fullName = fullName;
    }

    public Date getDateOfBirth() {
        return dateOfBirth;
    }

    public void setDateOfBirth(Date dateOfBirth) {
        this.dateOfBirth = dateOfBirth;
    }
    public void addStudent(String id, String fullName, Date dateOfBirth, float gpa, String major, double tuition, boolean schoolarship){
        this.id=id;
        this.fullName=fullName;
        this.dateOfBirth=dateOfBirth;
        this.gpa=gpa;
        this.major=major;
        this.schoolarship=schoolarship;
    }
}
