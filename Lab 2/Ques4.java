
class TestClass {

    private static int objectCount = 0; //read only

    TestClass() {
        objectCount++;
    }

    public static int getObjectCount() {
        return objectCount;
    }
}

class Ques4 {

    public static void main(String[] args) {
        TestClass obj1 = new TestClass();
        TestClass obj2 = new TestClass();
        TestClass obj3 = new TestClass();
        System.out.println("Number of objects created: " + TestClass.getObjectCount());
    }
}