public class PillerOfOops {
    public static void main(String[] args) {
        
    }
}

//inheritence -> inheritance is a fundamental concept in object-oriented programming (OOP) that allows a new class (called a child or subclass) to inherit properties and behaviors (fields and methods) from an existing class (called a parent or superclass).
//  This promotes code reusability and establishes a natural hierarchical relationship between classes. 
// Inheritance enables the creation of a new class based on an existing class, allowing the new class to reuse code 
// and extend functionality without modifying the original class. The child class can also override methods 
// of the parent class to provide specific implementations.



// super keyword is same as this but this reference current object and super reference parent class object.
//  It is used to access parent class members and constructors. It can be used to call parent class methods and constructors.
//  It can also be used to access parent class variables when they are hidden by child class variables.



// parent object=child object wrong and can not be done because parent class object does not have access to child class members.
//  But child class object can be assigned to parent class reference variable because child class is a subclass of parent class
//  and it has access to parent class members. This is called upcasting. Upcasting is done implicitly by java 
// and it is safe because child class has all the members of parent class. But downcasting is not safe 
// because parent class does not have all the members of child class and it can cause runtime error if we try 
// to access child class members using parent class reference variable. Downcasting is done explicitly by java 
// and it should be done with caution.



