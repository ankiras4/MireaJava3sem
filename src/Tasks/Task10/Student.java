package Tasks.Task10;

public class Student {
    private String Name;
    private String Secondname;
    private String Speciality;
    private int Grade;
    private int NumberOfGroup;
    private int Gpa;

    public Student(String name, String secondname, String speciality, int grade, int numberofgroup, int gpa) {
        this.Name = name;
        this.Secondname = secondname;
        this.Speciality = speciality;
        this.Grade = grade;
        this.NumberOfGroup = numberofgroup;
        this.Gpa = gpa;
    }

    public int getGpa() {
        return Gpa;
    }

    public void setGpa(int gpa) {
        this.Gpa = gpa;
    }

    public String getName() {
        return Name;
    }

    public void setName(String name) {
        this.Name = name;
    }

    public String getSecondname() {
        return Secondname;
    }

    public void setSecondname(String secondname) {
        this.Secondname = secondname;
    }

    public String getSpeciality() {
        return Speciality;
    }

    public void setSpeciality(String speciality) {
        this.Speciality = speciality;
    }

    public int getGrade() {
        return Grade;
    }

    public void setGrade(int grade) {
        this.Grade = grade;
    }

    public int getNumber_of_group() {
        return NumberOfGroup;
    }

    public void setNumber_of_group(int numberofgroup) {
        this.NumberOfGroup = numberofgroup;
    }

}