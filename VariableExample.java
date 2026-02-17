class Person {
    String name; 
    int age;     

    void display() {
        System.out.println("Name: " + name + ", Age: " + age);
    }
}

public class VariableExample {
    public static void main(String[] args) {
        Person p1 = new Person();
        p1.name = "harsh singh";
        p1.age = 20;
        p1.display();
    }
}
