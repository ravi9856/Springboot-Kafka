package com.learning.springbootkafka.Controllers;

import lombok.*;
import lombok.extern.slf4j.Slf4j;

@Slf4j
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@ToString
public class Emp {
    private int empID;
    private String name;
    private int salary;
}
