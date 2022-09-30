package OOPBaiTap7;

import TinhKeThua15.Programmer;

public class Person {
    private String name;
    private String designation;

    public Person(String name, String designation) {
        this.name = name;
        this.designation = designation;
    }

    protected void learn() {
        System.out.println("Learn of Person");
    }

    protected void walk() {
        System.out.println("walk of Person");
    }

    protected void eat() {
        System.out.println("eat of person");
    }

    protected void eat(String fool){
        System.out.println(fool);
    }

}
