package org.la.test.code.model;

import lombok.*;

@Getter
@Setter
@NoArgsConstructor
@ToString
@AllArgsConstructor
public class Employee {
    String name;
    int age;
    double salary;
    long mobile;
}
