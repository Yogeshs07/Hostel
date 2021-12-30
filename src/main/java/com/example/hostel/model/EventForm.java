package com.example.hostel.model;

public class EventForm {
    private Integer eventId;
    private String eventName;
    private String eventDescription;
    private String eventDestination;
    private String eventStartDatetime;
    private String eventEndDatetime;

    public Integer getEventId() {
        return eventId;
    }

    public void setEventId(Integer eventId) {
        this.eventId = eventId;
    }

    public String getEventName() {
        return eventName;
    }

    public void setEventName(String eventName) {
        this.eventName = eventName;
    }

    public String getEventDescription() {
        return eventDescription;
    }

    public void setEventDescription(String eventDescription) {
        this.eventDescription = eventDescription;
    }

    public String getEventStartDatetime() {
        return eventStartDatetime;
    }

    public void setEventStartDatetime(String eventStartDatetime) {
        this.eventStartDatetime = eventStartDatetime;
    }

    public String getEventEndDatetime() {
        return eventEndDatetime;
    }

    public void setEventEndDatetime(String eventEndDatetime) {
        this.eventEndDatetime = eventEndDatetime;
    }

    public String getEventDestination() {
        return eventDestination;
    }

    public void setEventDestination(String eventDestination) {
        this.eventDestination = eventDestination;
    }
}
