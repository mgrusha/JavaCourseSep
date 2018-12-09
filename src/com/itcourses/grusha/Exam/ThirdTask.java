package com.itcourses.grusha.Exam;

public class ThirdTask {

    public static void main(String[] args) {
        TestObject a = new TestObject();
        TestObject b = new TestObject();
        TestObject c = new TestObject();
        TestObject d = new TestObject();
        TestObject e = new TestObject();
        System.out.println(TestObject.numberOfElements + " elements were created");
    }
}

class TestObject {
    public static int numberOfElements;

    public TestObject() {
        numberOfElements++;
    }

    {
        ++numberOfElements;
    }

}
