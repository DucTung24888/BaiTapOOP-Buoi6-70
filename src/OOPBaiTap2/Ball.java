package OOPBaiTap2;

import OOPBaiTap1.Time;

public class Ball {
    private float x;
    private float y;
    private int radius;
    private float xDelta;
    private float yDelta;

    public Ball(float x, float y, int radius, float xDelta, float yDelta) {
        this.x = x;
        this.y = y;
        this.radius = radius;
        this.xDelta = xDelta;
        this.yDelta = yDelta;
    }

    public float getX() {
        return x;
    }

    public void setX(float x) {
        this.x = x;
    }

    public float getY() {
        return y;
    }

    public void setY(float y) {
        this.y = y;
    }

    public int getRadius() {
        return radius;
    }

    public void setRadius(int radius) {
        this.radius = radius;
    }

    public float getxDelta() {
        return xDelta;
    }

    public void setxDelta(float xDelta) {
        this.xDelta = xDelta;
    }

    public float getyDelta() {
        return yDelta;
    }

    public void setyDelta(float yDelta) {
        this.yDelta = yDelta;
    }

    public void move() {
        x+=xDelta;
        y+=yDelta;
    }

    public void reflectHorvizontal() {
        xDelta= -xDelta;
    }

    public void reflectVertical() {
        yDelta = -yDelta;
    }

    @Override
    public String toString() {
        return String.format("Ball[%.1f,%.1f],speed=[%.1f,%.1f]",x,y,xDelta,yDelta);
    }

    public static void main(String[] args) {
        Ball ball = new Ball((float)1.1,(float)2.2,5,(float) 3.3,(float)4.4);
        System.out.println(ball);
        Ball ball1 = new Ball((float)80.0,(float)35,5,(float) 4,(float)6.0);
        System.out.println(ball1);
        System.out.println("x is: "+ball1.getX());
        System.out.println("y is: "+ball1.getY());
        System.out.println("radius is: "+ball1.getRadius());
        System.out.println("xDelta is: "+ball1.getxDelta());
        System.out.println("yDelta is: "+ball1.getyDelta());

    }
}
