package com.microgram.web.repository;


import java.util.List;
import com.microgram.web.model.UserModel;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

public interface UserDb extends JpaRepository<UserModel, Long> {
}
