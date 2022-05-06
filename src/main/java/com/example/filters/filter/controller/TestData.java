package com.example.filters.filter.controller;

import com.example.filters.filter.entities.AmountFilterRow;
import com.example.filters.filter.entities.DateFilterRow;
import com.example.filters.filter.entities.Filter;
import com.example.filters.filter.entities.FilterRow;
import com.example.filters.filter.repository.FilterRepository;
import com.example.filters.filter.repository.FilterRowRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.context.event.ApplicationReadyEvent;
import org.springframework.context.event.EventListener;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public class TestData {

    @Autowired
    private FilterRepository filterRepository;

    @EventListener
    public void appReady(ApplicationReadyEvent event) {
        if (filterRepository.count() == 0) {
            Filter filter2 = new Filter();
            filter2.setName("filter02");

            FilterRow filterRow21 = new FilterRow();
            filterRow21.setFilter(filter2);
            filterRow21.setComparingConditions("More than");
            filterRow21.setType("Amount");
            filterRow21.setArgument("4");

            FilterRow filterRow22 = new FilterRow();
            filterRow22.setFilter(filter2);
            filterRow22.setComparingConditions("Contains");
            filterRow22.setType("Title");
            filterRow22.setArgument("blue");

            FilterRow filterRow23 = new FilterRow();
            filterRow23.setFilter(filter2);
            filterRow23.setComparingConditions("Before");
            filterRow23.setType("Date");
            filterRow23.setArgument("2022-05-11");

            filter2.setFilterRows(List.of(filterRow21, filterRow22, filterRow23));

            filterRepository.save(filter2);

            Filter filter1 = new Filter();
            filter1.setName("filter01");

            FilterRow filterRow11 = new FilterRow();
            filterRow11.setFilter(filter1);
            filterRow11.setComparingConditions("Less than");
            filterRow11.setType("Amount");
            filterRow11.setArgument("9");

            FilterRow filterRow12 = new FilterRow();
            filterRow12.setFilter(filter1);
            filterRow12.setComparingConditions("Starts with");
            filterRow12.setType("Title");
            filterRow12.setArgument("A");

            FilterRow filterRow13 = new FilterRow();
            filterRow13.setFilter(filter1);
            filterRow13.setComparingConditions("After");
            filterRow13.setType("Date");
            filterRow13.setArgument("2022-08-30");

            filter1.setFilterRows(List.of(filterRow11, filterRow12, filterRow13));

            filterRepository.save(filter1);

        }

    }


}
