package com.ianchelaru.sport_events_server.service;

import com.ianchelaru.sport_events_server.entities.Event;
import com.ianchelaru.sport_events_server.repository.EventRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class EventService
{
    private final EventRepository eventRepository;

    @Autowired
    public EventService(EventRepository eventRepository)
    {
        this.eventRepository = eventRepository;
    }

    public Event insertEvent(Event event)
    {
        return eventRepository.save(event);
    }

    public List<Event> getAllEvents()
    {
        return eventRepository.findAll();
    }

    public void updateEvent(Event event)
    {
        eventRepository.save(event);
    }

    public void deleteEvent(Event event)
    {
        eventRepository.delete(event);
    }
}
