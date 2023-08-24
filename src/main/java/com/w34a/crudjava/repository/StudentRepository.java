package com.w34a.crudjava.repository;

import com.w34a.crudjava.entity.DataStudents;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface StudentRepository extends JpaRepository<DataStudents, Long> {
}
