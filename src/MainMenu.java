import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;

/**
 * The Class MainMenu.
 */
public class MainMenu {

    /** The scanner. */
    private static Scanner scanner = new Scanner(System.in);

    /** The persons. */
    private static ArrayList<Person> persons = new ArrayList<>();

    /** The meeting rooms. */
    private static ArrayList<MeetingRoom> meetingRooms = new ArrayList<>();

    /** The appointments. */
    private static ArrayList<Appointment> appointments = new ArrayList<>();

    /**
     * The main method.
     *
     * @param args the arguments
     * @throws CloneNotSupportedException the clone not supported exception
     */
    public static void main(String[] args) throws CloneNotSupportedException {
        int choice = 0;
        do {
            System.out.println("1. Dummy Data");
            System.out.println("2. TEST001");
            System.out.println("3. TEST002");
            System.out.println("4. TEST003");
            System.out.println("5. TEST004");
            System.out.println("6. EXTRA FEATURES");
            System.out.println("7. Exit");
            System.out.print("Enter your choice: ");
            choice = scanner.nextInt();
            scanner.nextLine();
            switch (choice) {
                case 1:
                    DummyData();
                    break;
                case 2:
                    Test001();
                    break;
                case 3:
                    Test002();
                    break;
                case 4:
                    Test003();
                    break;
                case 5:
                    Test004();
                    break;
                case 6:
                    ExtraFeatures();
                    break;
                case 7:
                    System.out.println("Goodbye!");
                    break;

                default:
                    System.out.println("Invalid choice!");
            }
        } while (choice != 7);
    }

    // Menu for extra features
    /**
     * Extra features.
     *
     * @throws CloneNotSupportedException the clone not supported exception
     */

    private static void ExtraFeatures() throws CloneNotSupportedException {
        checkArray();
        int choice = 0;
        System.out.println("\n----==== Features Menu ====----");
        do {
            int i = 1;
            System.out.println(i++ + ". Add person");
            System.out.println(i++ + ". Add meeting room");
            System.out.println(i++ + ". List persons");
            System.out.println(i++ + ". List meeting rooms");
            System.out.println(i++ + ". List appointments");
            System.out.println(i++ + ". Sort appointments by date");
            System.out.println(i++ + ". Sort appointments by Start time");
            System.out.println(i++ + ". Sort appointments by End time");
            System.out.println(i++ + ". Sort appointments by description");
            System.out.println(i++ + ". Sort appointments by meeting room");
            System.out.println(i++ + ". Sort appointments by name");
            System.out.println(i++ + ". Sort appointments by id");
            System.out.println(i++ + ". Back ");
            System.out.print("Enter your choice: ");
            i = 1;
            choice = scanner.nextInt();
            scanner.nextLine();
            switch (choice) {
                case 1:
                    addPerson();
                    break;
                case 2:
                    addMeetingRoom();
                    break;
                case 3:
                    listPersons();
                    break;
                case 4:
                    listMeetingRooms();
                    break;
                case 5:
                    listAppointments();
                    break;
                case 6:
                    Collections.sort(appointments, Appointment.dateComparator);
                    System.out.println("-------======== Sorted by date ========-------");
                    listAppointments();
                    break;
                case 7:
                    Collections.sort(appointments, Appointment.startTimeComparator);
                    System.out.println("-------======== Sorted by start time ========-------");
                    listAppointments();
                    break;
                case 8:
                    Collections.sort(appointments, Appointment.endTimeComparator);
                    System.out.println("-------======== Sorted by end time ========-------");
                    listAppointments();
                    break;

                case 9:
                    Collections.sort(appointments, Appointment.descriptionComparator);
                    System.out.println("-------======== Sorted by description ========-------");
                    listAppointments();
                    break;
                case 10:
                    Collections.sort(appointments, Appointment.meetingRoomComparator);
                    System.out.println("-------======== Sorted by meeting room ========-------");
                    listAppointments();
                    break;
                case 11:
                    Collections.sort(appointments, Appointment.personComparator);
                    System.out.println("-------======== Sorted by name ========-------");
                    listAppointments();
                    break;
                case 12:
                    Collections.sort(appointments, Appointment.idComparator);
                    System.out.println("-------======== Sorted by id ========-------");
                    listAppointments();
                    break;
                case 13:

                    System.out.println("Back");
                    break;

                default:
                    System.out.println("Invalid choice!");
            }
        } while (choice != 13);

    }

    /**
     * Dummy data.
     *
     * @throws CloneNotSupportedException the clone not supported exception
     */

