package com.lglsys.ecomplaint.repository;

import com.lglsys.ecomplaint.entities.UserEntity;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<UserEntity, Integer> {
}
