public class Classobject{
    public static void main(String[] args) {
        
        Student s1=new Student(1,"Ram",98);

        System.out.println("Roll No: "+s1.RollNo);
        System.out.println("Name: "+s1.Name);
        System.out.println("Marks: "+s1.Marks);
    }

    public static class Student{
        int RollNo;
        String Name;
        float Marks;
        Student(int RollNumber,String Name,float Marks){
            this.RollNo=RollNumber;
            this.Name=Name;
            this.Marks=Marks;
        }
    }
}




// class-> class is blueprint of object
// object->object is instance of class and Memory is allocated only when an object is instantiated.
// static -> static is a keyword in java which is used to share the same variable or method of a given class.
// static method can not access non static variable and method directly. It can access them using object reference.

// STACK MEMORY                HEAP MEMORY
// --------------             ----------------
// s1  -----------►           Student Object
//                             RollNo = 0
//                             Name = null
//                             Marks = 0.0/
// only for non premetive data type this things happen

// s1 contains the address of the heap object.
// java dont have any pointer concept so we can not directly access the memory address but we can access the object using reference variable.


// constructor -> constructor is a special method which is used to initialize the object. It is called when an object is created.
//  It has the same name as the class and does not have any return type. It can be parameterized or non-parameterized.
//  If we do not provide any constructor, then java provides a default constructor which initializes the object with default values.

//copy constructor -> copy constructor is a constructor which creates a new object by copying the values of an existing object.
//  It is used to create a new object with the same values as an existing object. It is defined as follows:

// copy constructor explain by example