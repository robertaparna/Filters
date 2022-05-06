package com.example.filters.filter.entities;

import com.example.filters.filter.entities.Filter;
import com.example.filters.filter.entities.FilterRow;

import javax.persistence.Entity;

@Entity
public class TitleFilterRow extends FilterRow {
    public String argument;


    public TitleFilterRow(String argument) {
        this.argument = argument;
    }

    public TitleFilterRow(String type, String comparingConditions, Filter filter, String argument) {
        super(type, comparingConditions, filter);
        this.argument = argument;
    }

    public void setArgument(String argument) {
        this.argument = argument;
    }

    public TitleFilterRow() {
    }

//    public String getArgument() {
//        return argument;
//    }

    @Override
    public String toString() {
        return "TitleFilterRow{" +
                "argument='" + argument + '\'' +
                "} " + super.toString();
    }
}
