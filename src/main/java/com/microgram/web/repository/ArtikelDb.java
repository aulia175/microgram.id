package com.microgram.web.repository;


import java.util.List;
import com.microgram.web.model.ArtikelModel;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

public interface ArtikelDb extends JpaRepository<ArtikelModel, Long> {
}
