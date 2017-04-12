package entities;

import java.time.LocalDateTime;

public class CalendarEvent {

    private LocalDateTime startDateTime;

    public LocalDateTime getStartDateTime() {
        return startDateTime;
    }

    public void setStartDateTime(LocalDateTime startDateTime) {
        this.startDateTime = startDateTime;
    }
}
