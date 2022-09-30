package OOPBaiTap8;

public class NobodySprcial extends Human implements Plumber,Electrian{
    @Override
    public String changeBulb() {
        return null;
    }

    @Override
    public String unplugDrain() {
        return null;
    }

    public NobodySprcial(String name) {
        super(name);
    }
}
