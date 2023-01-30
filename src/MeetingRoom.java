
/*
 * 
 */
import java.util.Comparator;

/**
 * The Class MeetingRoom.
 */
public class MeetingRoom implements Comparable<MeetingRoom>, Comparator<MeetingRoom> {

    /** The room. */
    private String room;

    /**
     * Instantiates a new meeting room.
     */
    public MeetingRoom() {
        this.room = "";
    }

    /**
     * Instantiates a new meeting room.
     *
     * @param room the room
     */
    public MeetingRoom(String room) {
        this.room = room;
    }

    /**
     * Instantiates a new meeting room.
     *
     * @param meetingRoom the meeting room
     */
    // Deep copy constructor
    public MeetingRoom(MeetingRoom meetingRoom) {
        this.room = meetingRoom.room;

    }

    /**
     * Gets the room.
     *
     * @return the room
     */
    public String getRoom() {
        return room;
    }

    /**
     * Sets the room.
     *
     * @param room the new room
     */
    public void setRoom(String room) {
        this.room = room;
    }

    /**
     * Compare to.
     *
     * @param meetingRoom the meeting room
     * @return the int
     */
    public int compareTo(MeetingRoom meetingRoom) {
        return this.room.compareTo(meetingRoom.room);
    }

    /**
     * Compare.
     *
     * @param meetingRoom1 the meeting room 1
     * @param meetingRoom2 the meeting room 2
     * @return the int
     */
    public int compare(MeetingRoom meetingRoom1, MeetingRoom meetingRoom2) {
        return meetingRoom1.room.compareTo(meetingRoom2.room);
    }

    /**
     * Equals.
     *
     * @param obj the obj
     * @return true, if successful
     */
    public boolean equals(Object obj) {
        if (obj instanceof MeetingRoom) {
            MeetingRoom meetingRoom = (MeetingRoom) obj;
            return this.room.equals(meetingRoom.room);
        } else {
            return false;
        }
    }

    /**
     * To string.
     *
     * @return the string
     */
    public String toString() {
        return String.format("%s", room);
    }

    /**
     * Clone.
     *
     * @return the object
     * @throws CloneNotSupportedException the clone not supported exception
     */
    protected Object clone() throws CloneNotSupportedException {
        MeetingRoom meetingRoom = new MeetingRoom(this);
        return meetingRoom;
    }

    /**
     * Gets the name.
     *
     * @return the name
     */
    public Object getName() {
        return this.room;
    }

}
