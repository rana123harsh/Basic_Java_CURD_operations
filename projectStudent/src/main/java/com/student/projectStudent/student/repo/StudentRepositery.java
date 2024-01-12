package com.student.projectStudent.student.repo;

import com.student.projectStudent.student.entity.Student;
import jakarta.transaction.Transactional;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.Optional;
import java.util.UUID;

@Repository
public interface StudentRepositery extends JpaRepository<Student, Long> {


    @Modifying
    @Transactional
    @Query("DELETE FROM Student s WHERE s.student_id = :uuid")
    void deleteByUUID(UUID uuid);

    @Query("SELECT s FROM Student s WHERE s.student_id = :uuid")
    Optional<Student> findByUUID(UUID uuid);
}