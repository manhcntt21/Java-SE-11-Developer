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