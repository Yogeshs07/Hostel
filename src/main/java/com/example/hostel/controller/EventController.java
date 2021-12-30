package com.example.hostel.controller;

import com.example.hostel.model.EventForm;
import com.example.hostel.model.EventModel;
import com.example.hostel.service.EventService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.text.ParseException;
import java.util.List;

@Controller
public class EventController {

    @Autowired
    private EventService eventService;

    @GetMapping("/event")
    public String navigateToEventPage(Model model) {
        List<EventModel> eventList = eventService.getAllEvents();
        model.addAttribute("activePage", "event");
        model.addAttribute("eventList", eventList);
        return "event";
    }

    @GetMapping("/event/new")
    public String navigateToNewEventFormPage(Model model) {
        model.addAttribute("event", null);
        model.addAttribute("activePage", "event");
        return "event-form";
    }

    @GetMapping("/event/update/{eventId}")
    public String navigateToUpdateEventFormPage(@PathVariable Integer eventId, Model model) {
        EventModel event = eventService.getEvent(eventId);
        model.addAttribute("activePage", "event");
        model.addAttribute("event", event);
        return "event-form";
    }

    @GetMapping("event/{eventId}")
    public String navigateToViewEventDetailsPage(@PathVariable Integer eventId, Model model) {
        EventModel event = eventService.getEvent(eventId);
        model.addAttribute("event", event);
        model.addAttribute("activePage", "event");
        return "event-detail";
    }

    @PostMapping("/create-event")
    public String createNewEvent(@ModelAttribute EventForm eventForm, Model model) throws ParseException {
        eventService.createNewEvent(eventForm);
        model.addAttribute("activePage", "event");
        return "redirect:/event";
    }

    @PostMapping("/update-event")
    public String updateEvent(@ModelAttribute EventForm eventForm, Model model) throws ParseException {
        eventService.updateEvent(eventForm);
        model.addAttribute("activePage", "event");
        return "redirect:/event/" + eventForm.getEventId().toString();
    }

    @GetMapping("/delete-event/{eventId}")
    public String deleteEvent(@PathVariable Integer eventId, Model model) {
        eventService.deleteEvent(eventId);
        model.addAttribute("activePage", "event");
        return "redirect:/event";
    }

}
