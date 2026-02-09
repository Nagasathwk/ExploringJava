package practicing;

import javax.management.remote.SubjectDelegationPermission;
import java.util.Map;

public class ConstructorExample {
    public static void main(String[] args) {
        Student student = new Student("Siva", "7");
        student.displayDetails();
        Student sathvik = new Student("Sathvik", "8", ' ');
        sathvik.displayDetails();
        Student charan = new Student("Charan", "10", 'B');
        charan.displayDetails();

        try{
            System.out.println("try");
            int a = 0/10;
            String s = null;
            System.out.println("a is"+ a);
            s.concat("sdsd");
            System.out.println(s);
        } catch(ArithmeticException e){
            System.out.println(e);
        }catch (NullPointerException nullPointerException){
            System.out.println(nullPointerException);
        } catch (Exception exception){
            System.out.println(exception);
        }finally {
            System.out.println("Finally");
        }

    }
}

class Student{
    String studentName;
    String standard;
    Character grade;

    Map<String, Integer> subjects;

    boolean isSportsPlayed;

    Student(String studentName, String standard){
        this.studentName = studentName;
        this.standard = standard;
    }

    Student(String name, String standard, Character grade){
        this.studentName = name;
        this.standard = standard;
        this.grade = grade;
    }

    public void displayDetails(){
        System.out.println("StudentName = "+ studentName +"\nStandarad: "+ standard +"\nGrade: "+checkNullOrEmpty(grade));
        System.out.println("-------------------------------");
    }

    public String checkNullOrEmpty(Character value){
        if(value == null){
            return "Grade has not Yet Assigned";
        }else if(value ==' '){
            return "Exams In Progress";
        }
        return value.toString();
    }

}


