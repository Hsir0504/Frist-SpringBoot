package com.dragon.pojo;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

import java.util.Date;

@Data
@ToString
@AllArgsConstructor
@NoArgsConstructor
public class Emp {
    private String id;
    private String name;
    private Double salary;
    private int age;
    private Date bir;
}
