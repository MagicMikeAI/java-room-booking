
/*
 * 
 */
import java.util.Comparator;

/**
 * The Class Appointment.
 */
public class Appointment implements Comparable<Appointment>, Comparator<Appointment> {

    /** The id. */
    private int id;

    /** The next id. */
    private static int nextId = 1;

    /** The start time. */
    private Time startTime;

    /** The end time. */
    private Time endTime;

    /** The date. */
    private Date date;

    /** The description. */
    private String description;

    /** The meeting room. */
    MeetingRoom meetingRoom;

    /** The person. */
    private Person person;

    /**
     * Instantiates a new appointment.
     *
     * @param startTime   the start time
     * @param endTime     the end time
     * @param date        the date
     * @param description the description
     * @param meetingRoom the meeting room
     * @param person      the person
     */
    public Appointment(String startTime, String endTime, String date, String description, MeetingRoom meetingRoom,
            Person person) {
        this.id = nextId++;
        this.startTime = new Time(startTime);
        this.endTime = new Time(endTime);
        this.date = new Date();
        this.description = "";
        this.meetingRoom = new MeetingRoom();
        this.person = new Person();
    }

    /**
     * Instantiates a new appointment.
     *
     * @param startTime   the start time
     * @param endTime     the end time
     * @param date        the date
     * @param description the description
     * @param meetingRoom the meeting room
     * @param person      the person
     */
    public Appointment(Time startTime, Time endTime, Date date, String description, MeetingRoom meetingRoom,
            Person person) {
        this.id = nextId++;
        this.startTime = startTime;
        this.endTime = endTime;
        this.date = date;
        this.description = description;
        this.meetingRoom = meetingRoom;
        this.person = person;
    }

    /**
     * Instantiates a new appointment.
     *
     * @param appointment the appointment
     */
    public Appointment(Appointment appointment) {
        this.id = appointment.id;
        this.startTime = appointment.startTime;
        this.endTime = appointment.endTime;
        this.date = appointment.date;
        this.description = appointment.description;
        this.meetingRoom = appointment.meetingRoom;
        this.person = appointment.person;
    }

    /**
     * Gets the id.
     *
     * @return the id
     */
    public int getId() {
        return id;
    }

    /**
     * Gets the start time.
     *
     * @return the start time
     */
    public Time getStartTime() {
        return startTime;
    }

    /**
     * Gets the end time.
     *
     * @return the end time
     */
    public Time getEndTime() {
        return endTime;
    }

    /**
     * Gets the date.
     *
     * @return the date
     */
    public Date getDate() {
        return date;
    }

    /**
     * Gets the description.
     *
     * @return the description
     */
    public String getDescription() {
        return description;
    }

    /**
     * Gets the meeting room.
     *
     * @return the meeting room
     */
    public MeetingRoom getMeetingRoom() {
        return meetingRoom;
    }

    /**
     * Gets the person.
     *
     * @return the person
     */
    public Person getPerson() {
        return person;
    }

    /**
     * Sets the start time.
     *
     * @param startTime the new start time
     */
    public void setStartTime(Time startTime) {
        this.startTime = startTime;
    }

    /**
     * Sets the end time.
     *
     * @param endTime the new end time
     */
    public void setEndTime(Time endTime) {
        this.endTime = endTime;
    }

    /**
     * Sets the date.
     *
     * @param date the new date
     */
    public void setDate(Date date) {
        this.date = date;
    }

    /**
     * Sets the description.
     *
     * @param description the new description
     */
    public void setDescription(String description) {
        this.description = description;
    }

    /**
     * Sets the meeting room.
     *
     * @param meetingRoom the new meeting room
     */
    public void setMeetingRoom(MeetingRoom meetingRoom) {
        this.meetingRoom = meetingRoom;
    }

    /**
     * Sets the person.
     *
     * @param person the new person
     */
    public void setPerson(Person person) {
        this.person = person;
    }

