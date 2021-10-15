package school;

public class Student {
    private String name;
    private int age;
    private String gender;
    private int id_no;

    public Student (String name, int age, String gender, int id_no) {
        this.name = name;
        this.age = age;
        this.gender = gender;
        this.id_no = id_no;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender){
        this.gender = gender;
    }

    public int getId_no() {
        return id_no;
    }

    public void setId_no(int id_no) {
        this.id_no = id_no;
    }
}