    private static void DummyData() throws CloneNotSupportedException {
        System.out.println("\n\n==== Create a class called Test001 that simply creates a number of appointments.===");

        persons.add(new Person("Darth", "Vader"));
        persons.add(new Person("Han", "Solo"));
        persons.add(new Person("Luke", "Skywalker"));
        persons.add(new Person("Obi-Wan", "Kenobi"));

        meetingRooms.add(new MeetingRoom("C2-02"));
        meetingRooms.add(new MeetingRoom("C1-05"));
        meetingRooms.add(new MeetingRoom("C5-01"));
        meetingRooms.add(new MeetingRoom("C2-06"));

        appointments.add(new Appointment(
                new Time(10, 0), new Time(11, 0),
                new Date(1, 9, 2022),
                "Jakku Independence   ",
                meetingRooms.get(0),
                persons.get(0)));
        appointments.add(new Appointment(
                new Time(14, 0),
                new Time(15, 0),
                new Date(12, 3, 2022),
                "Dark Star Plans      ", meetingRooms.get(1),
                persons.get(1)));
        appointments.add(new Appointment(
                new Time(11, 0),
                new Time(12, 0),
                new Date(1, 6, 2022),
                "Ileenium system      ",
                meetingRooms.get(2),
                persons.get(2)));
        appointments.add(new Appointment(
                new Time(16, 0),
                new Time(17, 0),
                new Date(1, 3, 2022),
                "Outer Rim Territories",
                meetingRooms.get(3),
                persons.get(3)));

        System.out.println("");

        System.out.println("----==== Persons ====----");
        for (int i = 0; i < persons.size(); i++) {
            System.out.println(persons.get(i));
        }
        System.out.println("");

        System.out.println("----==== Meeting Rooms ====----");
        for (int i = 0; i < meetingRooms.size(); i++) {
            System.out.println(meetingRooms.get(i));
        }
        System.out.println("");

        System.out.println("----==== Appointments ====----");
        for (int i = 0; i < appointments.size(); i++) {
            System.out.println(appointments.get(i));
        }
        System.out.println("");

        System.out.println("Press enter to continue...");
        scanner.nextLine();

    }

    /**
     * Check array.
     *
     * @throws CloneNotSupportedException the clone not supported exception
     */
    private static void checkArray() throws CloneNotSupportedException {
        if (appointments.size() == 0) {
            System.out.println("No appointments");
            DummyData();
            System.out.println("---==== Dummy Data Added ====---");
        } else {
            System.out.println("Appointments already exist");
        }
        return;
    }

    /**
     * Test 001.
     *
     * @throws CloneNotSupportedException the clone not supported exception
     */
    private static void Test001() throws CloneNotSupportedException {
        checkArray();

        System.out.println("==== Demonstration of Shallow Copy ====\n");

        System.out.println("----==== Shallow Copy of the first Appointment ====----");

        Appointment shallowAppointment = null;

        shallowAppointment = (Appointment) appointments.get(0).shallowCopy();

        // add it to the list of appointments
        appointments.add(shallowAppointment);

        System.out.println(shallowAppointment);
        System.out.println("");

        System.out.println("----==== Original and Copy Appointments ====----");
        // print first appointment
        System.out.println(appointments.get(0));
        // print shallow copy of first appointment
        System.out.println(appointments.get(4));
        System.out.println("");

        // change the name of the shallow copy appointment so we can see the difference
        // if it is a shallow copy or not
        shallowAppointment.getPerson().setFirstName("Old Skywalker");

        System.out.println("----==== Original and Copy Appointments After the Change of name ====----");
        // print first appointment
        System.out.println(appointments.get(0));
        // print shallow copy of first appointment

        System.out.println(shallowAppointment);
        System.out.println("");

        System.out.println("----==== Appointments  After the change of Name ====----");
        for (int i = 0; i < appointments.size(); i++) {
            System.out.println(appointments.get(i));
        }
        System.out.println("");

        System.out.println(
                "\nAfter the change of name it can be seen that the copy is a shallow copy and not a deep copy,\nbecause the name of the person was changed in both the original and the copy of the appointment.\n");
        System.out.println("Press enter to continue...");
        scanner.nextLine();
    }

    /**
     * Test 002.
     *
     * @throws CloneNotSupportedException the clone not supported exception
     */
    private static void Test002() throws CloneNotSupportedException {
        checkArray();

        System.out.println("==== Demonstration of Deep Copy ====\n");

        System.out.println("----==== Deep Copy of the first Appointment ====----");

        Appointment deepAppointment = (Appointment) appointments.get(0).deepCopy();
        appointments.add(deepAppointment);

        // print the deep copy of the first appointment
        System.out.println(deepAppointment);

        System.out.println("----==== Original and Copy Appointments ====----");
        System.out.println(appointments.get(0));
        System.out.println(deepAppointment);

        deepAppointment.getPerson().setFirstName("DarkForce");
        System.out.println("----==== Appointments  After the change of Name ====----");
        System.out.println(appointments.get(0));
        System.out.println(deepAppointment);

        System.out.println("");

        System.out.println("----==== Appointments  After the change of Name ====----");
        for (int i = 0; i < appointments.size(); i++) {
            System.out.println(appointments.get(i));
        }
        System.out.println("");

        System.out.println(
                "\nAfter the change of name it can be seen that the copy is a deep copy and not a shallow copy,\nbecause the name of the person was changed only in the copy of the appointment.\n");

        System.out.println("Press enter to continue...");

        scanner.nextLine();

    }

