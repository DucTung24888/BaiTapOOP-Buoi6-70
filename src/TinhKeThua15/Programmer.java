package TinhKeThua15;

public class Programmer extends Person{
    private String companyName;
    private void coding() {};

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
    public String toString() {
        return String.format("Name %s,designation %s,companyName %s",
                getName(),getDesignation(),companyName);
    }
}
