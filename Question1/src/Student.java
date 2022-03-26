public class Student {
    private String Name;
    private int StudentID;
    private int Gpa;


    public String getName() {
        return Name;
    }

    public void setName(String Name) {
        this.Name = Name;
    }

    public int getStudentID() {
        return StudentID;
    }

    public void setStudentID(int StudentID) {

        this.StudentID = StudentID;
    }

    public int getGpa() {

        return Gpa;
    }

    public void setGpa(int Gpa) {

        this.Gpa = Gpa;
    }

    public Student(String Name, int StudentID, int Gpa){
        this.Name = Name;
        this.StudentID = StudentID;
        this.Gpa = Gpa;
    }

    public Student( Student student1){
        Student st1 = new Student();
        this.Name = student1.Name;
        this.StudentID = student1.StudentID;
        this.Gpa = student1.Gpa;
    }

    public void printStudentInfo(){
        System.out.println("************");
        System.out.println("Name = " + this.Name);
        System.out.println("ID = " + this.StudentID);
        System.out.println("Gpa = " + this.Gpa);
    }

}
