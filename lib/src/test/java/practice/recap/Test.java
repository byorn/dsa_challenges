package practice.recap;


public class Test {

    public static void main(String[] args) {
        //default methods in interface
        IPerson p = new Person("Byorn");
        p.sayName();
        IPerson robot  = new Robot();
        robot.sayName();

        //static methods
        IPerson.sayAge();
    }
}
