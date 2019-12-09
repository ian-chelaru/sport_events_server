package com.ianchelaru.sport_events_server.repository;

import com.ianchelaru.sport_events_server.entities.Event;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface EventRepository extends JpaRepository<Event,Integer>
{
}
