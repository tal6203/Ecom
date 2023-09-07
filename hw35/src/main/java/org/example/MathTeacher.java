package org.example;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;


@Getter
@Setter
@ToString
public class MathTeacher extends Teacher{
    protected int math_skills;
    public MathTeacher(String name, String id_number, int math_skills) {
        super(name, id_number);
        this.math_skills = math_skills;
    }
}
