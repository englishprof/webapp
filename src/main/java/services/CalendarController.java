package services;

import entities.CalendarEvent;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.time.LocalDateTime;

@RestController
@RequestMapping("/calendar")
public class CalendarController {

    @RequestMapping(method = RequestMethod.GET)
    public CalendarEvent getCalendarEvent() {
        CalendarEvent calendarEvent = new CalendarEvent();
        calendarEvent.setStartDateTime(LocalDateTime.now());
        return calendarEvent;
    }
}
