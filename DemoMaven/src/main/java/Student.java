public class Student {
    private int StudentID;
    private String StudentName;

    public Student(int studentID, String name) {
        StudentID = studentID;
        StudentName = name;
    }

    @Override
    public String toString() {
        return "StudentID=" + StudentID + ", StudentName='" + StudentName + '\'' ;
    }
    public void display(){
        System.out.println(toString());
    }
}