    /**
     * Sets the appointment.
     *
     * @param startTime   the start time
     * @param endTime     the end time
     * @param date        the date
     * @param description the description
     * @param meetingRoom the meeting room
     * @param person      the person
     */
    public void setAppointment(Time startTime, Time endTime, Date date, String description, MeetingRoom meetingRoom,
            Person person) {
        setStartTime(startTime);
        setEndTime(endTime);
        setDate(date);
        setDescription(description);
        setMeetingRoom(meetingRoom);
        setPerson(person);
    }

    /**
     * To string.
     *
     * @return the string
     */
    @Override

    public String toString() {
        return String.format(
                "Meeting ID: %d - Time %s - %s - Date: %s - Description: %s - Meeting Room: %s - Person: %s",
                id, startTime, endTime, date, description, meetingRoom, person);
    }

    /**
     * Compare to.
     *
     * @param other the other
     * @return the int
     */
    @Override
    public int compareTo(Appointment other) {
        if (this.id < other.id) {
            return -1;
        } else if (this.id > other.id) {
            return 1;
        } else {
            return 0;
        }
    }

    /**
     * Compare.
     *
     * @param o1 the o 1
     * @param o2 the o 2
     * @return the int
     */
    @Override

    public int compare(Appointment o1, Appointment o2) {
        if (o1.id < o2.id) {
            return -1;
        } else if (o1.id > o2.id) {
            return 1;
        } else {
            return 0;
        }
    }

    /**
     * Shallow copy.
     *
     * @return the object
     */
    protected Object shallowCopy() {
        return new Appointment(this.startTime, this.endTime, this.date, this.description, this.meetingRoom,
                this.person);
    }

    /**
     * Deep copy.
     *
     * @return the appointment
     * @throws CloneNotSupportedException the clone not supported exception
     */
    public Appointment deepCopy() throws CloneNotSupportedException {
        Appointment a = new Appointment(this);
        a.startTime = (Time) this.startTime.clone();
        a.endTime = (Time) this.endTime.clone();
        a.date = (Date) this.date.clone();
        a.description = new String(this.description);
        a.meetingRoom = (MeetingRoom) this.meetingRoom.clone();
        a.person = (Person) this.person.clone();

        return a;

    }

    /** The date comparator. */
    // sort by date
    public static Comparator<Appointment> dateComparator = new Comparator<Appointment>() {
        public int compare(Appointment o1, Appointment o2) {
            return o1.date.compareTo(o2.date);
        }

    };

    /** The description comparator. */
    // sort by description
    public static Comparator<Appointment> descriptionComparator = new Comparator<Appointment>() {
        public int compare(Appointment o1, Appointment o2) {
            return o1.description.compareTo(o2.description);
        }
    };

    // sort by meeting room

    /** The meeting room comparator. */
    public static Comparator<Appointment> meetingRoomComparator = new Comparator<Appointment>() {
        public int compare(Appointment o1, Appointment o2) {
            return o1.meetingRoom.compareTo(o2.meetingRoom);
        }
    };

    // sort by person

    /** The person comparator. */
    public static Comparator<Appointment> personComparator = new Comparator<Appointment>() {
        public int compare(Appointment o1, Appointment o2) {
            return o1.person.compareTo(o2.person);
        }
    };

    /** The start time comparator. */
    // sort appoints by start time
    public static Comparator<Appointment> startTimeComparator = new Comparator<Appointment>() {
        public int compare(Appointment o1, Appointment o2) {
            return o1.startTime.compareTo(o2.startTime);
        }
    };

    /** The end time comparator. */
    // sort appoints by end time
    public static Comparator<Appointment> endTimeComparator = new Comparator<Appointment>() {
        public int compare(Appointment o1, Appointment o2) {
            return o1.endTime.compareTo(o2.endTime);
        }
    };

    /** The id comparator. */
    // sort appoints by id
    public static Comparator<Appointment> idComparator = new Comparator<Appointment>() {
        public int compare(Appointment o1, Appointment o2) {
            return o1.id - o2.id;
        }
    };

}
