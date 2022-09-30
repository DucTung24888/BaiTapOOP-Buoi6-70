package OOPBaiTap10;

public class MovablePoint implements Movable{
    @Override
    public void moveUp() {
        y-= ySpeed;
    }

    @Override
    public void moveDown() {
        y += ySpeed;
    }

    @Override
    public void moveLeft() {
        x -= xSpeed;
    }

    @Override
    public void moveRight() {
        y -= ySpeed;
    }
    private int x;
    private int y;
    private int xSpeed;
    private int ySpeed;

    @Override
    public String toString() {
        return String.format("(%d,%d) speed=(%d, %d),x,y,x,y");
    }
}
