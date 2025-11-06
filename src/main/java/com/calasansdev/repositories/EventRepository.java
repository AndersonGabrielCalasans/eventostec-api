package com.calasansdev.repositories;

import com.calasansdev.domain.event.Event;
import io.quarkus.hibernate.orm.panache.PanacheRepositoryBase;

import java.util.UUID;

public interface EventRepository extends PanacheRepositoryBase<Event, UUID> {
}
