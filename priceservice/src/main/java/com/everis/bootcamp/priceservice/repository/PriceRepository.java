package com.everis.bootcamp.priceservice.repository;

import com.everis.bootcamp.priceservice.model.Prices;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PriceRepository extends JpaRepository<Prices, Integer> {
}