package com.example.filters.filter.entities;

import javax.persistence.Entity;

@Entity
public class AmountFilterRow extends FilterRow {

    private int argument;

    public AmountFilterRow() {
    }

    public AmountFilterRow(String type, String comparingConditions, Filter filter, int argument) {
        super(type, comparingConditions, filter);
        this.argument = argument;
    }

    public AmountFilterRow(int argument) {
        this.argument = argument;
    }

    public void setArgument(int argument) {
        this.argument = argument;
    }

//    public int getArgument() {
//        return argument;
//    }

    @Override
    public String toString() {
        return "AmountFilterRow{" +
                "argument=" + argument +
                "} " + super.toString();
    }
}
