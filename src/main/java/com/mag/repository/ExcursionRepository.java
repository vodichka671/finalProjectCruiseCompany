package com.mag.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.mag.entity.Excursion;

public interface ExcursionRepository extends JpaRepository<Excursion, Long> {

}
