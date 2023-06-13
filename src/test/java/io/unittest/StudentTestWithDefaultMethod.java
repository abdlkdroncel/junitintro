package io.unittest;

import model.CreateDomain;
import model.Student;

public class StudentTestWithDefaultMethod implements CreateDomain<Student> {
    @Override
    public Student createDomain() {
        return new Student("test","test","test");
    }
}
