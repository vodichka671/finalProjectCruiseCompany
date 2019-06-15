package com.mag.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.mag.entity.TicketTypePrices;

public interface TicketTypesPriceRepository extends JpaRepository<TicketTypePrices, Long> {

}
