class Student {

    int rollNo;
    String name;

    // Normal constructor
    Student(int rollNo, String name) {
        this.rollNo = rollNo;
        this.name = name;
    }

    // Copy constructor
    Student(Student s) {
        this.rollNo = s.rollNo;
        this.name = s.name;
    }

    void display() {
        System.out.println(rollNo + " " + name);
    }
}

public class CopyCOnstructor {

    public static void main(String[] args) {

        Student s1 = new Student(1, "Ram");

        // Copying s1 into s2
        Student s2 = new Student(s1);

        s1.display();
        s2.display();
    }
}



// Java supports copy constructors conceptually, but unlike C++, Java does not provide a default copy constructor automatically.
//  Developers must define it manually.
// a copy constructor is used to create a new independent object having the same data as another object.




// this keyword is used to refer to the current object. 
// It is used to differentiate between instance variables and local variables when they have the same name.
//  It can also be used to call another constructor in the same class.






// constructor overloading -> constructor overloading is a technique in java where a class can have 
// more than one constructor with different parameters.
//  It is used to create objects in different ways. The constructor to be called is determined by the number and type of arguments
//  passed when creating an object.