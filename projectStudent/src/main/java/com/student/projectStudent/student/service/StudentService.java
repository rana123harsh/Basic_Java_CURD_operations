package com.student.projectStudent.student.service;

import com.student.projectStudent.student.entity.Student;
import com.student.projectStudent.student.studentdto.StudentDto;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.UUID;

@Service
public interface StudentService {

    StudentDto addStudent(StudentDto studentDto);

    String deleteStudentByid(UUID student_id);

    Student getStudentByid(UUID studentId);

    List<Student> getAllStudent();

    Student updateStudent(UUID studentId, StudentDto studentDto);
}
