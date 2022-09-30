package OOPBaiTap1;

public class Time {
    private int hour;
    private int minute;
    private int second;

    public Time(int hour, int minute, int second) {
        this.hour = hour;
        this.minute = minute;
        this.second = second;
    }

    public int getHour() {
        return hour;
    }

    public void setHour(int hour) {
        this.hour = hour;
    }

    public int getMinute() {
        return minute;
    }

    public void setMinute(int minute) {
        this.minute = minute;
    }

    public int getSecond() {
        return second;
    }

    public void setSecond(int second) {
        this.second = second;
    }

    public void setTime(int hour,int minute,int second){
        this.hour = hour;
        this.minute = minute;
        this.second = second;
    }

    @Override
    public String toString() {
        return String.format("%02d:%02d:%02d",hour,minute,second);
    }

    protected Time nextSecond(){
        return new Time(hour,minute,second+1);
    }

    public static void main(String[] args) {
        Time time = new Time(01,02,03);
        System.out.println(time);
        Time time1 = new Time(04,05,06);
        System.out.println(time1);
        System.out.println("Hour: "+time1.hour);
        System.out.println("Minute: "+time1.minute);
        System.out.println("Second: "+time1.second);
    }
}
