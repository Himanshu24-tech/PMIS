class Student{
    String name;
    static String collegename ="G H  Raisoni NGP";
    Student(String name){
        this.name = name;
    }
    void studentcollege(){
        System.out.println("Student: " + name + " studies in " + collegename);
        
    }

}

public class static1 {
    public static void main(String[] args) {
        Student s1 = new Student("Himanshu");
        s1.studentcollege();
        Student s2 = new Student("Ramesh");
        s2.studentcollege();
    }
}