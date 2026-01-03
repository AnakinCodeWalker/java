// Every class extends Object class internally / mother of all classes
public class objectClassDemo {

//    this will call the constructor of the object class
    public objectClassDemo() {
        super();
    }

// this takes a number and returns the hashcode of it

    @Override
    public int hashCode() {
        return super.hashCode();
    }

//    checks the value and not the reference object, checking the object is done by ==
    @Override
    public boolean equals(Object obj) {
        return super.equals(obj);
    }

/*
  creates a shallow copy,
a clone of this instance. throws an CloneNotSupportedException
error if not/can,t be copied
*/

    @Override
    protected Object clone() throws CloneNotSupportedException {
        return super.clone();
    }

//    returns a string representation of the object.
    @Override
    public String toString() {
        return super.toString();
    }

//    called during the garbage collection by garbage collector.
    @Override
    protected void finalize() throws Throwable {
        super.finalize();
    }
}
