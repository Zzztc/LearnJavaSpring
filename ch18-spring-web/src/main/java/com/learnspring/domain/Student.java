package com.learnspring.domain;

import lombok.Data;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class Student {
    private Integer stuid;
    private String stuname;
    private Integer stuage;

    @Override
    public String toString() {
        return "Student{" +
                "stuid=" + stuid +
                ", stuname='" + stuname + '\'' +
                ", stuage=" + stuage +
                '}';
    }
}
