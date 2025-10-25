package com.tradenext.backend.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import com.tradenext.backend.entity.User;

public interface UserRepository extends JpaRepository<User, Long> {
    
}
