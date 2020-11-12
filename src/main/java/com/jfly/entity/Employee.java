package com.jfly.entity;
import lombok.Data;

import java.util.Date;

@Data
public class Employee {
    private int id;
    private String name;
    private Date startDt;
}
