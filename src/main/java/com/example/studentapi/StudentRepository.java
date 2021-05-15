package com.example.studentapi;

public interface StudentRepository {
    void save(Student student);
    Student get(String id);
    void update(String id, Student student);
    void delete(String id);
}
