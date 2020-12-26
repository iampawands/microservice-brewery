package com.pawan.microservicebrewery.services;

import com.pawan.microservicebrewery.web.model.BeerDTO;

import java.util.UUID;

public interface BeerService {
    public BeerDTO getBeerById(UUID beerId);
}
