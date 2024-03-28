package dao;

import dao.entities.Student;
import dao.repositories.StudentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import java.util.*;

import java.util.Date;

@SpringBootApplication
public class Td1MappingApplication implements CommandLineRunner {

    @Autowired
    private StudentRepository studentRepository;
    public static void main(String[] args) {
        SpringApplication.run(Td1MappingApplication.class, args);
    }

    @Override
    public void run(String... args) throws Exception {
        Student student1 = new Student(1L,"Rahzaouani",new Date(1999,11,24),"Ra123");
        studentRepository.save(student1);
    }
}
