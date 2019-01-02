package com.microgram.web.repository;


import java.util.List;
import com.microgram.web.model.BadgeModel;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

public interface BadgeDb extends JpaRepository<BadgeModel, Long> {
}
