package com.example.filters.filter.controller;

import com.example.filters.filter.entities.Filter;
import com.example.filters.filter.entities.FilterRow;
import com.example.filters.filter.service.FilterRequest;
import com.example.filters.filter.service.FilterRowService;
import com.example.filters.filter.service.FilterService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping(path = "/filter")
@CrossOrigin
public class FilterController {

    @Autowired
    private FilterService filterService;

    @Autowired
    private FilterRowService filterRowService;

    @PostMapping("/add")
    public String add(@RequestBody Filter filter) {
        filterService.saveFilter(filter);
        return "New filter is added";
    }

    @GetMapping("/getAll")
    public List<Filter> getAllFilters() {
        return filterService.getAllFilters();
    }
}
