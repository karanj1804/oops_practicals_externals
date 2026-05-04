class Stud {
    String name;
    int rollNo;

    Stud() {
        name = "Unknown";
        rollNo = 0;
    }

    Stud(String n) {
        name = n;
        rollNo = 0;
    }

    Stud(String n, int r) {
        name = n;
        rollNo = r;
    }

    Stud(Stud s) {
        name = s.name;
        rollNo = s.rollNo;
    }

    void display() {
        System.out.println("Name: " + name);
        System.out.println("Roll No: " + rollNo);
    }

    protected void finalize() {
        System.out.println("Object destroyed");
    }
}

class StudDemo {
    public static void main(String[] args) {
        Stud s1 = new Stud();
        Stud s2 = new Stud("Karan");
        Stud s3 = new Stud("Rahul", 101);
        Stud s4 = new Stud(s3);

        System.out.println("Default Constructor:");
        s1.display();

        System.out.println("One Parameter Constructor:");
        s2.display();

        System.out.println("Two Parameter Constructor:");
        s3.display();

        System.out.println("Copy Constructor:");
        s4.display();

        s1 = null;
        s2 = null;
        s3 = null;
        s4 = null;

        System.gc();
    }
}