package com.example.filters.filter.entities;


import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

@Entity
public class Filter {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    private String name;

    public Filter(String name, List<FilterRow> filterRows) {
        this.name = name;
        this.filterRows=filterRows;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @OneToMany(mappedBy = "filter", cascade = CascadeType.ALL)
    private List<FilterRow> filterRows = new ArrayList<>();

    public void setId(int id) {
        this.id = id;
    }

    public Filter() {
    }

    public void setFilterRows(List<FilterRow> filterRows) {
        for (FilterRow filterRow : filterRows) {
            filterRow.setFilter(this);
            this.filterRows.add(filterRow);
        }
    }

    public int getId() {
        return id;
    }

    public List<FilterRow> getFilterRows() {
        return filterRows;
    }

    @Override
    public String toString() {
        return "Filter{" +
                "id=" + id +
                ", filterRows=" + filterRows +
                '}';
    }
}