    /**
     * Test 003.
     *
     * @throws CloneNotSupportedException the clone not supported exception
     */
    private static void Test003() throws CloneNotSupportedException {
        checkArray();

        // create an Array with the size of the appointments arraylist
        Appointment[] appointmentsArray = new Appointment[appointments.size()];
        // add the appointments to the array in the same order
        for (int i = 0; i < appointments.size(); i++) {
            appointmentsArray[i] = appointments.get(i);
        }

        // print ArrayList of the appointments
        System.out.println("----==== Appointments ArrayList ====----");
        for (int i = 0; i < appointments.size(); i++) {
            System.out.println(appointments.get(i));
        }

        // print the array
        System.out.println("----==== Appointments Array ====----");
        for (int i = 0; i < appointmentsArray.length; i++) {
            System.out.println(appointmentsArray[i]);
        }

        // Create an Appointment reference called searchAppointment and assign it a
        // reference to an unsorted Appointment object.
        Appointment searchAppointment = appointments.get(2);

        // Create another Appointment reference called searchAppointmentClone and assign
        // it the clone of searchAppointment.
        Appointment searchAppointmentClone = appointmentsArray[2];

        // . What exactly does the search try to match up? Can you verify your answer?
        // in the example below, the search is trying to match the reference of the
        // object that was initaly stored in the arraylist and the array, therefore the
        // search will return the same object.
        System.out.println("\nsearchAppointment      = " + searchAppointment
                + "\nsearchAppointmentClone = " + searchAppointmentClone + "\n");

        // Sort the ArrayList of Appointment objects by room.
        Collections.sort(appointments, Appointment.dateComparator);

        // Sort the array of Appointment objects.

        Arrays.sort(appointmentsArray, Appointment.dateComparator);

        // Print the ArrayList of Appointment objects.

        System.out.println("----==== Appointments ArrayList After Sorting by Date ====----");
        for (Appointment appointment : appointments) {
            System.out.println(appointment);
        }

        // Print the array of Appointment objects.

        System.out.println("----==== Appointments Array After Sorting by Date ====----");

        for (int i = 0; i < appointmentsArray.length; i++) {
            System.out.println(appointmentsArray[i]);
        }

        System.out.println("\nsearchAppointment      = " + searchAppointment
                + "\nsearchAppointmentClone = " + searchAppointmentClone + "\n");

        // Create an ArrayList of Appointment objects called appointmentsArrayList and
        // assign it a reference to a new ArrayList of Appointment objects.
        System.out.println("Press enter to continue...");
        scanner.nextLine();
    }

    /**
     * Test 004.
     *
     * @throws CloneNotSupportedException the clone not supported exception
     */
    private static void Test004() throws CloneNotSupportedException {
        checkArray();
        // create an Array with the size of the appointments arraylist
        Appointment[] appointmentsArray = new Appointment[appointments.size()];
        // add the appointments to the array in the same order
        for (int i = 0; i < appointments.size(); i++) {
            appointmentsArray[i] = appointments.get(i);
        }

        // print ArrayList of the appointments
        System.out.println("----==== Appointments ArrayList ====----");
        for (int i = 0; i < appointments.size(); i++) {
            System.out.println(appointments.get(i));
        }

        // print the array
        System.out.println("----==== Appointments Array ====----");
        for (int i = 0; i < appointmentsArray.length; i++) {
            System.out.println(appointmentsArray[i]);
        }

        Collections.sort(appointments, Appointment.meetingRoomComparator);

        Arrays.sort(appointmentsArray, Appointment.meetingRoomComparator);

        System.out.println("----==== Appointments ArrayList After Sorting by Room ====----");
        for (Appointment appointment : appointments) {
            System.out.println(appointment);
        }

        System.out.println("----==== Appointments Array After Sorting by Room ====----");

        for (int i = 0; i < appointmentsArray.length; i++) {
            System.out.println(appointmentsArray[i]);
        }

        System.out.println("Press enter to continue...");
        scanner.nextLine();

    }

    /**
     * Adds the person.
     */
    private static void addPerson() {
        System.out.println("");
        System.out.print("Enter first name: ");
        String firstName = scanner.nextLine();
        System.out.print("Enter last name: ");
        String lastName = scanner.nextLine();
        persons.add(new Person(firstName, lastName));
        System.out.println("");

    }

    /**
     * Adds the meeting room.
     */
    private static void addMeetingRoom() {
        System.out.println("");
        System.out.print("Enter name: ");
        String name = scanner.nextLine();
        meetingRooms.add(new MeetingRoom(name));
        System.out.println("");

    }

    /**
     * List persons.
     */
    private static void listPersons() {
        System.out.println("\n----==== Persons ====----");
        for (Person person : persons) {
            System.out.println(person);
        }
        System.out.println("");
    }

    /**
     * List meeting rooms.
     */
    private static void listMeetingRooms() {
        System.out.println("\n----==== Meeting Rooms ====----");
        for (MeetingRoom meetingRoom : meetingRooms) {
            System.out.println(meetingRoom);
        }
        System.out.println("");
    }

    /**
     * List appointments.
     */
    private static void listAppointments() {
        System.out.println("\n----==== Appointments ====----");
        for (Appointment appointment : appointments) {
            System.out.println(appointment);
        }
        System.out.println("");
    }

}