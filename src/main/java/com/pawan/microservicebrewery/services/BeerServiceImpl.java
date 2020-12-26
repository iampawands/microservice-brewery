package com.pawan.microservicebrewery.services;

import com.pawan.microservicebrewery.web.model.BeerDTO;
import org.springframework.stereotype.Service;

import java.util.UUID;

@Service
public class BeerServiceImpl implements BeerService {
    @Override
    public BeerDTO getBeerById(UUID beerId) {
        return BeerDTO.builder().id(UUID.randomUUID()).beerName("Uchiha Cat").beerStyle("Blue Berries").build();
    }
}
