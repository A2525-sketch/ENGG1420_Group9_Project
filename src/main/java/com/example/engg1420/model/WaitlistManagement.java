package com.example.engg1420.model;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class WaitlistManagement {

    private java.util.Map<String, LinkedList<Booking>> waitlists = new java.util.HashMap<>();//Maps each eventId to its ordered waitlist (FIFO)
    private List<Booking> allBookings;//Reference to all bookings in the system (passed in from controller)

    public WaitlistManagement(List<Booking> allBookings) {//Constructor: Intializes the waitlist system with all existing bookings
        this.allBookings = allBookings;//Store reference to all bookings
    }
//Add to waitlist
//Called when an event is full and booking becomes WAITLISTED
    public void addToWaitlist(String eventId, Booking booking) {

        //Integrity check: prevent duplicate waitlist entries for same user+event
        if (isAlreadyWaitlisted(eventId, booking.getUserId())) {
            System.out.println("User " + booking.getUserId() + " is already on the waitlist for event " + eventId);
            return;
        }
        waitlists.putIfAbsent(eventId, new LinkedList<>());//Create a new waitlist if one doesn't exist
        booking.setStatus(BookingStatus.WAITLISTED);//Set booking status to WAITLISTED
        waitlists.get(eventId).add(booking);//Add booking to the end of the waitlist
    }

    //get waitlist for a given event (in order)
    public List<Booking> getWaitlist(String eventId) {
        return waitlists.getOrDefault(eventId, new LinkedList<>());// return waitlist or empty list if none exists
    }

//Remover from  waitlist (when a waitlisted booking is cancelled) Preserves order of remaining entries
    public boolean removeFromWaitlist(String eventId, String userId) {
        LinkedList<Booking> waitlist = waitlists.get(eventId);//Get waitlist for event
        if (waitlist == null) return false;//If no waitlist exists, nothing to remove

        //Remove any bookings matching userId
        boolean removed = waitlist.removeIf(b -> b.getUserId().equals(userId));
        if (removed) {
            //mark the booking itself as CANCELLED
            for (Booking b : allBookings) {//Loop through all bookings
                if (b.getEventId().equals(eventId)//match event
                        && b.getUserId().equals(userId)//match user
                        && b.getStatus() == BookingStatus.WAITLISTED) {//Ensure it's waitlisted
                    b.setStatus(BookingStatus.CANCELLED);//update status to CANCELLED
                    break;//stop once found
                }
            }
        }
        return removed;//return true if removal happened
    }


    //Automatic promotion
    // Call this when a CONFIRMED booking is cancelled.
    // Promotes the first waitlisted user to CONFIRMED.
    // Returns the promoted Booking, or null if waitlist is empty.
    public Booking promoteNext(String eventId, EventType event) {
        LinkedList<Booking> waitlist = waitlists.get(eventId);//get waitlist for event
        if (waitlist == null || waitlist.isEmpty()) return null;//if empty, not promotion possible

        Booking promoted = waitlist.poll(); // Remove and return first booking (FIFO order)
        promoted.setStatus(BookingStatus.CONFIRMED);//Update status to CONFIRMED
        event.bookSeat(); //occupy the newly freed seat
        return promoted;
    }


    // Clear Waitlist (called when an event is cancelled)
    // Marks all waitlisted bookings as CANCELLED

    public void clearWaitlist(String eventId) {
        LinkedList<Booking> waitlist = waitlists.get(eventId);//Get waitlist
        if (waitlist == null) return;//if none exist, do nothing
        for (Booking b : waitlist) {//Loop through each booking
            b.setStatus(BookingStatus.CANCELLED);//Mark each as cancelled
        }
        waitlist.clear();//Remove all entries from the waitlist
    }

    //Integrity check is user already on waitlist?
    public boolean isAlreadyWaitlisted(String eventId, String userId) {
        LinkedList<Booking> waitlist = waitlists.get(eventId);//Get waitlist
        if (waitlist == null) return false;//If no waitlist, user cannot be on it
        //Check if any booking in waitlist matches the userId
        return waitlist.stream().anyMatch(b -> b.getUserId().equals(userId));
    }

    //Load from existing bookings (called at startup after CSV load)
    // Reconstructs waitlists in correct createdAt order
    public void rebuildFromBookings() {
        waitlists.clear();//Clear existing waitlists
        //Process all bookings:
        allBookings.stream()//Convert list to stream
                .filter(b -> b.getStatus() == BookingStatus.WAITLISTED)//keep only WAITLISTED bookings
                .sorted((a, b) -> a.getCreatedAt().compareTo(b.getCreatedAt()))//sort by creation time
                .forEach(b -> {//for each booking
                    waitlists.putIfAbsent(b.getEventId(), new LinkedList<>());//Ensure event waitlist exists
                    waitlists.get(b.getEventId()).add(b);//Add booking in correct order
                });
    }
    //Waitlist Size helper
    public int getWaitlistSize(String eventId) {
        return waitlists.getOrDefault(eventId, new LinkedList<>()).size();//Return size or o id none exists
    }
}