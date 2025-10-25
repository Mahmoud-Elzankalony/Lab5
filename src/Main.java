public class Main {

    public static void main(String[] args) throws Exception {
        System.out.println("hello world");
        Student s=new Student(12, "omar", 12, null, "omar", 12);
        StudentDatabase SD=new StudentDatabase("student.txt");
        SD.readFromFile();
        SD.ViewStudents();
        System.out.println("\n\n");
        SD.AddStudent(s);
        SD.ViewStudents();
        SD.DeleteStudent(12);
        System.out.println("\n\n");
        SD.ViewStudents();
        
    }
}