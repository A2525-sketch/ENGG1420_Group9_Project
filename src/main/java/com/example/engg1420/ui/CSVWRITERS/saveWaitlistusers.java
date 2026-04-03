
package com.example.engg1420.ui.CSVWRITERS;
import com.example.engg1420.model.Booking;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class saveWaitlistusers {

    private static final String BASE_DIR = "data/";

    public void saveWaitlistusers(Booking booking) {

        try {
            File dir = new File(BASE_DIR);
            if (!dir.exists()) dir.mkdirs();

            String filename = BASE_DIR + "Waitlist_user_" + booking.getUserId() + ".csv";
            System.out.println("Writing file to: " + new File(filename).getAbsolutePath());

            try (FileWriter writer = new FileWriter(filename, true)) {
                writer.write(
                        booking.getBookingId() + "," +
                                booking.getUserId() + "," +
                                booking.getEventId() + "," +
                                booking.getCreatedAt() + "," +
                                booking.getStatus() + "\n"
                );
            }

            System.out.println("Booking saved for user " + booking.getUserId());

        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}