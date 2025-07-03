package com.example.difference.demo;

import com.example.difference.entity.Employee;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class HibernateDemo {

    public void hibernateInsert() {
        Configuration cfg = new Configuration().configure()
                .addAnnotatedClass(Employee.class);
        SessionFactory sf = cfg.buildSessionFactory();
        Session session = sf.openSession();
        Transaction tx = session.beginTransaction();

        Employee emp = new Employee();
        emp.setFirstName("Bob");
        emp.setLastName("Smith");
        emp.setEmail("bob@example.com");
        emp.setSalary(75000);

        session.save(emp);
        tx.commit();
        session.close();
    }
}
