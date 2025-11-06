package com.calasansdev.domain.event;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.time.LocalDateTime;
import java.util.UUID;

@Entity
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Table(name = "event")
public class Event {

    @Id
    @GeneratedValue
    private UUID id;

    private String title;

    private String description;

    private LocalDateTime date;

    private boolean remote;

    @Column(name = "img_url")
    private String imageUrl;

    @Column(name = "event_url")
    private String eventUrl;
}
