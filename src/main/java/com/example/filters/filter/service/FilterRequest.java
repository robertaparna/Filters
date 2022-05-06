package com.example.filters.filter.service;

import com.example.filters.filter.entities.Filter;
import com.example.filters.filter.entities.FilterRow;

import java.util.List;

public class FilterRequest {

    private Filter filter;

    public FilterRequest(Filter filter) {
        this.filter = filter;
    }

    public FilterRequest() {}

    public Filter getFilter() {
        return filter;
    }

    public void setFilter(Filter filter) {
        this.filter = filter;
    }

    @Override
    public String toString() {
        return "FilterRequest{" +
                "filter=" + filter +
                '}';
    }
}
