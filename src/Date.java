
/*
 * 
 */
import java.util.Comparator;

/**
 * The Class Date.
 */
public class Date implements Comparable<Date>, Comparator<Date> {

    /** The day. */
    private int day;

    /** The month. */
    private int month;

    /** The year. */
    private int year;

    /**
     * Instantiates a new date.
     */
    public Date() {
        this.day = 1;
        this.month = 1;
        this.year = 2000;
    }

    /**
     * Instantiates a new date.
     *
     * @param day   the day
     * @param month the month
     * @param year  the year
     */
    public Date(int day, int month, int year) {
        this.day = day;
        this.month = month;
        this.year = year;
    }

    /**
     * Instantiates a new date.
     *
     * @param date the date
     */
    public Date(Date date) {
        this.day = date.day;
        this.month = date.month;
        this.year = date.year;
    }

    /**
     * Gets the day.
     *
     * @return the day
     */
    public int getDay() {
        return day;
    }

    /**
     * Gets the month.
     *
     * @return the month
     */
    public int getMonth() {
        return month;
    }

    /**
     * Gets the year.
     *
     * @return the year
     */
    public int getYear() {
        return year;
    }

    /**
     * Sets the day.
     *
     * @param day the new day
     */
    public void setDay(int day) {
        if (day >= 1 && day <= 31) {
            this.day = day;
        } else {
            throw new IllegalArgumentException("Invalid day value");
        }
    }

    /**
     * Sets the month.
     *
     * @param month the new month
     */
    public void setMonth(int month) {
        if (month >= 1 && month <= 12) {
            this.month = month;
        } else {
            throw new IllegalArgumentException("Invalid month value");
        }
    }

    /**
     * Sets the year.
     *
     * @param year the new year
     */
    public void setYear(int year) {
        if (year >= 1900 && year <= 2100) {
            this.year = year;
        } else {
            throw new IllegalArgumentException("Invalid year value");
        }
    }

    /**
     * Sets the date.
     *
     * @param day   the day
     * @param month the month
     * @param year  the year
     */
    public void setDate(int day, int month, int year) {
        setDay(day);
        setMonth(month);
        setYear(year);
    }

    /**
     * Clone.
     *
     * @return the object
     * @throws CloneNotSupportedException the clone not supported exception
     */
    protected Object clone() throws CloneNotSupportedException {
        Date date = new Date(this);
        return date;
    }

    /**
     * Compare to.
     *
     * @param o the o
     * @return the int
     */
    @Override
    public int compareTo(Date o) {
        if (o == null)
            throw new NullPointerException();
        if (o == this)
            return 0;
        if (this.year < o.year)
            return -1;
        if (this.year == o.year && this.month < o.month)
            return -1;
        if (this.year == o.year && this.month == o.month && this.day < o.day)
            return -1;
        return 1;
    }

    /**
     * Compare.
     *
     * @param o1 the o 1
     * @param o2 the o 2
     * @return the int
     */
    @Override
    public int compare(Date o1, Date o2) {
        if (o1 == null || o2 == null)
            throw new NullPointerException();
        if (o1 == o2)
            return 0;
        if (o1.year < o2.year)
            return -1;
        if (o1.year == o2.year && o1.month < o2.month)
            return -1;
        if (o1.year == o2.year && o1.month == o2.month && o1.day < o2.day)
            return -1;
        return 1;
    }

    /**
     * Equals.
     *
     * @param o the o
     * @return true, if successful
     */
    public boolean equals(Date o) {
        if (o == null)
            throw new NullPointerException();
        if (o == this)
            return true;
        if (this.year == o.year && this.month == o.month && this.day == o.day)
            return true;
        return false;
    }

    /**
     * Checks if is leap year.
     *
     * @return true, if is leap year
     */
    public boolean isLeapYear() {
        if (this.year % 4 == 0 && this.year % 100 != 0 || this.year % 400 == 0)
            return true;
        return false;
    }

    /**
     * Days in month.
     *
     * @return the int
     */
    public int daysInMonth() {
        if (this.month == 1 || this.month == 3 || this.month == 5 || this.month == 7 || this.month == 8
                || this.month == 10 || this.month == 12)
            return 31;
        if (this.month == 4 || this.month == 6 || this.month == 9 || this.month == 11)
            return 30;
        if (this.month == 2) {
            if (isLeapYear())
                return 29;
            return 28;
        }
        return -1;
    }

    /**
     * To string.
     *
     * @return the string
     */
    // toString() method
    @Override
    public String toString() {
        return String.format("%02d/%02d/%04d", day, month, year);
    }

}
