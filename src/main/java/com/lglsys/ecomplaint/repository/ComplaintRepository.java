package com.lglsys.ecomplaint.repository;

import com.lglsys.ecomplaint.entities.ComplaintEntity;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ComplaintRepository extends JpaRepository<ComplaintEntity, Integer> {
}
