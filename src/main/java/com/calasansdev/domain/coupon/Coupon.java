package com.calasansdev.domain.coupon;

import com.calasansdev.domain.event.Event;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.UUID;

@Entity
@Table(name = "coupon")
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
public class Coupon {

    @Id
    @GeneratedValue
    private UUID id;

    private Integer discount;

    private LocalDateTime valid;

    @ManyToOne
    @JoinColumn(name = "event_id")
    private Event event;
}
