Campus Event Booking System (Phase 1):

Main: 
Run the program from MainApp to have access to all options.

The application is launched using the MainApp JavaFX class, which loads the graphical user interface from the main.fxml file. com.example.enff1420.ui.MainApp initializes JavaFX and loads the main interface. 

Open the project in your IDE, find the file: src/main/java/com/example/engg1420/ui/MainApp.java Right click MainApp.main() and select Run. The system GUI will open with access to all modules and options 
Options include: Event Manager, Waitlist Manager, Booking Manager, User Manager
The new window will display information based on the option selected
To end the program, simply close all windows

Event Manager:
The window allows users to manage campus events.

When this application is launched, JavaFX initializes the application, the system loads EventManager.fxml from the resources folder, the Event Manager interface appears, allowing administrators to create event details, manage event information, and access event-related operations (Phase 1 features). 

The XML file is stored in src/main/resources/EventManager.fxml, which is required because the program loads it using:getClass().getResource("/EventManager.fxml"). 

Waitlist Manager:
The module provides visibility and control over event waitlists and supports testing of waitlist behaviour and automatic promotions.

com.example.engg1420.ui.WaitlistManagementApp runs the application loads the JavaFX layout, /WaitlistManagement.fxml. 
When this application is launched, JavaFX initializes the application. The system loads WaitlistManagement.fxml from the resources folder, the waitlist management window appears, allowing the user to view event waitlists, inspect waitlist orders, remove waitlisted bookings, and observe automatic promotion behaviour when capacity becomes available. 

XML file is stored in src/main/resources/WaitlistManagement.fxml, which is required because the program loads it using:getClass().getResource("/WaitlistManagement.fxml"). 

Booking Manager:
The booking module connects users and events and manages the reservations. It determines whether a booking becomes confirmed or waitlisted based on the event's capacity. 

The booking class represents a single reservation made by a user for an event; it acts as a linking object between the user and the event.
It stores booking information, tracks booking status, and provides access to associated users and events. 
Attributes, user user; the user making the booking, EventType event; the event being booked, BookingStatus status; current booking state. 
Booking status value Confirmed: seat successfully reserved, Waitlisted: even if a full user is placed on the waitlist. 
Key methods used;
public BookingStatus getStatus()
public EventType getEvent()
public User getUser()
public void SetStatus(BookingStatus status)

The BookingManager Class controls booking creation and manages booking storage, creating bookings, checking event capacity, assigning booking status automatically, maintaining a list of all bookings. (Internal storage; private List<Booking> bookings = new ArrayList<>();). 

The logic is that when the booking is created, the system checks whether the event has available seats. If seats are available, a seat is reserved using event.bookSeat(), booking status becomes confirmed. If the event is full, the booking status becomes waitlisted, and the booking is added to the system's booking list. 

Object-Oriented design was used. 
- booking data is private and accessed through methods
- Booking stores reservations data, BookingManager controls booking logic
- A booking contains references to both a user and an event. 

User:
The system models different types of participants using an inheritance hierarchy. All user types share common attributes and behaviour through a base class called user. 
User (Abstract Base Class): The user class represents a generic system user and serves as the parent class for all specific user roles. It defines shared properties and enforces a common interface that all user types must implement. 
The User class provides: common identity information shared by all users, user, getserType() that subclasses must implement. 
Attributes: Private fields: id; unique identifier for the user, name; user's full name. 

Inheritance Hierarchy;
User (abstract)
student 
staff 
guest. 
Each subclass extends User and provides its own implementation of getUserType()

Object-oriented principles demonstrated
Inheritance: specialized user types reuse shared functionality
Polymorphism: the system can treat all users as User objects while allowing type specific behaviour
Encapsulation; User data is protected through private fields and controlled access methods.

Role in Booking Systems 
User objects are referenced by bookings and determine booking eligibility rules like, maximum confirmed bookings, role-based booking behaviour (student/staff/guest)
