package TinhKeThua15;

public class Dancer extends Person{
    private String groupName;
    private void dancing() {}

    public Dancer(String name, String designation, String groupName) {
        super(name, designation);
        this.groupName = groupName;
    }

    public String getGroupName() {
        return groupName;
    }

    public void setGroupName(String groupName) {
        this.groupName = groupName;
    }

    @Override
    public String toString() {
        return String.format("Name %s, designation %s, groupName %s",
                getName(),getDesignation(),groupName);
    }
}
