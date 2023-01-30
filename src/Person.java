
/*
 * 
 */
import java.util.Comparator;

/**
 * The Class Person.
 */
public class Person implements Comparable<Person>, Comparator<Person> {

    /** The id. */
    private int id;

    /** The first name. */
    private String firstName;

    /** The last name. */
    private String lastName;

    /** The next id. */
    private static int nextId = 1;

    /**
     * Instantiates a new person.
     */
    public Person() {
        this.id = nextId++;
        this.firstName = "";
        this.lastName = "";
    }

    /**
     * Instantiates a new person.
     *
     * @param firstName the first name
     * @param lastName  the last name
     */
    public Person(String firstName, String lastName) {
        this.id = nextId++;
        this.firstName = firstName;
        this.lastName = lastName;
    }

    /**
     * Instantiates a new person.
     *
     * @param person the person
     */
    public Person(Person person) {
        this.id = person.id;
        this.firstName = person.firstName;
        this.lastName = person.lastName;

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
     * Gets the first name.
     *
     * @return the first name
     */
    public String getFirstName() {
        return firstName;
    }

    /**
     * Gets the last name.
     *
     * @return the last name
     */
    public String getLastName() {
        return lastName;
    }

    /**
     * Sets the first name.
     *
     * @param firstName the new first name
     */
    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    /**
     * Sets the last name.
     *
     * @param lastName the new last name
     */
    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    /**
     * Sets the name.
     *
     * @param firstName the first name
     * @param lastName  the last name
     */
    public void setName(String firstName, String lastName) {
        setFirstName(firstName);
        setLastName(lastName);
    }

    /**
     * To string.
     *
     * @return the string
     */
    @Override
    public String toString() {
        return String.format("%d: %s %s", id, firstName, lastName);
    }

    /**
     * Compare to.
     *
     * @param other the other
     * @return the int
     */
    @Override
    public int compareTo(Person other) {
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
     * @param p1 the p 1
     * @param p2 the p 2
     * @return the int
     */
    @Override
    public int compare(Person p1, Person p2) {
        return p1.compareTo(p2);
    }

    /**
     * Equals.
     *
     * @param obj the obj
     * @return true, if successful
     */
    @Override
    public boolean equals(Object obj) {
        if (obj == null) {
            return false;
        } else if (obj == this) {
            return true;
        } else if (obj.getClass() != this.getClass()) {
            return false;
        } else {
            Person other = (Person) obj;
            return this.id == other.id;
        }
    }

    /**
     * Clone.
     *
     * @return the object
     * @throws CloneNotSupportedException the clone not supported exception
     */
    protected Object clone() throws CloneNotSupportedException {
        Person person = new Person(this);
        return person;
    }

}
