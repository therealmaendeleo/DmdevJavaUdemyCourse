package oop.task;

public class TimeInterval {
    public static final int SECONDS_IN_HOUR = 3600;

    private int seconds;
    private int minutes;
    private int hours;

    public TimeInterval(int seconds) {
        this.hours = seconds / SECONDS_IN_HOUR;
        this.minutes = (seconds % SECONDS_IN_HOUR) / 60;
        this.seconds = seconds % 60;
    }

    public TimeInterval(int seconds, int minutes, int hours) {
        this.seconds = seconds;
        this.minutes = minutes;
        this.hours = hours;
    }

    public int totalSeconds() {
        return seconds + minutes * 60 + hours * 60 * 60;
    }

    public TimeInterval sum(TimeInterval interval) {
        return new TimeInterval(totalSeconds() + interval.totalSeconds());
    }

    @Override
    public String toString() {
        return String.format("TimeInterval = %d:%d:%d", hours, minutes, seconds);
    }
}
