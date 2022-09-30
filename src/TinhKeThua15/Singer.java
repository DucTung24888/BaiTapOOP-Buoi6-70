package TinhKeThua15;

public class Singer extends Person{
    private String bandName;
    private void singing() {}
    private void playGitar() {}

    public Singer(String name, String designation, String bandName) {
        super(name, designation);
        this.bandName = bandName;
    }

    public String getBandName() {
        return bandName;
    }

    public void setBandName(String bandName) {
        this.bandName = bandName;
    }

    @Override
    public String toString() {
        return String.format("Name %s, designation %s, bandName %s",
                getName(),getDesignation(),bandName);
    }
}
