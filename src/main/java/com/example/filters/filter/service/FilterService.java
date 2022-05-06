package com.example.filters.filter.service;

import com.example.filters.filter.entities.Filter;
import com.example.filters.filter.repository.FilterRepository;
import com.example.filters.filter.entities.FilterRow;
import com.example.filters.filter.repository.FilterRowRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class FilterService {

    @Autowired
    private FilterRepository filterRepository;

    public Filter saveFilter(Filter filter) {
        return filterRepository.save(filter);
    }

    public List<Filter> getAllFilters() {
        return filterRepository.findAll();
    }

}
