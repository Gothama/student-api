package com.example.studentapi;

import org.springframework.web.bind.annotation.*;

@RestController
public class StudentController {
    StudentRepository repository = new InMemoryStudentRepository();

    //REST ENDPOINTS
    //Create student
    @PostMapping("/student")
    public void createStudent(@RequestBody Student student){
        //todo: logic to save student in the data base and return in the database
        repository.save(student);

    }
    //retrive student
    @GetMapping("/student/{id}")
    public Student getStudent(@PathVariable String id){
        return repository.get(id);
    }

    //update

    @PatchMapping  ("/student/update/{id}")
    public void updateStudent(@PathVariable String id , @RequestBody Student student){
        repository.update(id , student);
    }

    //delete
    @DeleteMapping ("/student/delete/{id}")
    public void deleteStudent(@PathVariable String id){
        repository.delete(id);
    }
}
