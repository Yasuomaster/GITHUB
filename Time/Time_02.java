package Homeworks.Time;

public class Time_02 {
    private int hour;
    private int minute;
    private int second;

    Time_02 (int hour,int minute,int second) {
        this.hour = hour;
        this.minute = minute;
        this.second = second;
    }

    public int getHour() {
        return hour;
    }

    public void setHour(int hour) {
        if (hour < 0 || hour > 23)
            return;
        this.hour = hour;
    }

    public int getMinute() {
        return minute;
    }

    public void setMinute(int minute) {
        if (hour < 0 || hour > 59)
            return;
        this.minute = minute;
    }

    public int getSecond() {
        return second;
    }

    public void setSecond(int second) {
        if (second < 0 || second > 23)
            return;
        this.second = second;
    }

}

class TimeTest {
    public static void main(String[] args) {
        Time_02 t = new Time_02(12,35,38);
        System.out.println(t.getHour());
        //t.hour = 13;
        t.setHour(t.getHour()+1);
        System.out.println(t.getHour());
    }
}
