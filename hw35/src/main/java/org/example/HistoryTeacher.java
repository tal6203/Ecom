package org.example;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@ToString
public class HistoryTeacher extends Teacher {
    protected String field_of_profession;

    public HistoryTeacher(String name, String id_number, String field_of_profession) {
        super(name, id_number);
        this.field_of_profession = field_of_profession;
    }
}
