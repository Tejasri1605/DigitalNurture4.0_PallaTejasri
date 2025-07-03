package com.cognizant.orm_learn.model;

import jakarta.persistence.*;

@Entity
@Table(name = "countries") // 👈 this matches your MySQL table name
public class Country {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "country_id")
    private Long countryId;

    @Column(name = "country_code", nullable = false, unique = true)
    private String countryCode;

    @Column(name = "iso_code", nullable = false)
    private String isoCode;

    @Column(name = "country_name", nullable = false)
    private String countryName;

    @Column(name = "created_at", updatable = false, insertable = false)
    private java.sql.Timestamp createdAt;

    @Column(name = "updated_at", insertable = false)
    private java.sql.Timestamp updatedAt;

    // Getters and setters (or use Lombok @Getter @Setter if configured)
}
