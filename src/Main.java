import school.Student;

public class Main {
    public static void main (String [] args) {
        Student student = new Student("Tommy", 20, "M", 12345);
        student.setName("John");
        System.out.println(student.getName());
        System.out.println(student.getAge());
        System.out.println(student.getGender());
        System.out.println(student.getId_no());
    }
}
