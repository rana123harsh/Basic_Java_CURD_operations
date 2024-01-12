package com.student.projectStudent.student.service;


import com.student.projectStudent.student.customExcepton.NotInsertedException;
import com.student.projectStudent.student.customExcepton.StudentNotFoundException;
import com.student.projectStudent.student.entity.Student;
import com.student.projectStudent.student.repo.StudentRepositery;
import com.student.projectStudent.student.studentdto.StudentDto;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.ExceptionHandler;

import java.util.List;
import java.util.Optional;
import java.util.UUID;


@Service
@Slf4j
public class StudentSeviceImpl implements StudentService {

    @Autowired
    StudentRepositery studentRepositery;


    @ExceptionHandler(NotInsertedException.class)
    @Override
    public StudentDto addStudent(StudentDto studentDto) {
        Student student = new Student();
        student.setStudent_id(UUID.randomUUID());
        student.setStudent_name(studentDto.getName());
        student.setStudent_age(studentDto.getAge());
        student.setStudent_address(studentDto.getAddress());
        studentRepositery.save(student);
        return studentDto;
    }

    @Override
    public String deleteStudentByid(UUID student_id) {
        try {
            studentRepositery.deleteByUUID(student_id);
            return "Successfully deleted";
        } catch (Exception e) {
            System.out.println(e.getCause());
            return e.getMessage();
        }

    }

    @Override
    public Student getStudentByid(UUID studentId) {
        try {
            Optional<Student> studentData = studentRepositery.findByUUID(studentId);
            return studentData.orElseThrow(() -> new StudentNotFoundException("Student not found"));

        } catch (Exception e) {
            System.out.println(e.getCause());
            throw new RuntimeException("Error retrieving student", e);

        }
    }

    @Override
    public List<Student> getAllStudent() {
        try {
            return studentRepositery.findAll();
        } catch (Exception e) {
            System.out.println(e.getCause());
            throw new RuntimeException("Error retrieving student", e);

        }

    }

    @Override
    public Student updateStudent(UUID studentId, StudentDto studentDto) {

        Optional<Student> studentData = studentRepositery.findByUUID(studentId);

        return studentData.map(student -> {

            if (studentDto.getName() != null) {
                student.setStudent_name(studentDto.getName());
            }
            if (studentDto.getAge() != 0) {
                student.setStudent_age(studentDto.getAge());
            }
            if (studentDto.getAddress() != null) {
                student.setStudent_address(studentDto.getAddress());
            }

            studentRepositery.save(student);

            return student;


        }).orElseThrow(() -> new RuntimeException("student Not updated"));
    }


}
