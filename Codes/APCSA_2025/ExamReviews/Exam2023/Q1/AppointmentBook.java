package Exam2023.Q1;

public class AppointmentBook {
    private boolean isMinuteFree(int period, int minute) {
        return false;
    }

    private void reserveBlock(int period, int startMinute, int duration) {
    
    }

    public int findFreeBlock(int period, int duration) {
        // isMinuteFree() helps us to find the first availiable
        // minute in period that can be reserved for an appointment
        int freeMinutes = 0;        // this indicates each free blocks in a period
        int startMinute = 0;        // this indicates the start of free block
        for (int i = 0; i < 60; i++) {
            // i represent minute
            // Now, I should check if this minute is free
            if (isMinuteFree(period, i)) {
                // I use isMinuteFree to check if this minute is free
                // for reservation
                // If i is avaiable, then i is a starting time
                // we want to add up all the connecting minutes that's
                // free for resever
                freeMinutes += 1;
            } else {
                freeMinutes = 0;        // when the connection ends, reset total minutes
            }
            // record the new start minute for the period
            if (freeMinutes == 1) {
                startMinute = i;        // i is the current minute
            }

            // when a free block is long enough for my duration, I return
            // the start minute of this block.
            if (freeMinutes == duration) {
                return startMinute;
            }
        }
        return -1;          // no free block found, return -1
    }

    public boolean makeAppointment(int startPeriod, int endPeriod, int duration) {
        for (int i = startPeriod; i <= endPeriod; i++) {
            // i means each period
            if (findFreeBlock(i, duration) == -1) {
                continue;
            }
            reserveBlock(i, findFreeBlock(i, duration), duration);
            return true;
        }
        return false;
    }



}
