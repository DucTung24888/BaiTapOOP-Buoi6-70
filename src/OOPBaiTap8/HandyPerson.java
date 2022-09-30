package OOPBaiTap8;

public class HandyPerson extends Human implements Plumber,Electrian{
    @Override
    public String changeBulb() {
        return null;
    }

    @Override
    public String unplugDrain() {
        return null;
    }

    public HandyPerson(String name) {
        super(name);
    }
}
