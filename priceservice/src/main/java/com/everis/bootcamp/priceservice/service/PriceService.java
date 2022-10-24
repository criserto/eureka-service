package com.everis.bootcamp.priceservice.service;

import com.everis.bootcamp.priceservice.model.Prices;
import com.everis.bootcamp.priceservice.repository.PriceRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class PriceService {

    private PriceRepository priceRepository;

    public PriceService(PriceRepository priceRepository) {
        this.priceRepository = priceRepository;
    }

    public Prices get(Integer priceId) {
        return priceRepository.findById(priceId).orElse(new Prices());
    }

    public List<Prices> getAllPrices() {
        return priceRepository.findAll();
    }

}
