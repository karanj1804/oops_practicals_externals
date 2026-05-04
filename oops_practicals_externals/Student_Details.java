import java.util.Scanner;
class StudentDetails {
    String name;
    int rollNo;
    int age;

    void display() {
        System.out.println("Student Name: " + name);
        System.out.println("Roll No: " + rollNo);
        System.out.println("Age: " + age);
    }
}

class StudentDemo {
    public static void main(String[] args) {
       StudentDetails s1 = new StudentDetails();

        s1.name = "Karan";
        s1.rollNo = 101;
        s1.age = 19;

        s1.display();
    }
}