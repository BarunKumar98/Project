package com.project.Repositories;

import com.project.Entities.StudentLead;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface StudentRepository extends JpaRepository<StudentLead,Long> {
}
