package OOPBaiTap7;

public class Programmer extends Person{
    private String companyName;


    public Programmer(String name, String designation) {
        super(name, designation);
    }

    public Programmer(String name, String designation, String companyName) {
        super(name, designation);
        this.companyName = companyName;
    }

    public String getCompanyName() {
        return companyName;
    }

    public void setCompanyName(String companyName) {
        this.companyName = companyName;
    }

    @Override
    protected void walk() {
        System.out.println("walk of programmer");
    }

    @Override
    protected void learn() {
        System.out.println("Learn of programmer");
    }



    protected void eat(String fool){
        System.out.println(fool);
    }

}
