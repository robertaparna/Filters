package com.example.filters.filter.entities;

import javax.persistence.Entity;
import java.time.LocalDate;

@Entity
public class DateFilterRow extends FilterRow {

    public DateFilterRow() {
    }

    public DateFilterRow(String type, String comparingConditions, Filter filter, LocalDate argument) {
        super(type, comparingConditions, filter);
        this.argument = argument;
    }

    public void setArgument(LocalDate argument) {
        this.argument = argument;
    }

    private LocalDate argument;

//    public LocalDate getArgument() {
//        return argument;
//    }

    @Override
    public String toString() {
        return "DateFilterRow{" +
                "argument=" + argument +
                '}';
    }
}
