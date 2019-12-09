package com.ianchelaru.sport_events_server.entities;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;
import java.time.LocalTime;

@Entity
@Getter
@Setter
public class Event
{
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(unique = true, nullable = false)
    private Integer id;

    @Column
    private String name;

    @Column
    private String location;

    @Column
    private LocalTime startTime;

    @Column
    private LocalTime endTime;
}
