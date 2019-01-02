package com.microgram.web.repository;


import java.util.List;
import com.microgram.web.model.CommentModel;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

public interface CommentDb extends JpaRepository<CommentModel, Long> {
}
