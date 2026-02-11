package practicing;

import java.util.*;

public class StudentsService {

    public static String schoolName = "VVIT High School";

    public String studentName;
    public  long rollNo;
    public Map<String, Integer> subjects;
    public long totalMarks;
    public String grade;
    public String city;
    public int age;

    public StudentsService(String studentName, String city, int age) {
        this.studentName = studentName;
        this.city = city;
        this.age = age;
        this.rollNo = generateRollNumber(age);
        this.subjects = new HashMap<>();
    }

    public long generateRollNumber(int age) {
        return (long) (age * Math.random() * 10000);
    }

    public String getStudentName() {
        return studentName;
    }
    public void setStudentName(String studentName) {
        this.studentName = studentName;
    }

    public long getRollNo() {
        return rollNo;
    }

    public Map<String, Integer> getSubjects() {
        return subjects;
    }
    public void setSubjects(Map<String, Integer> subjects) {
        this.subjects = subjects;
    }

    public long getTotalMarks() {
        return totalMarks;
    }

    public String getGrade() {
        return grade;
    }

    public String getCity() {
        return city;
    }
    public void setCity(String city) {
        this.city = city;
    }

    public int getAge() {
        return age;
    }
    public void setAge(int age) {
        this.age = age;
    }


    public void calculateTotalMarks() {
        totalMarks = 0;
        for (int mark : subjects.values()) {
            totalMarks += mark;
        }
    }

    private void calculateGrade() {
        if (totalMarks >= 450) grade = "A";
        else if (totalMarks >= 350) grade = "B";
        else if (totalMarks >= 250) grade = "C";
        else grade = "D";
    }

    public void updateMarks(String subject, int marks) {
        subjects.put(subject, marks);
        calculateTotalMarks();
        calculateGrade();
    }

    public void displayMarks() {
        System.out.println("Subjects:");
        for (Map.Entry<String, Integer> entry : subjects.entrySet()) {
            System.out.println(entry.getKey() + " : " + entry.getValue());
        }
        System.out.println("Total Marks: " + totalMarks);
        System.out.println("Grade: " + grade);
    }


    public void displayStudentDetails() {
        System.out.println("\n----- Student Details -----");
        System.out.println("Name: " + studentName);
        System.out.println("Roll No: " + rollNo);
        System.out.println("Age: " + age);
        System.out.println("City: " + city);
        System.out.println("School: " + schoolName);
        displayMarks();
    }

    public static StudentsService createStudent() {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter Student Name: ");
        String name = sc.nextLine();

        System.out.print("Enter City: ");
        String city = sc.nextLine();

        System.out.print("Enter Age: ");
        int age = sc.nextInt();

        StudentsService student = new StudentsService(name, city, age);

        String[] subjectList = {"Telugu", "Hindi", "English", "Math", "Science"};

        for (String sub : subjectList) {
            System.out.print("Enter marks for " + sub + ": ");
            int marks = sc.nextInt();
            student.updateMarks(sub, marks);
        }

        return student;
    }

    public static void main(String[] args) {


        StudentsService s1 = StudentsService.createStudent();
        s1.displayStudentDetails();


        StudentsService s2 = new StudentsService("Sathwik", "Vijayawada", 22);
        s2.updateMarks("Telugu", 90);
        s2.updateMarks("Hindi", 85);
        s2.updateMarks("English", 88);
        s2.updateMarks("Math", 95);
        s2.updateMarks("Science", 92);

        //s2.displayStudentDetails();
    }
}
