package com.jfly.entity;

import lombok.Data;
import org.springframework.data.annotation.Id;
import org.springframework.data.relational.core.mapping.Table;

import java.io.Serializable;
import java.time.LocalDate;

@Data
@Table
public class Vehicle implements Serializable {

    private static final long serialVersionUID = 1L;

    @Id
    private Long id;

    private String type;

    private String modelCode;

    private String brandName;

    private LocalDate launchDate;

}