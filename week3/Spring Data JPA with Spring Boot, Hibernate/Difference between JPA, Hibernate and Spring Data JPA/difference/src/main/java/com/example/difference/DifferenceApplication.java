package com.example.difference;

import com.example.difference.entity.Employee;
import com.example.difference.repository.EmployeeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.util.List;

@SpringBootApplication
public class DifferenceApplication implements CommandLineRunner {

    @Autowired
    private EmployeeRepository employeeRepository;

    public static void main(String[] args) {
        SpringApplication.run(DifferenceApplication.class, args);
    }

    @Override
    public void run(String... args) throws Exception {
        System.out.println("==============================================");
        System.out.println("   📊 Spring Data JPA Demo - Employee Records");
        System.out.println("==============================================");

        System.out.println("\n🧹 Cleaning up existing employee records...");
        employeeRepository.deleteAll();

        System.out.println("\n✅ Inserting employee records using `EmployeeRepository.save()`...");
        employeeRepository.save(new Employee("John", "Doe", "john@example.com", 50000.0));
        employeeRepository.save(new Employee("Jane", "Smith", "jane@example.com", 60000.0));
        employeeRepository.save(new Employee("Bob", "Johnson", "bob@example.com", 55000.0));
        employeeRepository.save(new Employee("Alice", "Williams", "alice@example.com", 70000.0));

        System.out.println("\n✅ Listing employees using `EmployeeRepository.findAll()`...");
        List<Employee> employees = employeeRepository.findAll();

        for (Employee emp : employees) {
            System.out.printf("👤 ID: %-3d | Name: %-15s | Email: %-25s | Salary: ₹%.2f%n",
                    emp.getId(),
                    emp.getFirstName() + " " + emp.getLastName(),
                    emp.getEmail(),
                    emp.getSalary());
        }

        System.out.println("\n✅ Spring Data JPA demonstration complete.\n");
    }
}
