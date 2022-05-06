package com.example.filters.filter.service;

import com.example.filters.filter.entities.Filter;
import com.example.filters.filter.entities.FilterRow;
import com.example.filters.filter.repository.FilterRepository;
import com.example.filters.filter.repository.FilterRowRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class FilterRowService {

    @Autowired
    private FilterRowRepository filterRowRepository;

    public FilterRow saveFilterRow(FilterRow filterRow) {
        return filterRowRepository.save(filterRow);
    }

    public List<FilterRow> getAllFilterRows() {
        return filterRowRepository.findAll();
    }

}
