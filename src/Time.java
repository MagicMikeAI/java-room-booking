
/*
 * 
 */
import java.util.Comparator;

/**
 * The Class Time.
 */
public class Time implements Comparable<Time>, Comparator<Time> {

    /** The hour. */
    private int hour;

    /** The minute. */
    private int minute;

    /**
     * Instantiates a new time.
     */
    public Time() {
        this.hour = 0;
        this.minute = 0;
    }

    /**
     * Instantiates a new time.
     *
     * @param hour   the hour
     * @param minute the minute
     */
    public Time(int hour, int minute) {
        this.hour = hour;
        this.minute = minute;
    }

    /**
     * Instantiates a new time.
     *
     * @param time the time
     */
    public Time(Time time) {
        this.hour = time.hour;
        this.minute = time.minute;
    }

    /**
     * Instantiates a new time.
     *
     * @param startTime the start time
     */
    public Time(String startTime) {
    }

    /**
     * Gets the hour.
     *
     * @return the hour
     */
    public int getHour() {
        return hour;
    }

    /**
     * Gets the minute.
     *
     * @return the minute
     */
    public int getMinute() {
        return minute;
    }

    /**
     * Sets the hour.
     *
     * @param hour the new hour
     */
    public void setHour(int hour) {
        if (hour >= 0 && hour <= 23) {
            this.hour = hour;
        } else {
            throw new IllegalArgumentException("Invalid hour value");
        }
    }

    /**
     * Sets the minute.
     *
     * @param minute the new minute
     */
    public void setMinute(int minute) {
        if (minute >= 0 && minute <= 59) {
            this.minute = minute;
        } else {
            throw new IllegalArgumentException("Invalid minute value");
        }
    }

    /**
     * Sets the time.
     *
     * @param hour   the hour
     * @param minute the minute
     */
    public void setTime(int hour, int minute) {
        setHour(hour);
        setMinute(minute);
    }

    /**
     * Clone.
     *
     * @return the object
     * @throws CloneNotSupportedException the clone not supported exception
     */
    protected Object clone() throws CloneNotSupportedException {
        Time time = new Time(this);
        return time;
    }

    /**
     * To string.
     *
     * @return the string
     */
    @Override
    public String toString() {
        return String.format("%02d:%02d", hour, minute);
    }

    /**
     * Compare to.
     *
     * @param other the other
     * @return the int
     */
    @Override
    public int compareTo(Time other) {
        if (this.hour < other.hour) {
            return -1;
        } else if (this.hour > other.hour) {
            return 1;
        } else {
            if (this.minute < other.minute) {
                return -1;
            } else if (this.minute > other.minute) {
                return 1;
            } else {
                return 0;
            }
        }
    }

    /**
     * Compare.
     *
     * @param t1 the t 1
     * @param t2 the t 2
     * @return the int
     */
    @Override
    public int compare(Time t1, Time t2) {
        return t1.compareTo(t2);
    }

    /**
     * Equals.
     *
     * @param obj the obj
     * @return true, if successful
     */
    @Override
    public boolean equals(Object obj) {
        if (obj instanceof Time) {
            Time other = (Time) obj;
            return this.hour == other.hour && this.minute == other.minute;
        } else {
            return false;
        }
    }

}
