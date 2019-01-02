package com.microgram.web.repository;


import java.util.List;
import com.microgram.web.model.EventModel;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

public interface EventDb extends JpaRepository<EventModel, Long> {
}
