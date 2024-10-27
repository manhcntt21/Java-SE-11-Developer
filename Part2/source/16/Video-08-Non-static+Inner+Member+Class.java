***********************************
snippet-01-nest.EnclosingClass.java
***********************************


/*
The Learn Programming Academy
Java SE 11 Developer 1Z0-819 OCP Course - Part 2
Section 1: Java Fundamentals
Topic 2: Nested Classes
Subtopic: Static Nested Classes
*/
package nest;

// Enclosing Class
public class EnclosingClass {
    // instance field on enclosing class
    public String outerName = "outer";

    // static field on enclosing class
    public static String staticOuterName = "OUTER";

    // static method on enclosing class
    public static void doSomethingStatically() {
        System.out.println("doSomethingStatically invoked.");
        // invoke nested class's method via class reference
        NestedStaticClass.getStaticName();
    }

    // instance method on enclosing class
    public void doSomethingOnInstance() {
        System.out.println("doSomethingOnInstance invoked.");
        // invoke nested class's method via instance reference
        new NestedStaticClass().getInstanceName();
    }

    // Begin declaration of static nested class named NestedStaticClass
    public static class NestedStaticClass {
        // static field
        public static String staticName = "NestedStaticClass.staticName";

        // instance field
        public String instanceName = "NestedStaticClass.instanceName";

        // static method
        public static String getStaticName() {
            return "getStaticName() = " + NestedStaticClass.staticName;
        }

        // instance method
        public String getInstanceName() {
            return "getInstanceName() = " + this.instanceName;
        }

        public enum Colors {
            RED, BLUE, YELLOW
        }

        public interface NestedInterface {

        }
    }  // Ends declaration of the static nested class

}

// This class tests the EnclosingClass and it's nested class
// from disassociated class.
class TestEnclosingClass {

    public static void main(String[] args) {
        // Reference static field on static nested class directly:
        System.out.println(EnclosingClass.NestedStaticClass.staticName);

        // Reference static method on static nested class directly:
        System.out.println(EnclosingClass.NestedStaticClass.getStaticName());

        // Reference enum on static nested class directly:
        System.out.println(EnclosingClass.NestedStaticClass.Colors.BLUE);

        // Local variable declaration using a nested class's interface
        EnclosingClass.NestedStaticClass.NestedInterface n;

    }
}


**********************************
snippet-01-StaticClassExample.java
**********************************


/*
The Learn Programming Academy
Java SE 11 Developer 1Z0-819 OCP Course - Part 2
Section 1: Java Fundamentals
Topic 2: Nested Classes
Subtopic: Static Nested Classes
*/


import nest.EnclosingClass;

public class StaticClassExample {
    public static void main(String[] args) {
        // Reference static field on static nested class directly:
        System.out.println(EnclosingClass.NestedStaticClass.staticName);

        // Reference static method on static nested class directly:
        System.out.println(EnclosingClass.NestedStaticClass.getStaticName());

        // Reference enum on static nested class directly:
        System.out.println(EnclosingClass.NestedStaticClass.Colors.BLUE);

        // Local variable declaration using a nested class's interface
        EnclosingClass.NestedStaticClass.NestedInterface n;

    }
}


**********************************
snippet-02-StaticClassExample.java
**********************************


import nest.EnclosingClass.NestedStaticClass;


**********************************
snippet-03-StaticClassExample.java
**********************************


    public static void main(String[] args) {
        // Reference static field on static nested class directly:
        System.out.println(NestedStaticClass.staticName);

        // Reference static method on static nested class directly:
        System.out.println(NestedStaticClass.getStaticName());

        // Reference enum on static nested class directly:
        System.out.println(NestedStaticClass.Colors.BLUE);

        // Local variable declaration using a nested class's interface
        NestedStaticClass.NestedInterface n;

    }


**********************************
snippet-04-StaticClassExample.java
**********************************


import static nest.EnclosingClass.NestedStaticClass;


**********************************
snippet-05-StaticClassExample.java
**********************************


        // Create an instance of the static class
        NestedStaticClass nInstance = new NestedStaticClass();
        System.out.println(nInstance.getInstanceName());


***********************************
snippet-02-nest.EnclosingClass.java
***********************************


// instance method
public String getInstanceName() {
    System.out.println(outerName);
    return "getInstanceName() = " + this.instanceName;
}


***********************************
snippet-03-nest.EnclosingClass.java
***********************************


// instance method
public String getInstanceName() {
    // Reference a non-static method from the enclosing class...
    doSomethingOnInstance();
    return "getInstanceName() = " + this.instanceName;
}


***********************************
snippet-04-nest.EnclosingClass.java
***********************************


// instance method on enclosing class
public void doSomethingOnInstance() {
    System.out.println("doSomethingOnInstance invoked.");
    // invoke nested class's method via class reference
    NestedStaticClass.getInstanceName();
}


************************************
snippet-01-inner.EnclosingClass.java
************************************


/*
The Learn Programming Academy
Java SE 11 Developer 1Z0-819 OCP Course - Part 2
Section 1: Java Fundamentals 
Topic:  Nested Inner Class
*/

package inner;

// Enclosing Class
public class EnclosingClass {
    // instance field on enclosing class
    public String outerName = "outer";

    // instance method on enclosing class
    public void doSomethingOnInstance() {
        System.out.print("doSomethingOnInstance invoked: ");
        // invoke nested class's method via class reference
        System.out.println(new InnerMemberClass().getInstanceName());
    }

    // Begin declaration of inner member class named InnerMemberClass
    public class InnerMemberClass {

        // instance field
        public String instanceName = "InnerMemberClass.instanceName";

        // instance method
        public String getInstanceName() {
            return "getInstanceName() = " + this.instanceName;
        }

    }  // Ends declaration of the inner member class

}

// This class tests the EnclosingClass and it's inner member class
// using a disassociated class.
class TestEnclosingClass {

    public static void main(String[] args) {
        EnclosingClass e = new EnclosingClass();
        e.doSomethingOnInstance();
    }
}


************************************
snippet-02-inner.EnclosingClass.java
************************************


// We can declare a local variable of the inner class
EnclosingClass.InnerMemberClass i;

// But instantiating this way does not work...
i = new EnclosingClass.InnerMemberClass();


************************************
snippet-03-inner.EnclosingClass.java
************************************


// But instantiating this way does not work...
i = new e.InnerMemberClass();


************************************
snippet-04-inner.EnclosingClass.java
************************************


// You must use the instance new operator, much like a method.
i = e.new InnerMemberClass();


************************************
snippet-05-inner.EnclosingClass.java
************************************


// Add Constructor
EnclosingClass(String name) {
    this.outerName = name;
}


************************************
snippet-06-inner.EnclosingClass.java
************************************


public String getOuterName() {
    return "InnerMemberClass.getOuterName() = " + outerName;
}


************************************
snippet-07-inner.EnclosingClass.java
************************************


EnclosingClass e = new EnclosingClass("e's Instance");


************************************
snippet-08-inner.EnclosingClass.java
************************************


// Use local variable referencing the inner member class to
// access method on the inner class
System.out.println("Invoking i.getOuterName: " + i.getOuterName());

// Create another instance of the Enclosing Class
EnclosingClass f = new EnclosingClass("f's Instance");

// Declare and Assign a variable to the inner member class of
// new instance in a single statement
EnclosingClass.InnerMemberClass j = f.new InnerMemberClass();
System.out.println("Invoking j.getOuterName: " + j.getOuterName());


************************************
snippet-09-inner.EnclosingClass.java
************************************


e.InnerMemberClass.instanceName = "Testing";
System.out.println(e.InnerMemberClass.getInstanceName());