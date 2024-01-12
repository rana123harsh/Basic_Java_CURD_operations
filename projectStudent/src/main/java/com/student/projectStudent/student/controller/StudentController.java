package com.student.projectStudent.student.controller;


import com.student.projectStudent.student.customExcepton.NotInsertedException;
import com.student.projectStudent.student.entity.Student;
import com.student.projectStudent.student.service.StudentService;
import com.student.projectStudent.student.studentdto.StudentDto;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.UUID;

@ControllerAdvice
@RestController
@RequestMapping("/student")
public class StudentController {

    @Autowired
    StudentService studentService;

    @PostMapping("/addstudent")
    public ResponseEntity<StudentDto> addStudent(@RequestBody StudentDto studentDto) throws NotInsertedException {
        try {
            StudentDto studentDtoResponce = studentService.addStudent(studentDto);
            return new ResponseEntity<>(studentDtoResponce, HttpStatus.OK);
        } catch (Exception e) {
            throw new NotInsertedException("Exception in inserting record");


        }

    }


    @GetMapping("/get-student/{student_id}")
    public ResponseEntity<?> getStudentbyid(@PathVariable UUID student_id) {
        try {
            Student student = studentService.getStudentByid(student_id);
            return new ResponseEntity<>(student, HttpStatus.OK);
        } catch (Exception e) {

            return new ResponseEntity<>(e.getMessage(), HttpStatus.EXPECTATION_FAILED);
        }

    }

    @PostMapping("/delete-student/{student_id}")
    public ResponseEntity<String> deleteStudent(@PathVariable UUID student_id) {
        try {
            String message = studentService.deleteStudentByid(student_id);
            return new ResponseEntity<>(message, HttpStatus.OK);
        } catch (Exception e) {

            return new ResponseEntity<>(e.getMessage(), HttpStatus.EXPECTATION_FAILED);
        }

    }

    @GetMapping("/getAll-student")
    public ResponseEntity<?> getStudentbyid() {
        try {
            List<Student> student = studentService.getAllStudent();
            return new ResponseEntity<>(student, HttpStatus.OK);
        } catch (Exception e) {

            return new ResponseEntity<>(e.getMessage(), HttpStatus.EXPECTATION_FAILED);
        }

    }

    @PostMapping("/update-student/{student_id}")
    public ResponseEntity<?> updateStudent(@PathVariable UUID student_id, @RequestBody StudentDto studentDto) {
        try {
            Student student = studentService.updateStudent(student_id, studentDto);
            return new ResponseEntity<>(student, HttpStatus.OK);
        } catch (Exception e) {

            return new ResponseEntity<>(e.getMessage(), HttpStatus.EXPECTATION_FAILED);
        }
    }


}
