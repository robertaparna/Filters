package com.example.filters.filter.repository;

import com.example.filters.filter.entities.FilterRow;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface FilterRowRepository extends JpaRepository<FilterRow, Integer> {
}
