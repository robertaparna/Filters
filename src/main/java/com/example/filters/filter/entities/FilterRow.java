package com.example.filters.filter.entities;

import com.example.filters.filter.entities.Filter;

import javax.persistence.*;
import java.io.Serializable;

@Entity
@Inheritance(strategy = InheritanceType.TABLE_PER_CLASS)
public class FilterRow implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.TABLE)
    private int id;
    private String type;
    private String comparingConditions;
    private String argument;

    @ManyToOne
    @JoinColumn(name="filter_id", nullable = false)
    private Filter filter;

    public FilterRow() {

    }

    public String getArgument() {
        return argument;
    }

    public void setArgument(String argument) {
        this.argument = argument;
    }


    public FilterRow(String type, String comparingConditions, Filter filter) {
        this.type = type;
        this.comparingConditions = comparingConditions;
        this.filter = filter;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setType(String type) {
        this.type = type;
    }

    public void setComparingConditions(String comparingConditions) {
        this.comparingConditions = comparingConditions;
    }

    public void setFilter(Filter filter) {
        this.filter = filter;
    }

    public int getId() {
        return id;
    }

    public String getType() {
        return type;
    }

    public String getComparingConditions() {
        return comparingConditions;
    }

    @Override
    public String toString() {
        return "FilterRow{" +
                "id=" + id +
                ", type='" + type + '\'' +
                ", comparingConditions='" + comparingConditions + '\'' +
                '}';
    }
}
