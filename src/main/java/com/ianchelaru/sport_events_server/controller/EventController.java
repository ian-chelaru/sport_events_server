package com.ianchelaru.sport_events_server.controller;

import com.ianchelaru.sport_events_server.entities.Event;
import com.ianchelaru.sport_events_server.service.EventService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@CrossOrigin
@RequestMapping(value = "/api/events")
public class EventController
{
    private final EventService eventService;

    @Autowired
    public EventController(EventService eventService)
    {
        this.eventService = eventService;
    }

    @PostMapping
    public Event insert(@RequestBody Event event)
    {
        return eventService.insertEvent(event);
    }

    @GetMapping
    public List<Event> getAll()
    {
        return eventService.getAllEvents();
    }

    @PostMapping
    public void update(@RequestBody Event event)
    {
        eventService.updateEvent(event);
    }

    @DeleteMapping
    public void delete(@RequestBody Event event)
    {
        eventService.deleteEvent(event);
    }
}
