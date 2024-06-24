package practice.recap;

public interface IPerson {

    default void sayName(){
        System.out.println("I am a person");
    }

    static void sayAge(){
        System.out.println("I am a 10 years old");
    }
}


class Person implements IPerson {
    public String name;
    public int age;

    public Person(String byorn){

    }
    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    @Override
    public void sayName() {
        System.out.println("I am " + name);
    }

}

class Robot implements IPerson {}
