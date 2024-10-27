


************************************
snippet-10-inner.EnclosingClass.java
************************************


// instance field of the type of the inner class
public InnerMemberClass innerMemberClass = new InnerMemberClass();


************************************
snippet-11-inner.EnclosingClass.java
************************************


e.innerMemberClass.instanceName = "Testing";
System.out.println(e.innerMemberClass.getInstanceName());


************************************
snippet-12-inner.EnclosingClass.java
************************************


// static field
public static String staticName = "staticName";

// static method
public static String getStaticName() {
    return "getStaticName() = " + staticName;
}


************************************
snippet-13-inner.EnclosingClass.java
************************************


// static field
public static final String staticName = "staticName";


************************************
snippet-14-inner.EnclosingClass.java
************************************


public enum Colors {
    RED, BLUE, YELLOW
}

public interface NestedInterface {

}


************************************
snippet-15-inner.EnclosingClass.java
************************************


public String outerName = "outer";


************************************
snippet-16-inner.EnclosingClass.java
************************************


public String getOuterName() {
    return "InnerMemberClass.getOuterName() = " +
            EnclosingClass.this.outerName;
}


************************************
snippet-17-inner.EnclosingClass.java
************************************


public String getOuterName() {
    return "InnerMemberClass.getOuterName() = " +
            EnclosingClass.this.outerName;
}

