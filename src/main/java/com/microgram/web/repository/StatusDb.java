package com.microgram.web.repository;


import java.util.List;
import com.microgram.web.model.StatusModel;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

public interface StatusDb extends JpaRepository<StatusModel, Long> {
}
