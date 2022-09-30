package TinhKeThua15;

public class Person {
    private String name;
    private String designation;
    private void learn() {}
    private void walk() {}
    private void eat() {}

    public Person(String name, String designation) {
        this.name = name;
        this.designation = designation;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDesignation() {
        return designation;
    }

    public void setDesignation(String designation) {
        this.designation = designation;
    }

    @Override
    public String toString() {
        return String.format("name=$s,designation=%s",name,designation);
    }
}
